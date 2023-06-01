package lesson22;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.jar.JarEntry;

public class DomParserExample {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            final Document document = builder.parse(new File("C:/repo/resources/Test.xml"));
            final NodeList childNotes = document.getChildNodes();
            for (int i  = 0; i < childNotes.getLength(); i++ ) {
                final Node item = childNotes.item(i);
                System.out.println(childNotes.item(i).getNodeName() + ":" + childNotes.item(i).getTextContent());
                System.out.println(item.getAttributes().getNamedItem("id").getTextContent());
            }

        } catch (ParserConfigurationException|IOException|SAXException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}
