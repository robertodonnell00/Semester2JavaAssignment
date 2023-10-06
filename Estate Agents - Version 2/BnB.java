
public class BnB extends Properties
{
    private int deposit;
    private int price;
    private boolean animals;

    public BnB(String address, String propType, int bathrooms,
    int bedrooms, int sqMetres,String ID, Agent assignedAgent,int deposit,
    int price, boolean animals)
    {
        super(address, propType, bathrooms, bedrooms, sqMetres,ID, assignedAgent);
        this.deposit = deposit;
        this.price = price;
        this.animals = animals;
    }
    
    public String classID()
    {
        return "bnb";
    }
    
    
    //Getters
    public int getDeposit()
    {
        return deposit;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public boolean getAnimals()
    {
        return animals;
    }
    
    
    //Setters
    public void setDeposit(int deposit)
    {
        this.deposit = deposit;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    public void setAnimals(boolean animals)
    {
        this.animals = animals;
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
        return "Property to Rent Details: \n" + 
        "\tAddress: " + getAddress() + "\n" +
        "\tType of Property: " + getPropType() + "\n" +
        "\tNumber of Bathrooms: " + getBathrooms() + "\n" +
        "\tNumber of Bedrooms: " + getBedrooms() + "\n" + 
        "\tSize of Property: " + getSqMetres() + " sq. metres\n" +
        "\tProperty ID: " + classID() + getID() + "\n" +
        "\tAssigned Agent: " + getAssignedAgent().printID() + "\n" +
        "\tDeposit: €" + deposit +  "\n" + 
        "\tPrice per Night: €" + price + "\n" +
        "\tAnimals: " + animals + "\n";
    }
}
