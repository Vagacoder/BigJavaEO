package ch14;

// E14.16 a class of person which implements Comparable interface, compare the age of person objects.

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private int SSN;

    public Person(String name, int age, int SSN) {
	this.name = name;
	this.age = age;
	this.SSN = SSN;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public int getSSN() {
	return SSN;
    }

    @Override
    public int compareTo(Person p) {

	return Integer.compare(this.getAge(), p.getAge());
    }

}
