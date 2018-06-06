package ch11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

	private ArrayList<BankAccount> accounts;

	public Bank() {

	}

	public void readFile(String fileName) {
		List<String> wholeFile;
		int tryCount = 0;
		boolean done = false;
		while (tryCount < 1 && !done) {
			try {
				wholeFile = Files.readAllLines(Paths.get(fileName));

				for (String line : wholeFile) {
					String[] lineSplits = line.split(" ");
					
					if (lineSplits.length != 2) {
						throw new IOException();
					}
					
					String accountNumber = lineSplits[0].trim();
					String balance = lineSplits[1].trim();
					BankAccount newAccount = new BankAccount(Integer.parseInt(accountNumber));
					newAccount.deposit(Double.parseDouble(balance));
					accounts.add(newAccount);
				}
				System.out.println("File read successful!");
				done = true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("File read failed, please input file name: ");
				Scanner in = new Scanner(System.in);
				fileName = in.next();
				in.close();
				tryCount++;
			}
		}
	}

	public void read() {

	}
}
