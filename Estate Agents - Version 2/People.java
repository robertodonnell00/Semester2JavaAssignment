
/**
 * Super Class for People
 */
public abstract class People implements iEstateAgents
{
    //Variables
    private String name;
    private String email;
    private String DOB;
    private String ID;

    public People(String name, String email, String DOB, String ID)
    {
        this.name = name;
        this.email = email;
        this.DOB = DOB;
        this.ID = ID;
    }

    public abstract String classID();
    
    //Getters
    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getDOB()
    {
        return DOB;
    }
    
    public String getID()
    {
        return ID;
    }
    
    //Setters
    public void setName()
    {
        this.name = name;
    }
    
    public void setEmail()
    {
        this.email = email;
    }

    public void setDOB()
    {
        this.DOB = DOB;
    }
    
    public void setID()
    {
        this.ID = ID;
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
        return "Personal Details: \n" + "\tName: " + name + "\n"
        + "\tEmail: " + email + "\n"
        + "\tDOB: " + DOB + "\n"
        + "\tID: " + classID() + ID + "\n";
    }
}
