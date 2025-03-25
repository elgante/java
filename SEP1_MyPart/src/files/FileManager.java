package files;

import model.Guest;
import model.Model;
import parser.ParserException;
import parser.XmlJsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager
{
    private Model model;

    private XmlJsonParser parser;//jaSon alone gives errors

    public FileManager(Model model)
    {
        this.model = model;
        parser = new XmlJsonParser();

    }

    public void saveGuest(Guest guest)
    {
        File guestFile = null;
        try
        {
            guestFile = parser.toXml(model.getGuests(), "guestList.xml");
        } catch (ParserException e)
        {
            e.printStackTrace();
        }
        //JSon ends//

    }

    // manuel xml code was added as JSon wasnt working properly
    public void saveManual()
    {
        File file = new File("guestList.xml");
        PrintWriter out = null;
        try
        {
            out = new PrintWriter(file);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        ArrayList<Guest> guests = model.getGuests();

        String xml = "";
        xml += "<?xml version=\"1.0\" encoding=\"UTF-8\""
                + "standalone=\"no\"?>\n";
        xml += "\n<GuestList>";

        for (int i = 0; i < guests.size(); i++)
        {
            xml += "\n  <Guest>";

            xml += "\n      <firstName>" + guests.get(i).getFirstName() + "</firstName>";
            xml += "\n      <lastName>" + guests.get(i).getLastName() + "</lastName>";
            xml += "\n      <phone>" + guests.get(i).getPhone() + "</phone>";
            xml += "\n      <email>" + guests.get(i).getEmail() + "</email>";

            xml += "\n  </Guest>";
        }

        xml += "\n</GuestList>";
        out.write(xml);
        out.close();

    }
    //xml reader
    public ArrayList<Guest> readManual()
    //returning the guest list ArrayList<Guest> is a type
    // whats the purpose of the mothod who will use it and how will you use it
    {
        File file2 = null;
        Scanner in = null;

        try
        {
            file2 = new File("guestList.xml");
            in = new Scanner(file2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        ArrayList<Guest> anotherList = new ArrayList<>();
        String firstName = "";
        String lastName = "";
        int phone  = 0;
        String email = "";
        while(in.hasNext())
        {

            String line = in.nextLine();

            if (line.contains("<firstName>"))
            {
                line = line.replace("<firstName>", "");
                line = line.replace( "</firstName>", "");
                firstName = line.trim();
            }
            else if (line.contains("<lastName>"))
            {
                line = line.replace("<lastName>", "");
                line = line.replace( "</lastName>", "");
                lastName = line.trim();
            }
            else if (line.contains("<phone>"))
            {
                line = line.replace("<phone>", "");
                line = line.replace( "</phone>", "");
                phone = Integer.parseInt(line.trim());
            }
            else if (line.contains("<email>"))
            {
                line = line.replace("<email>", "");
                line = line.replace( "</email>", "");
                email = line.trim();
            }
            else if (line.contains("</Guest>"))
            {
                anotherList.add(new Guest(firstName, lastName, phone, email));
                //dinamic initialisation.  adding guest to array and we are creating new guest
            }

        }

        return anotherList;

    }
}
