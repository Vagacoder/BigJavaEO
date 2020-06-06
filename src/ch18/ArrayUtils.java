package ch18;

import java.lang.reflect.Array;
import java.util.ArrayList;

import ch10.*;

/*
 * E18.15 Provide a static method void append(ArrayList<T> a, ArrayList<T> b) 
 * that appends the elements of b to a.
 * 
 * E18.6  Modify the method of Exercise E18.15 so that the second array list can 
 * contain elements of a subclass. For example, if people is an ArrayList<Person> 
 * and students is an ArrayList<Student>, then append(people, students) should 
 * compile but append(students, people) should not.
 * 
 * E18.18 Modify the method of Exercise E18.17 so that it receives and returns 
 * arrays, not array lists. Hint: Arrays.copyOf.

 */
public class ArrayUtils {

	public static <T extends Measurable> double average(T[] array) {

		double sum = 0;
		for (T element : array) {
			sum += element.getMeasure();
		}

		return sum / array.length;

	}

	public static <T extends Measurable> double min(T[] array) {

		double min = array[0].getMeasure();

		for (T element : array) {
			if (element.getMeasure() < min) {
				min = element.getMeasure();
			}
		}
		return min;
	}

	// * E18.15, E18.16
	public static <T, S extends T> ArrayList<T> append(ArrayList<T> a, ArrayList<S> b) {
		ArrayList<T> result = new ArrayList<>();
		for (T e : a) {
			result.add(e);
		}
		for (T e : b) {
			result.add(e);
		}
		return result;
	}

	// * E18.18, solution 1: use Object[] then cast to T[]
	public static <T> T[] append1(T[]a, T[]b){
		T[] result = (T[]) new Object[a.length + b.length];

		for(int i = 0; i < a.length; i++){
			result[i] = a[i];
		}

		for(int i = 0; i < b.length; i++){
			result[a.length+i] = b[i];
		}

		return result;
	}

	// * E18.18, solution 2: use reflection
	public static <T> T[] append2(T[]a, T[]b){
		Class arrayClass = a.getClass();
		Class elementClass = arrayClass.getComponentType();
		T[] result = (T[]) Array.newInstance(elementClass, a.length+b.length);
		
		for(int i = 0; i < a.length; i++){
			result[i] = a[i];
		}

		for(int i = 0; i < b.length; i++){
			result[a.length+i] = b[i];
		}

		return result;
	}


	public static void main(String[] args){
		ArrayList<Person> p = new ArrayList<>();
		p.add(new Person("Alex"));
		p.add(new Person("Bob"));
		ArrayList<Student> s = new ArrayList<>();
		s.add(new Student("Nacy", "English"));
		s.add(new Student("Mary", "History"));
		ArrayList<Person> ps = append(p, s);
		System.out.println(p);
		System.out.println(s);
		System.out.println(ps);
	}
}
