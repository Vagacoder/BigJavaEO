package ch25;

import java.util.ArrayList;

/*
* P25.4 Write a document builder that turns an invoice object, as defined in 
* Chapter 12, into an XML file of the format described in How To 25.2
* 
* P25.5 Modify Exercise P25.4 to support separate shipping and billing addresses.
* 
*/

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

import ch12.Address;
import ch12.Product;

public class InvoiceParser {

    private DocumentBuilder builder;
    private Document invDoc;

    public InvoiceParser() throws ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        this.builder = dbf.newDocumentBuilder();
    }

    public Document build(ArrayList<Product> items, Address billingAddress, Address shippingAddress) {
        this.invDoc = this.builder.newDocument();
        Element invoice = invDoc.createElement("invoice");
        invDoc.appendChild(invoice);
        invoice.appendChild(createItems(items));
        invoice.appendChild(createBillingAddress(billingAddress));
        if(shippingAddress != null){
            invoice.appendChild(createShippingAddress(shippingAddress));
        }else{
            invoice.appendChild(createShippingAddress(billingAddress));
        }

        return this.invDoc;
    }

    private Element createItems(ArrayList<Product> items) {
        Element el = this.invDoc.createElement("items");

        for (Product item : items) {
            el.appendChild(createItem(item));
        }

        return el;
    }

    private Element createItem(Product item) {
        Element el = this.invDoc.createElement("item");

        el.appendChild(createTextElement("description", item.getDescription()));
        el.appendChild(createTextElement("price", "" + item.getPrice()));

        return el;
    }

    private Element createTextElement(String name, String text) {
        Element el = invDoc.createElement(name);
        Text t = invDoc.createTextNode(text);
        el.appendChild(t);
        return el;
    }

    private Element createBillingAddress(Address billingAddress){
        Element el = this.invDoc.createElement("billing_address");
        el.appendChild(createTextElement("name", billingAddress.getName()));
        el.appendChild(createTextElement("street", billingAddress.getStreet()));
        el.appendChild(createTextElement("city", billingAddress.getCity()));
        el.appendChild(createTextElement("state", billingAddress.getState()));
        el.appendChild(createTextElement("zip", billingAddress.getZip()));
        return el;
    }


    private Element createShippingAddress(Address shippingAddress){
        Element el = this.invDoc.createElement("shipping_address");
        el.appendChild(createTextElement("name", shippingAddress.getName()));
        el.appendChild(createTextElement("street", shippingAddress.getStreet()));
        el.appendChild(createTextElement("city", shippingAddress.getCity()));
        el.appendChild(createTextElement("state", shippingAddress.getState()));
        el.appendChild(createTextElement("zip", shippingAddress.getZip()));
        return el;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Product> items = new ArrayList<>();
        items.add(new Product("Vaccum", 43.0f));
        items.add(new Product("Broom", 3.50f));
        Address billing = new Address("Alex", "110 main street", "Boston", "MA", "80001");

        InvoiceParser invoiceBuilder = new InvoiceParser();
        Document doc = invoiceBuilder.build(items, billing, null);

        DOMImplementation impl = doc.getImplementation();
        DOMImplementationLS implLS 
              = (DOMImplementationLS) impl.getFeature("LS", "3.0");
        LSSerializer ser = implLS.createLSSerializer();
        String out = ser.writeToString(doc);      
        
        System.out.println(out);

    }
}