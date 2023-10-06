
public class toBuy extends Properties
{
    private String accompaniedLand;
    private int price;
    private boolean furnished;
    
    public toBuy(String address, String propType, int bathrooms,
    int bedrooms, int sqMetres,String ID, Agent assignedAgent,String accompaniedLand,
    int price, boolean furnished)
    {
        super(address, propType, bathrooms, bedrooms, sqMetres,ID, assignedAgent);
        this.accompaniedLand = accompaniedLand;
        if(price > 100000)
        {
            this.price = price;
        }  
        this.furnished = furnished;
    }

    public String classID()
    {
        return "buy";
    }
    
    
    //Getters 
    public String getAccompaniedLand()
    {
        return accompaniedLand;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public boolean getFurnished()
    {
        return furnished;
    }
    
    
    //Setters
    public void setAccompaniedLand()
    {
        this.accompaniedLand = accompaniedLand;
    }
    
    public void setPrice()
    {
        if(price > 100000)
        {
            this.price = price;
        } 
    }
    
    public void setFurnished()
    {
        this.furnished = furnished;
    }
    
    
     public String printID()
    {
            return "\n------------------------------------------\n" + 
                   "|  ID:   " + getID() + "                 |\n" +
                   "|  Address: " + getAddress() + "         |\n"+
                   "------------------------------------------\n";
    }
    
    public String toString()
    {
        return "Property to Buy Details: \n" + 
        "\tAddress: " + getAddress() + "\n" +
        "\tType of Property: " + getPropType() + "\n" +
        "\tNumber of Bathrooms: " + getBathrooms() + "\n" +
        "\tNumber of Bedrooms: " + getBedrooms() + "\n" + 
        "\tSize of Property: " + getSqMetres() + " sq. metres\n" +
        "\tProperty ID: " + classID() + getID() + "\n" +
        "\tAssigned Agent: " + getAssignedAgent().printID() + "\n" +
        "\tAccompanied Land: " + accompaniedLand + "acres \n" + 
        "\tPrice: €" + price + "\n" +
        "\tFurnished: " + furnished + "\n";
    }
    
    
    public static String accompaniedLandOptions()
    {
        System.out.println("Does property come with any land?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");
        String a;
        String accompaniedLand = "";
        int choice = EasyScanner.nextInt();
        if(choice == 1)
        {
            System.out.print("Enter how much land comes with property in acres: ");
            accompaniedLand = EasyScanner.nextString();
        }
        else if(choice == 2)
        {
            accompaniedLand = "No accompanied land with purchase";
        }
        return accompaniedLand;
    }
}
