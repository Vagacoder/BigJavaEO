package cs105final;

public class VowelTester {

	public static void main(String[] args) {

		String str = "We are here, we are students, we are in Exam.";
		Vowel v1 = new Vowel();

		int num1[] = v1.VowelCount(str, "E", "e", "A", "a", "i");
		for (int i : num1) {
			System.out.println(i);
		}

	}

}
