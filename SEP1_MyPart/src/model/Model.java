package model;

import files.FileManager;

import java.util.ArrayList;

public class Model
{
    private FileManager fileManager;
    private ArrayList<Guest> guests;

    public Model()
    {
        fileManager = new FileManager(this);
        this.guests = new ArrayList<>();
    }

    public ArrayList<Guest> getGuests()
    {
        return guests;
    }


    public void addGuest(String firstName, String lastName, int phone, String email)
    {
        Guest guest = new Guest(firstName, lastName, phone, email);
        System.out.println(guest);
        guests.add(guest);
        //fileManager.saveGuest(guest); //this calls jason in File manager
        fileManager.saveManual();//adds guests to guestList.xml it was done manually as Jason did not work

    }

    public ArrayList<Guest> getGuestsFromFile()
    {
        //we created new array list  so we do not ovewrite existing guests
        ArrayList<Guest> guestsTemp = new ArrayList<>();
        //fileManager manages all the xml data and Manual model in fileManagar where we were saving guest in xml file
        guestsTemp = fileManager.readManual();
        return guestsTemp;
    }


}
