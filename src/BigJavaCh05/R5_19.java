package BigJavaCh05;

import java.util.*;

public class R5_19 {
	
	public static void main(String[] args) {
		
		int score = 0;
		String grade = "";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the score: ");
		if (in.hasNextInt()) {score = in.nextInt();}
		else {System.out.println("Wrong input!");}
		
		
		if (score >=90 && score <= 100) {grade = "A";}
		else if (score >= 80 && score <= 89) {grade = "B";}
		else if (score >= 70 && score <= 79) {grade = "C";}
		else if (score >= 60 && score <= 69) {grade = "D";}
		else if (score < 60 && score >=0) {grade = "F";}
		else {grade = "Score out of range";}
		
		if (!grade.equals("Score out of range"))
		{System.out.printf("Your grade is %s", grade);}
		else {System.out.println(grade);}
	}
	
}
