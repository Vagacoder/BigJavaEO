package ch24;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/* 
 * P24.1 Write a Java program that uses a library database of books and patron 
 * data, as described in Exercise R24.2. Patrons should be able to check out and 
 * return books. 
 * Supply commands to print the books that a patron has checked out and to find 
 * who has checked out a particular book. Create and populate Patron and Book 
 * tables before running the program.
 * 
 */

public class Library {

    public static void main(String[] args) {

        String configFilename = "ch24/database.properties";

        try {
            SimpleDataSource.init(configFilename);

            try (Connection conn = SimpleDataSource.getConnection(); Statement state = conn.createStatement();) {

                System.out.println("Create tables ...");
                // * create tables
                // state.execute("create table books (ISBN varchar(30), author varchar(40),
                // title varchar(20), bookid integer, patron_id integer)");
                // state.execute("create table patron (patron_id integer, name varchar(20),
                // address varchar(40))");

                System.out.println("Insert data");
                // * insert books
                // state.execute("insert into books values('BBN112233', 'Alex', 'Algebra', 1, 10001)");
                // state.execute("insert into books values('CD88888', 'Bob Smith', 'Biology Intro', 2, -1)");
                // state.execute("insert into books values('XX98765', 'Cindy Clymore','Chemistry', 3, -1)");
                // state.execute("insert into books values('ABC00011', 'Bob Smith', 'Biology Intro', 4, 10002)");
                // state.execute("insert into books values('ABC00011', 'Dave Johson', 'Digital Paiting', 5, 10001)");
                // state.execute("insert into books values('ABC00011', 'Dave Johson', 'Digital Paiting', 6, 10003)");

                // * insert patrons
                // state.execute("insert into patron values(10001, 'Winston Churchill', '100
                // Downing Street, London, UK')");
                // state.execute("insert into patron values(10002, 'Frankclin Rossevot', 'White
                // houtse, Washington D.C. USA')");
                // state.execute("insert into patron values(10003, 'Stalin Josef', 'Cremlin,
                // Moscow, USSR')");

                // if(hasResultSet){
                // ResultSet result = state.getResultSet();
                // while(result.next()){
                // for(int i = 1; i <= result.getMetaData().getColumnCount();i++){
                // System.out.print(result.getString(i) + ", ");
                // }
                // System.out.println();
                // }
                // }

                Scanner keyIn = new Scanner(System.in);
                String input = "Q";
                do {
                    System.out.println("Patron (P), Book (B) or Quit (Q)");
                    input = keyIn.nextLine();

                    if (input.equalsIgnoreCase("P")) {

                        System.out.print("Patron number: ");
                        String patronNumber = keyIn.nextLine();
                        PreparedStatement pstate = conn.prepareStatement(
                                "select title, bookid, name from books, patron where books.patron_id = patron.patron_id and patron.patron_id = ?");
                        pstate.setInt(1, Integer.parseInt(patronNumber));
                        ResultSet result = pstate.executeQuery();
                        while (result.next()) {
                            for (int i = 1; i <= result.getMetaData().getColumnCount(); i++) {
                                System.out.print(result.getString(i) + ", ");
                            }
                            System.out.println();
                        }

                    } else if (input.equalsIgnoreCase("B")) {

                        System.out.print("Book id: ");
                        String bookId = keyIn.nextLine();
                        PreparedStatement pstate = conn.prepareStatement(
                                "select patron.patron_id, name from patron, books where patron.patron_id=books.patron_id and bookid=?");
                        pstate.setString(1, bookId);
                        ResultSet result = pstate.executeQuery();
                        if (!result.next()) {
                            System.out.println("Not Checked");
                        } else {

                            do {
                                for (int i = 1; i <= result.getMetaData().getColumnCount(); i++) {
                                    System.out.print(result.getString(i) + ", ");
                                }
                                System.out.println();
                            } while (result.next());
                        }

                    } else if (input.equalsIgnoreCase("Q")) {

                    } else {
                        System.out.println("Please input P/B/Q");
                    }
                } while (!input.equalsIgnoreCase("Q"));

                keyIn.close();
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Error loading database driver");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error loading database properties file");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error");
            e.printStackTrace();
        }

    }

}