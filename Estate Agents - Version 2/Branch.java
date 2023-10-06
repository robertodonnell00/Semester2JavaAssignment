//Collection class
import java.util.ArrayList;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import com.thoughtworks.xstream.security.AnyTypePermission;
public class Branch 
{
    private ArrayList<People> peop1 = new ArrayList<People>();
    private ArrayList<Properties> prop1 = new ArrayList<Properties>();
    
    public Branch()
    {
        
    }
    
    //ADD
    public void addPeople(People ppl)
    {
        peop1.add(ppl);
    }
    
    public void addProperty(Properties prop)
    {
        prop1.add(prop);
    }
    
    
    //REMOVE
    public void removePeople(int index)
    {
        if(index >=0 && index < peop1.size())
        {
            peop1.remove(index);
        }
    }
    
    public void removeProperty(int index)
    {
        if(index >=0 && index < prop1.size())
        {
            prop1.remove(index);
        }
    }
    
    public int numberOfPeople()
    {
        return peop1.size();
    }
    
    
    //LIST
    public String listOfPeople()
    {
        String list = "";
        int i = 0;
        for (People ppl : peop1) 
        {
            list += i + ":" + ppl + "\n";
            i++;
        }
        return list;
    }

    public String listOfAgents()
    {
        String list = "";
        int i = 0;
        for (People ppl : peop1) 
        {
            if (ppl instanceof Agent) 
            {
                list += i + ":" + ((Agent)ppl) + "\n";
                i++;
            }
        }
        return list;
    }
    
    public String listOfClients()
    {
        String list = "";
        int i = 0;
        for (People ppl : peop1) 
        {
            if (ppl instanceof Client) 
            {
                list += i + ":" + ((Client)ppl) + "\n";
                i++;
            }
        }
        return list;
    }
    
    
    public String listOfProperties()
    {
        String list = "";
        int i = 0;
        for (Properties prop : prop1)
        {
            list += i + ":" + prop + "\n";
            i++;
        }
        return list;
    }
    
    public String listOfToRent()
    {
        String list = "";
        int i = 0;
        for (Properties prop : prop1) 
        {
            if (prop instanceof toRent)
            {
                list += i + ":" + ((toRent)prop) + "\n";
                i++;  
            }
        }
        return list;
    }
    
    public String listOfToBuy()
    {
        String list = "";
        int i = 0;
        for (Properties prop : prop1) 
        {
            if (prop instanceof toBuy)
            {
                list += i + ":" + ((toBuy)prop) + "\n";
                i++;  
            }
        }
        return list;
    }
    
    public String listOfBnB()
    {
        String list = "";
        int i = 0;
        for (Properties prop : prop1) 
        {
            if (prop instanceof BnB)
            {
                list += i + ":" + ((BnB)prop) + "\n";
                i++;  
            }
        }
        return list;
    }
    
    //SEARCH
    
    public String searchPeopleByName(String name)
    {
        String searchResults ="";
        for(People ppl: peop1)
        {
            if(ppl.getName().equals(name))
            {
                searchResults = searchResults + ppl.toString() + "\n";
            }
        }
        return searchResults;
    }
    
    public String searchAgentsByName(String name)
    {
        String searchResults ="";
        for(People ppl: peop1)
        {
            if(ppl.getName().equals(name))
            {
                searchResults = searchResults + ((Agent)ppl).toString() + "\n";
            }
        }
        return searchResults;
    }
    
    public String searchClientsByName(String name)
    {
        String searchResults ="";
        for(People ppl: peop1)
        {
            if(ppl.getName().equals(name))
            {
                searchResults = searchResults + ((Client)ppl).toString() + "\n";
            }
        }
        return searchResults;
    }
    
    public String searchPeopleByID(String ID)
    {
        String searchResults ="";
        for(People ppl: peop1)
        {
            if(ppl.getID().equals(ID))
            {
                searchResults = searchResults + ppl.toString() + "\n";
            }
        }
        return searchResults;
    }
    
    public String searchAgentsByID(String ID)
    {
        String searchResults ="";
        for(People ppl: peop1)
        {
            if(ppl.getID().equals(ID))
            {
                searchResults = searchResults + ((Agent)ppl).toString() + "\n";
            }
        }
        return searchResults;
    }
    
    public String searchClientsByID(String ID)
    {
        String searchResults ="";
        for(People ppl: peop1)
        {
            if(ppl.getID().equals(ID))
            {
                searchResults = searchResults + ((Client)ppl).toString() + "\n";
            }
        }
        return searchResults;
    }
    
     public Client getClientByID(String ID)
    {
        for(People ppl: peop1)
        {
            if(ppl.getID().equals(ID) && ppl instanceof Client)
            {
                return (Client)ppl;
            }
        }
        return null;
    }
    
    
    public String searchPropertiesByID(String ID)
    {
        String searchResults = "";
        for(Properties prop: prop1)
        {
            if(prop.getID().equals(ID))
            {
                searchResults = searchResults + prop.toString() + "\n";
            }
        }
        return searchResults;
    }
    
    public String searchToRentByID(String ID)
    {
        String searchResults = "";
        for(Properties prop: prop1)
        {
            if(prop.getID().equals(ID))
            {
                searchResults = searchResults + ((toRent)prop).toString() + "\n";
            }
        }
        return searchResults;
    }
    
    public String searchToBuyByID(String ID)
    {
        String searchResults = "";
        for(Properties prop: prop1)
        {
            if(prop.getID().equals(ID))
            {
                searchResults = searchResults + ((toBuy)prop).toString() + "\n";
            }
        }
        return searchResults;
    }
    
    public String searchBnBByID(String ID)
    {
        String searchResults = "";
        for(Properties prop: prop1)
        {
            if(prop.getID().equals(ID))
            {
                searchResults = searchResults + ((BnB)prop).toString() + "\n";
            }
        }
        return searchResults;
    }
    
    public String searchPropertiesByAddress(String add)
    {
        String searchResults = "";
        for(Properties prop: prop1)
        {
            if(prop.getAddress().equals(add))
            {
                searchResults = searchResults + prop.toString() + "\n";
            }
        }
        return searchResults;
    }
    
    public String searchToRentByAddress(String add)
    {
        String searchResults = "";
        for(Properties prop: prop1)
        {
            if(prop.getAddress().equals(add))
            {
                searchResults = searchResults + ((toRent)prop).toString() + "\n";
            }
        }
        return searchResults;
    }
    
    public String searchToBuyByAddress(String add)
    {
        String searchResults = "";
        for(Properties prop: prop1)
        {
            if(prop.getAddress().equals(add))
            {
                searchResults = searchResults + ((toBuy)prop).toString() + "\n";
            }
        }
        return searchResults;
    }
    
    public String searchBnBByAddress(String add)
    {
        String searchResults = "";
        for(Properties prop: prop1)
        {
            if(prop.getAddress().equals(add))
            {
                searchResults = searchResults + ((BnB)prop).toString() + "\n";
            }
        }
        return searchResults;
    }
    
    //GET
    public int getPeople(int index)
    {
        if(index >=0 && index < peop1.size())
        {
            peop1.get(index);
        } 
        return index;
    }
    
    public int getProperties(int index)
    {
        if(index >=0 && index < prop1.size())
        {
            prop1.get(index);
        }
        return index;
    }
    
    public Properties getProperty(int index)
    {
        return prop1.get(index);
    }
    
    
    public People getPerson(int index)
    {
        return peop1.get(index);
    }
    
    // public Client getClient(int index)
    // {
        
        // return (Client)peop1.get(index);
    // }
    
    @SuppressWarnings("unchecked")
    public void loadPeople() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        xstream.addPermission(AnyTypePermission.ANY);
        ObjectInputStream is = xstream.createObjectInputStream(new FileReader("people.xml"));
        peop1 = (ArrayList<People>) is.readObject();
        is.close();
    }
    
    @SuppressWarnings("unchecked")
    public void loadProperties() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        xstream.addPermission(AnyTypePermission.ANY);
        ObjectInputStream is = xstream.createObjectInputStream(new FileReader("properties.xml"));
        prop1 = (ArrayList<Properties>) is.readObject();
        is.close();
    }
    
    public void savePeople() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("people.xml"));
        out.writeObject(peop1);
        out.close();    
    }
    
    public void saveProperties() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("properties.xml"));
        out.writeObject(prop1);
        out.close();    
    }
}
