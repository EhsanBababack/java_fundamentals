
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.filter.Filters;
import org.jdom2.input.DOMBuilder;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    private static Document getDOMParsedDocument(final String fileName) {
        Document document = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//If want to make namespace aware.
//factory.setNamespaceAware(true);
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            org.w3c.dom.Document w3cDocument = documentBuilder.parse(fileName);
            document = new DOMBuilder().build(w3cDocument);
        } catch (IOException | SAXException | ParserConfigurationException e) {
            e.printStackTrace();
        }
        return document;
    }


    private static void readBookNode(Element bookNode) {
//Employee Id
        System.out.println("category : " +
                bookNode.getAttributeValue("category") + ",    title:" + bookNode.getChildText("title"));
    }

    public static void main(String[] args) {


        Document doc = getDOMParsedDocument("books.xml");
        Element rootNode = doc.getRootElement();
        System.out.println("Root Element :: " + rootNode.getName());
        rootNode.getChildren("book").forEach(Main::readBookNode);


        XPathFactory xpfac = XPathFactory.instance();
        XPathExpression<Element> xPathA = xpfac.compile("//bookstore/book[price>35.00]/title", Filters.element());
        for (Element el : xPathA.evaluate(doc)) {
            System.out.println("Book title :: " + el.getValue());
        }

    }
}