
public class Agent extends People
{
    
    private double commissionRate;
    private int numSales;
    // private Properties assignedProperties[] = new Properties[5];
    private int yearJoined;
        
    public Agent(String name, String email, String DOB, String ID, double commissionRate,
    int numSales, //Properties[] assignedProperties,
    int yearJoined)
    {
        super(name, email, DOB, ID);
        if(commissionRate <= 35.5 && commissionRate > 10.5)
        {
            this.commissionRate = commissionRate;
        }
        else
        {            
            System.out.println("Invalid Input, min. 10.5% Max. 35.5%");
            this.commissionRate = EasyScanner.nextDouble();
        }
        this.numSales = numSales;
        // this.assignedProperties = assignedProperties;
        if(yearJoined > 1998)
        {
            this.yearJoined = yearJoined;
        }
        else
        {
            System.out.println("Invalid Input, Company esatablished in 1998 and current year is 2023");
            this.yearJoined = EasyScanner.nextInt();
        }
    }
    
    public String classID()
    {
        return "agt";
    }
    
    //Getters
    public double getCommissionRate()
    {
        return commissionRate;
    }
    
    public int getNumSales()
    {
        return numSales;
    }
    
    // public Properties[] getAssignedProperties()
    // {
        // return assignedProperties;
    // }
    
    public int getYearJoined()
    {
        return yearJoined;
    }
    
    
    //Setter
    public void setCommissionRate()
    {
        if(commissionRate <= 35.5 && commissionRate > 10.5)
        {
            this.commissionRate = commissionRate;
        }
        else
        {            
            System.out.println("Invalid Input, min. 10.5% Max. 35.5%");
            this.commissionRate = EasyScanner.nextDouble();
        }
    }
    
    public void setNumSales()
    {
        this.numSales = numSales;
    }
    
    // public void setAssignedProperties()
    // {
        // this.assignedProperties = assignedProperties;
    // }
    
    public void setYearJoined()
    {
        if(yearJoined > 1998)
        {
            this.yearJoined = yearJoined;
        }
        else
        {
            System.out.println("Invalid Input, Company esatablished in 1998 and current year is 2023");
            this.yearJoined = EasyScanner.nextInt();
        }
    }
    
    
    public String printID()
    {
            return "\n------------------------------\n" + 
                   "|  ID:   " + getID() + "           |\n" +
                   "|  Name: " + getName() + "         |\n"+
                   "------------------------------\n";
    }
    
    public String toString()
    {
        return "Agent Details: \n" +
        "\tName: " + getName() + "\n" +
        "\tEmail Address: " + getEmail() + "\n" +
        "\tDate of Birth: " + getDOB() + "\n" +
        "\tAgent ID: " + classID() + getID() + "\n" +
        "\tCommission Rate: " + commissionRate + "\n" +
        // "\tAssigned Properties: " + assignedProperties + "\n" +
        "\tNumber of Sales (with Branch): " + numSales + "\n" +
        "\tYear Joined: " + yearJoined;
    }
    
}
