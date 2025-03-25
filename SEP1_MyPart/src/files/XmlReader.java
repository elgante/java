package files;

import model.Guest;
import model.Model;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class XmlReader
{
    public static void main(String[] args)

    {
        FileManager fileManager = new FileManager(new Model());// dinamic initialisation.
        // we are calling the constructor FleManager and we are supplying with model argument
        ArrayList<Guest> guests =  new ArrayList<>();
        //call a method on this object and we are assiging the value to guests variable and we aregetting info from fileManager readManuul
        guests =  fileManager.readManual();//assigning the value to guests by calling a method on the file manager
        // pbject which returns an array list of type guest there for

        System.out.println(guests.toString());






       /* DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try
        {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("readGuestList.xml");
            NodeList personList = doc.getElementsByTagName("guest");
            for(int i=0; i<personList.getLength();i++)
            {
                Node p = personList.item(i);
                if (p.getNodeType()==Node.ELEMENT_NODE)
                {
                    Element guest = (Element) p;
                    String id = guest.getAttribute("id");
                    NodeList nameList = guest.getChildNodes();
                    for(int j=0; j< nameList.getLength(); j++)
                    {
                        Node n = nameList.item(j);
                        if(n.getNodeType()==Node.ELEMENT_NODE)
                        {
                            Element name = (Element) n;
                            System.out.println("guest"+id+":"+" "+name.getTagName()+" "+"="+" "+name.getTextContent());
                        }
                    }

                }

            }
        } catch (ParserConfigurationException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } catch (SAXException e)
        {
            e.printStackTrace();
        }
    }
//gives errors
       /* try
        {
            File xmlDoc = new File("readGuestList");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlDoc);

            //reads root element
           System.out.print("Root element: "+ doc.getDocumentElement().getNodeName());

           //reads all guests
            NodeList nList = doc.getElementsByTagName("guest");
            for(int i=0; i< nList.getLength(); i++ )
            {
              Node nNode = nList.item(i);
              System.out.println("Node name: "+ nNode.getNodeName()+" "+(i+1));
              if(nNode.getNodeType() == Node.ELEMENT_NODE)
              {
                  Element eElement = (Element) nNode;
                  System.out.println("Guest first name: "+eElement.getElementsByTagName("firstName"));
                  System.out.println("Guest last name: "+eElement.getElementsByTagName("lastName"));
                  System.out.println("Guests phone: "+ eElement.getElementsByTagName("phone"));
                  System.out.println("Guests email: "+ eElement.getElementsByTagName("email"));

              }
            }




        } catch (ParserConfigurationException | SAXException | IOException e)
        {
            e.printStackTrace();
        }
    }*/
    }
}
