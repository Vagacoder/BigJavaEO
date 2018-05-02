package BigJavaCh08;

import java.util.Scanner;

public class LoginForm {

	private String inputUserName;
	private String inputPassWord;
	private String userName;
	private String passWord;
	private boolean logIn;

	public LoginForm(String name, String pass) {

		userName = name;
		passWord = pass;
		logIn = false;

	}

	public void input(String text) {

		if (!logIn) {
			Scanner in = new Scanner(System.in);
			String input = in.next();
			if (inputUserName.equals("")) {
				inputUserName = input;
			} else {
				inputPassWord = input;
			}
			in.close();
		} else {
			System.out.println("Already logged in, no need input any more.");
		}
	}

	public void click(String button) {

		if (button.equals("Submit")) {
			if (inputUserName.equals(userName) && inputPassWord.equals(passWord)) {
				logIn = true;
			} else {
				inputUserName = "";
				inputPassWord = "";
			}
		} else if (button.equals("reset")) {
			inputUserName = "";
			inputPassWord = "";
		}
	}

	public boolean loggedIn() {
		return logIn;
	}
}
