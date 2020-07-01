package ch25;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/*
 * E25.4  Write a program that can read XML files, such as
<bank>
    <account>
        <number>3</number>
        <balance>1295.32</balance>
    </account>
. . .
</bank>

 * Your program should construct a Bank object and print the total value of the 
 * balances in the accounts.
 * 
 * E25.5 Repeat Exercise E25.4, using a DTD for validation.
 */
public class BankParse {

    private Document bdoc;
    private Bank bank;

    public BankParse(String filename) throws ParserConfigurationException, SAXException, IOException {
        this.bank = new Bank();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setValidating(true);
        DocumentBuilder builder = dbf.newDocumentBuilder();

        if (filename.length() == 0) {
            filename = "data/bank.xml";
        }

        File bfile = new File(filename);
        this.bdoc = builder.parse(bfile);
    }

    public Bank getBank() throws NumberFormatException, XPathExpressionException {

        XPathFactory xpf = XPathFactory.newInstance();
        XPath xp = xpf.newXPath();

        int numberOfAccounts = Integer.parseInt(xp.evaluate("count(/bank/account)", this.bdoc));

        for(int i = 1; i <= numberOfAccounts; i++){
            int number = Integer.parseInt(xp.evaluate("/bank/account[" + i +
            "]/number", bdoc));
            double balance = Double.parseDouble(xp.evaluate("/bank/account[" + i +
            "]/balance", bdoc));
            this.bank.addAccount(new Account(number, balance));
        }
        return this.bank;
    }


    public static void main(String[] args) throws Exception {
        BankParse bp = new BankParse("");
        Bank bank = bp.getBank();
        double totalBalance = 0.0;
        for(int i = 0; i < bank.accounts.size();i++){
            totalBalance+=bank.accounts.get(i).balance;
        }
        System.out.println(totalBalance);
    }
    
}