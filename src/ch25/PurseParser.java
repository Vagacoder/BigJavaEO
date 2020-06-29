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
 * E25.1 Write a program that can read XML files, such as

<purse>
    <coin>
        <value>0.5</value>
        <name>half dollar</name>
    </coin>
. . .
</purse>

 * Your program should construct a Purse object and print the total value of the 
 * coins in the purse.
 * 
 * E25.2 Building on Exercise E25.1, make the program read an XML file as described 
 * in that exercise. Then print an XML file of the form
<purse>
    <coins>
        <coin>
            <value>0.5</value>
            <name>half dollar</name>
        </coin>
        <quantity>3</quantity>
    </coins>
    <coins>
        <coin>
            <value>0.25</value>
            <name>quarter</name>
        </coin>
        <quantity>2</quantity>
    </coins>
</purse>

 * 
 */

public class PurseParser {

    // private DocumentBuilder builder;
    private Document pdoc;

    public PurseParser(String filename) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        if (filename.length() == 0) {
            filename = "data/purse.xml";
        }
        File pfile = new File(filename);
        this.pdoc = builder.parse(pfile);
    }

    // * E25.1
    public double totalCoin() throws XPathExpressionException {
        XPathFactory xpf = XPathFactory.newInstance();
        XPath xp = xpf.newXPath();

        int coinCount = Integer.parseInt(xp.evaluate("count(/purse/coin)", pdoc));
        double totalAmount = 0.0;
        for(int i = 1; i <= coinCount; i++){
            double amount = Double.parseDouble(xp.evaluate("/purse/coin[" + i + "]/value", pdoc));
            System.out.println(amount);
            totalAmount += amount;
        }
        return totalAmount;
    }

    // * E25.2
    public void printXml() throws XPathExpressionException {
        XPathFactory xpf = XPathFactory.newInstance();
        XPath xp = xpf.newXPath();

        int coinCount = Integer.parseInt(xp.evaluate("count(/purse/coin)", pdoc));
        for(int i = 1; i <= coinCount; i++){
            double amount = Double.parseDouble(xp.evaluate("/purse/coin[" + i + "]/value", pdoc));
            System.out.println(amount);
        }
    }

    public static void main(String[] args){
        PurseParser p;
        try {
            p = new PurseParser("");
            System.out.println(p.totalCoin());

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}