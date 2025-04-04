import javax.swing.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.*;

public class XMLManager {
    private DefaultListModel<String> listModel;
    private List<Element> xmlElements;

    public XMLManager() {
        listModel = new DefaultListModel<>();
        xmlElements = new ArrayList<>();
    }

    // Thêm thẻ XML mới
    public void addElement(String tagName, String content) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element element = doc.createElement(tagName);
            element.setTextContent(content);
            xmlElements.add(element);
            listModel.addElement("Tag: " + tagName + " Content: " + content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Hiển thị danh sách thẻ XML
    public DefaultListModel<String> getListModel() {
        return listModel;
    }

    // Tạo tệp XML từ danh sách thẻ
    public void saveToFile(String fileName) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element root = doc.createElement("root");
            doc.appendChild(root);
            
            for (Element e : xmlElements) {
                root.appendChild(e);
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(fileName));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Đọc tệp XML và hiển thị nội dung
    public void readFromFile(String fileName) {
        try {
            File file = new File(fileName);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("*");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    listModel.addElement("Tag: " + element.getTagName() + " Content: " + element.getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
