//Super Class

public abstract class Properties
{
    private String address;
    private String propType;
    private int bathrooms;
    private int bedrooms;
    private int sqMetres;
    private String ID;
    private Agent assignedAgent;
    
    
    public Properties(String address, String propType, int bathrooms,
    int bedrooms, int sqMetres,String ID, Agent assignedAgent)
    {
        if(address.length() > 0 && address.length() <= 50)
        {
            this.address = address;
        }
        else
        {
            this.address = address.substring(0,50);
        }
        this.propType = propType;
        this.bathrooms = bathrooms;
        this.bedrooms = bedrooms;
        this.ID = ID;
        if(sqMetres >= 50 && sqMetres < 200)
        {
            this.sqMetres = sqMetres;
        }
        this.assignedAgent = assignedAgent;
    }
    
    public abstract String classID();
    
    //Getters
    public String getAddress()
    {
        return address;
    }
    
    public String getPropType()
    {
        return propType;
    }
    
    public int getBathrooms()
    {
        return bathrooms;
    }
    
    public int getBedrooms()
    {
        return bedrooms;
    }
    
    public int getSqMetres()
    {
        return sqMetres;
    }
    
    public String getID()
    {
        return ID;
    }
    
    public Agent getAssignedAgent()
    {
        return assignedAgent;
    }
    
    
    //Setters
    public void setAddress(String address)
    {
        if(address.length() > 0 && address.length() <= 50)
        {
            this.address = address;
        }
        else
        {
            this.address = address.substring(0,50);
        }
    }
    
    public void setPropType(String propType)
    {
        this.propType = propType;
    }
    
    public void setBathrooms(int bathrooms)
    {
        this.bathrooms = bathrooms;
    }
    
    public void setID(String ID)
    {
        this.ID = ID;
    }
    
    public void setSqMetres(int sqMetres)
    {
        if(sqMetres >= 50 && sqMetres < 200)
        {
            this.sqMetres = sqMetres;
        }
    }
    
    public void setAssignedAgent(Agent assignedAgent)
    {
        this.assignedAgent = assignedAgent;
    }
    
    
    public String printID()
    {
            return "------------------------------------------\n" + 
                   "|  ID:   " + getID() + "                 |\n" +
                   "|  Address: " + getAddress() + "         |\n"+
                   "------------------------------------------\n";
    }
    
    public String toString()
    {
        return "Property Details: \n" +
        "Address: " + address + "\n" +
        "Property Type: " + propType + "\n" +
        "Number of Bathrooms: " + bathrooms + "\n" +
        "Number of Bedrooms: " + bedrooms + "\n" + 
        "Size of Property: " + sqMetres + " sq. metres \n" +
        "Property ID: " + classID() + ID + "\n" +
        "Assigned Agent" + assignedAgent + "\n"; 
    }
    
    
    public static String propertyTypes()
    {
        System.out.println("Choose from the following, the type of property: ");
        System.out.println("1. Bungalow");
        System.out.println("2. Apartment");
        System.out.println("3. Semi-Detached");
        System.out.println("4. Two-Storey");
        System.out.println("5. Enter new property type");
        String propType ="";
        int selectProp = EasyScanner.nextInt();
            switch(selectProp)
            {
                case 1:
                    propType = "Bungalow";
                    break;
                    
                case 2: 
                    propType = "Apartment";
                    break;
                    
                case 3:
                    propType = "Semi-Detached";
                    break;
                    
                case 4: 
                    propType = "Two-Storey";
                    break;
                    
                case 5:
                    System.out.println("Enter new property type");
                    propType = EasyScanner.nextString();
                    
                default:
                    System.out.println("Invalid Input Selected");
            }
        
            return propType;
    }
}
