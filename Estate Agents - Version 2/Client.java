
public class Client extends People
{
    
    private String lookingTo;
    private String idealProp;
    private int familySize;
    private int budget;
    
    public Client(String name, String email, String DOB, String ID, String lookingTo,
    String idealProp, int familySize, int budget)
    {
        super(name, email, DOB, ID);
        this.lookingTo = lookingTo;
        this.idealProp = idealProp;
        this.familySize = familySize;
        this.budget = budget;
    }

    public String classID()
    {
        return "clt";
    }
    
    
    //Getters
    public String getLookingTo()
    {
        return lookingTo;
    }
    
    public String getIdealProp()
    {
        return idealProp;
    }
    
    public int getFamilySize()
    {
        return familySize; 
    }
    
    public int getBudget()
    {
        return budget;
    }
    
    
    //Setters
    public void setLookingTo()
    {
        this.lookingTo = lookingTo;
    }
    
    public void setIdealProp()
    {
        this.idealProp = idealProp;
    }
    
    public void setFamilySize()
    {
        this.familySize = familySize;
    }
    
    public void setBudget()
    {
        this.budget = budget;
    }
    
    public String printID()
    {
            return "------------------------------\n" + 
                   "|  ID:   " + getID() + "           |\n" +
                   "|  Name: " + getName() + "         |\n"+
                   "------------------------------\n";
    }
    
    // public String printLookingTo()
    // {
        // return "------------------------------\n" + 
                   // "|  ID:   " + getID() + "           |\n" +
                   // "|  Name: " + getName() + "         |\n"+
                   // "|  Looking To: " + getLookingTo() + "    |\n" +
                   // "------------------------------\n";
    // }
    
    public String toString()
    {
        return "Client Details: " + "\n" + 
        "\tName: " + getName() + "\n" + 
        "\tEmail: " + getEmail() + "\n" +
        "\tClient ID: " + classID() + getID() + "\n" +
        "\tLooking to: " + lookingTo + "\n" + 
        "\tIdeal Property: " + idealProp + "\n" +
        "\tFamily Size: " + familySize + "\n" + 
        "\tBudget: €" + budget + "\n";
    }

    
    public static String lookingToOptions()
    {
        System.out.println("Choose from the following, what the Client is looking to-do: ");
        System.out.println("1. Rent");
        System.out.println("2. Buy");
        System.out.println("3. Let a BnB");
        String lookingTo ="";
        int option = EasyScanner.nextInt();
            switch(option)
            {
                case 1:
                    lookingTo = "Rent";
                    break;
                    
                case 2: 
                    lookingTo = "Buy";
                    break;
                    
                case 3:
                    lookingTo = "Let a BnB";
                    break;
                    
                default:
                    System.out.println("Invalid Input Selected");
            }
        
            return lookingTo;
    }

}
