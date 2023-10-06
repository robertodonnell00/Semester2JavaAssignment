
public class toRent extends Properties
{
    private int monthlyPrice;
    private int weeklyPrice;
    private boolean animals;
    
    public toRent(String address, String propType, int bathrooms,
    int bedrooms, int sqMetres,String ID, Agent assignedAgent, int monthlyPrice,
    int weeklyPrice, boolean animals)
    {
         super(address, propType, bathrooms, bedrooms, sqMetres,ID, assignedAgent);
         this.monthlyPrice = monthlyPrice;
         this.weeklyPrice = weeklyPrice;
         this.animals = animals;
    }
    
    public String classID()
    {
        return "rnt";
    } 
    
    
    //Getters
    public int getMonthlyPrice()
    {
        return monthlyPrice;
    }
    
    public int getWeeklyPrice()
    {
        return weeklyPrice;
    }
    
    public boolean getAnimals()
    {
        return animals;
    }
    
    
    //Setters
    public void setMonthlyPrice(int monthlyPrice)
    {
        this.monthlyPrice = monthlyPrice;
    }
    
    public void setWeeklyPrice(int weeklyPrice)
    {
        this.weeklyPrice = weeklyPrice;
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
        "\tMonthly Price: €" + monthlyPrice + "\n" + 
        "\tWeekly Price: €" + weeklyPrice + "\n" +
        "\tAnimals allowed: " + animals + "\n";
    }
}
