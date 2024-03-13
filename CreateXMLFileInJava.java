import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class CreateXMLFileInJava {
    public static void main(String[] args) {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // add elements to Document
            Element rootElement = doc.createElement("bill");
            // append root element to document
            doc.appendChild(rootElement);

            rootElement.appendChild(createUserElements(doc, rootElement, "label", "Bill_Q1"));

            rootElement.appendChild(createUserElements(doc, rootElement, "iv", "W3GOHYcmuwPSlg713erzJw=="));

            rootElement.appendChild(createUserElements(doc, rootElement, "body", "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"));

            // for output to file, console
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            // for pretty print
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); 
            DOMSource source = new DOMSource(doc);

            // write to console or file
            StreamResult console = new StreamResult(System.out);
            StreamResult fileout = new StreamResult(new File("create_users.xml"));

            // write data
            transformer.transform(source, console);
            transformer.transform(source, fileout);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // utility method to create text node
    private static Node createUserElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }
}