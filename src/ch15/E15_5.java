package ch15;

// E15.5

public class E15_5 {

	public static void main(String[] args) {

		FindJavaIdentifier fji = new FindJavaIdentifier();
		fji.importJavaFile("./src/ch15/Calculator.java");
		fji.printAllIdLInes();

	}

}
