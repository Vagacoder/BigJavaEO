
package BigJavaCh11;

import java.io.*;
import java.util.*;

public class E11_6 {

    public static void main(String[] args) throws FileNotFoundException {

	File inputData = new File("data.txt");
	Scanner in = new Scanner(inputData);

	ArrayList<Double> list1 = new ArrayList<Double>();
	ArrayList<Double> list2 = new ArrayList<Double>();

	while (in.hasNextLine()) {
	    String line = in.nextLine();
	    System.out.println(line);
	    Scanner lineInput = new Scanner(line);

	    double number1 = lineInput.nextDouble();
	    System.out.println(number1);
	    double number2 = lineInput.nextDouble();
	    System.out.println(number2);

	    lineInput.close();

	    list1.add(number1);
	    list2.add(number2);

	}

	double sum1 = 0;
	for (double i : list1) {
	    sum1 += i;
	}
	double average1 = sum1 / list1.size();
	System.out.printf("The average of col1 is: %.2f\n", average1);

	double sum2 = 0;
	for (double i : list2) {
	    sum2 += i;
	}
	double average2 = sum2 / list2.size();
	System.out.printf("The average of col2 is: %.2f\n", average2);
	in.close();

    }

}
