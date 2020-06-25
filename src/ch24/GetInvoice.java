package ch24;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
 * E24.4  make the columns of the output line up. 
 * Hint: Use the getColumnDisplaySize method of the ResultSetMetaData class.
 * 
 * E24.5  Write a Java program that uses the database tables from the invoice 
 * database in Section 24.2. Prompt the user for an invoice number and print out
 *  the invoice, format­ted as in Chapter 12.
 * 

 */
public class GetInvoice {

    public static void main(String[] args) throws Exception {

        String configFilename = "ch24/database.properties";
        SimpleDataSource.init(configFilename);

        Scanner keyIn = new Scanner(System.in);
        System.out.println("Please enter invoice number:");

        try (Connection con = SimpleDataSource.getConnection();
            Statement state = con.createStatement()) {
            while (keyIn.hasNextLine()) {
                String input = keyIn.nextLine();
                if(input.equalsIgnoreCase("quit")){
                    break;
                }

                String query = "select * from invoice where invoice_number=?";
                PreparedStatement queryState = con.prepareStatement(query);
                queryState.setString(1, input);
                // boolean hasResult = state.execute(query);
                // if(hasResult){
                //     ResultSet result = state.getResultSet();
                //     System.out.println(result.getMetaData().getColumnCount());
                // }
                ResultSet result = queryState.executeQuery();
                int colNumber = result.getMetaData().getColumnCount();
                System.out.printf("Column number: %d\n",colNumber);

                String printLine ="";
                for(int i = 0; i < colNumber; i++){
                    String colName = result.getMetaData().getColumnName(i+1);
                    System.out.printf("%s\t", colName);
                    if(colName.equalsIgnoreCase("payment")){
                        printLine = printLine + "%" + result.getMetaData().getColumnDisplaySize(i+1) + ".2f";  
                    }else{
                        printLine = printLine + "%" + result.getMetaData().getColumnDisplaySize(i+1) + "d";
                    }
                }
                printLine += "\n";
                System.out.println();

                while(result.next()){
                    System.out.printf(printLine, result.getInt(1), result.getInt(2), result.getFloat(3));
                }
            }
        }

        keyIn.close();
    }

}