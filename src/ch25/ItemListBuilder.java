package ch25;

import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
   Builds a DOM document for an array list of items.
*/
public class ItemListBuilder
{
   private DocumentBuilder builder;
   private Document doc;

   /**
      Constructs an item list builder.
   */
   public ItemListBuilder() 
         throws ParserConfigurationException
   {
      DocumentBuilderFactory factory 
            = DocumentBuilderFactory.newInstance();
      builder = factory.newDocumentBuilder();
   }

   /**
      Builds a DOM document for an array list of items.
      @param items the items
      @return a DOM document describing the items
   */
   public Document build(ArrayList<LineItemX> items)
   {
      doc = builder.newDocument();
      doc.appendChild(createItems(items));
      return doc;
   }

   /**
      Builds a DOM element for an array list of items.
      @param items the items
      @return a DOM element describing the items
   */      
   private Element createItems(ArrayList<LineItemX> items)
   {      
      Element e = doc.createElement("items");

      for (LineItemX anItem : items)
      {
         e.appendChild(createItem(anItem));
      }

      return e;
   }

   /**
      Builds a DOM element for an item.
      @param anItem the item
      @return a DOM element describing the item
   */
   private Element createItem(LineItemX anItem)
   {      
      Element e = doc.createElement("item");

      e.appendChild(createProduct(anItem.getProduct()));
      e.appendChild(createTextElement(
            "quantity", "" + anItem.getQuantity()));

      return e;
   }

   /**
      Builds a DOM element for a product.
      @param p the product
      @return a DOM element describing the product
   */
   private Element createProduct(Product p)
   {
      Element e = doc.createElement("product");

      e.appendChild(createTextElement(
            "description", p.getDescription()));
      e.appendChild(createTextElement(
            "price", "" + p.getPrice()));

      return e;
   }

   private Element createTextElement(String name, String text)
   {
      Text t = doc.createTextNode(text);
      Element e = doc.createElement(name);
      e.appendChild(t);
      return e;
   }
}
