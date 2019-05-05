/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparsing;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author My Pc
 */
public class XmlParsing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
            //File file = new File("food.xml"); 
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      
            DocumentBuilder builder =factory.newDocumentBuilder();
            
            Document doc = builder.parse("./Food.xml");
            System.out.println(doc);
              NodeList foodList = doc.getElementsByTagName("food");
                //Element elements = (Element)food;
              
                for (int i = 0; i < foodList.getLength(); i++) {
                    Node food = foodList.item(i);
                    
                    if(food.getNodeType()==Node.ELEMENT_NODE){
                         Element f = (Element)food;
                         NodeList foodNodeList = f.getChildNodes();
                         
                         for (int j = 0; j < foodNodeList.getLength(); j++) {
                            Node n = foodNodeList.item(j);
                            
                            if(n.getNodeType()==Node.ELEMENT_NODE){
                              Element el = (Element)n;
                              System.out.println(el.getTextContent());
                            }
                        }
                    }
                 
                }
         
    }
    
}
