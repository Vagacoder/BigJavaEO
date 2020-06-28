package ch25;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
   An XML parser for item lists
*/
public class ItemListParser
{
   private DocumentBuilder builder;
   private XPath path;

   /**
      Constructs a parser that can parse item lists.
   */
   public ItemListParser() 
         throws ParserConfigurationException
   {
      DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
      builder = dbfactory.newDocumentBuilder();
      
      XPathFactory xpfactory = XPathFactory.newInstance();
      path = xpfactory.newXPath();
   }

   /**
      Parses an XML file containing an item list.
      @param fileName the name of the file
      @return an array list containing all items in the XML file
   */
   public ArrayList<LineItem> parse(String fileName) 
      throws SAXException, IOException, XPathExpressionException
   {
      File f = new File(fileName);
      Document doc = builder.parse(f);

      ArrayList<LineItem> items = new ArrayList<>();
      int itemCount = Integer.parseInt(path.evaluate(
            "count(/items/item)", doc));
      for (int i = 1; i <= itemCount; i++)
      {
         String description = path.evaluate(
               "/items/item[" + i + "]/product/description", doc);
         double price = Double.parseDouble(path.evaluate(
               "/items/item[" + i + "]/product/price", doc));
         Product pr = new Product(description, price);
         int quantity = Integer.parseInt(path.evaluate(
               "/items/item[" + i + "]/quantity", doc));
         LineItem it = new LineItem(pr, quantity);
         items.add(it);
      }
      return items;
   }
}









