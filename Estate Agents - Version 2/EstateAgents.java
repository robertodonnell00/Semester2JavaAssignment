//UI Class
import java.util.ArrayList;
import java.util.Random;

public class EstateAgents
{
    
    private Branch branchWD = new Branch();
    Random rand = new Random();
    
    //Constructor
    public EstateAgents()
    {
    }

    public static void main(String[] args)
    {
        EstateAgents ea1 = new EstateAgents();
        ea1.run();
    }
    
    public int mainMenu()
    {
        System.out.println("\n Estate Agency Menu");
        System.out.println("\n ______________________");
        System.out.println(); 
        
        System.out.println("\t______________________");
        System.out.println("\t  1. Open Menu for People");
        System.out.println("\t  2. Open Menu for Properties");
        System.out.println("\t  3. Manually Save");
        
        System.out.println();
        System.out.println("\t  0. Exit \n");
        System.out.println("Enter Choice [0-3]");
        
        int choice = EasyScanner.nextInt();
        System.out.println("\t______________________");
        return choice;
    }
    
    public void run()
    {
        try
        {
            branchWD.loadPeople();
            branchWD.loadProperties();
        }
        catch (Exception e)
        {
            System.out.println("Error reading from file: " + e);
        }
        
        int option = mainMenu();
        while(option != 0)
        {
            switch(option)
            {
                case 1:
                    peopleMenu();
                    break;
                    
                case 2:
                    propertiesMenu();
                    break;
                    
                case 3:
                    try
                    {
                        branchWD.savePeople();
                        branchWD.saveProperties();
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error reading from file: " + e);
                    }
                    break;
                    
                default:
                    System.out.println("Invalid option selected");
            }
            System.out.println();
            option = mainMenu();
        }
        
        try
        {
            branchWD.savePeople();
            branchWD.saveProperties();
        }
        catch (Exception e)
        {
            System.out.println("Error reading from file: " + e);
        }
    }
    
    
    public void peopleMenu()
    {
        System.out.println("\n People Menu");
        System.out.println("\n Pick from options below which action you'd like to take: ");
        System.out.println("\n ______________________");
        System.out.println();
        System.out.println("\t  1. Add a Person to the system");
        System.out.println("\t  2. List all the People on the system");
        System.out.println("\t  3. Remove a Person from the system");
        System.out.println("\t  4. List People by name");
        System.out.println("\t  5. List People by ID");
        System.out.println("\t  6. Print People's ID's");
        
        System.out.println();
        System.out.println("\t  7. Open Agent Menu");
        System.out.println("\t  8. Open Client Menu");
        System.out.println();
        System.out.println("\t  0. Return to Main Menu");
        System.out.println();
        System.out.println("Enter Choice [0-8]: ");
       
        int choice = EasyScanner.nextInt();
        System.out.println("\n ______________________");
    
        while(choice != 0)
        {
            switch(choice)
            {
                case 1:
                    createPerson();
                    break;
                
                case 2:
                    System.out.println(branchWD.listOfPeople());
                    break;
                    
                case 3:
                    deletePerson();
                    break;
                
                case 4: 
                    listOfPeopleByName();
                    break;
                
                case 5:
                    listOfPeopleByID();
                    break;
                
                case 6:
                    printPersonsID();
                    break;
                    
                case 7:
                    agentMenu();
                    break;
                    
                case 8:
                    clientMenu();
                    break;
                
                default: 
                    System.out.println("Invalid option selected");
            }
            
            System.out.println("\n People Menu");
            System.out.println("\n Pick from options below which action you'd like to take: ");
            System.out.println("\n ______________________");
            System.out.println();
            System.out.println("\t  1. Add a Person to the system");
            System.out.println("\t  2. List all the People on the system");
            System.out.println("\t  3. Remove a Person from the system");
            System.out.println("\t  4. List People by name");
            System.out.println("\t  5. List People by ID");
            System.out.println("\t  6. Print People's ID's");
        
            System.out.println();
            System.out.println("\t  7. Open Agent Menu");
            System.out.println("\t  8. Open Client Menu");
            System.out.println();
            System.out.println("\t  0. Return to Main Menu");
            System.out.println();
            System.out.println("Enter Choice [0-8]: ");
       
            choice = EasyScanner.nextInt();
            System.out.println("\n ______________________");
            
        }
    }
    
    public void agentMenu()
    {
        System.out.println("\n Agent Menu");
        System.out.println("\n Pick from options below which action you'd like to take: ");
        System.out.println("\n ______________________");
        System.out.println();
        System.out.println("\t  1. Add an Agent to the system");
        System.out.println("\t  2. List all the Agents on the system");
        System.out.println("\t  3. Remove an Agent from the system");
        System.out.println("\t  4. List Agents by name");
        System.out.println("\t  5. List Agents by ID");
        System.out.println("\t  6. Print Agents ID's");
        
        System.out.println();
        System.out.println("\t  0. Return to People Menu");
        System.out.println();
        System.out.println("Enter Choice [0-6]: ");
        
        int choice = EasyScanner.nextInt();
        System.out.println("\n ______________________");
        
        while(choice != 0)
        {
            switch(choice)
            {
                case 1:
                    createAgent();
                    break;
                    
                case 2:
                    System.out.println(branchWD.listOfAgents());
                    break;
                
                case 3: 
                    deleteAgent();
                    break;
                    
                case 4:
                    listOfAgentsByName();
                    break;
                    
                case 5:
                    listOfAgentsByID();
                    break;
                    
                case 6:
                    printAgentID();
                    break;
                    
                default:
                    System.out.println("Invalid option selected");
            
            }
            
            System.out.println("\n Agent Menu");
            System.out.println("\n Pick from options below which action you'd like to take: ");
            System.out.println("\n ______________________");
            System.out.println();
            System.out.println("\t  1. Add an Agent to the system");
            System.out.println("\t  2. List all the Agents on the system");
            System.out.println("\t  3. Remove an Agent from the system");
            System.out.println("\t  4. List Agents by name");
            System.out.println("\t  5. List Agents by ID");
            System.out.println("\t  6. Print Agents ID's");
        
            System.out.println();
            System.out.println("\t  0. Return to People Menu");
            System.out.println();
            System.out.println("Enter Choice [0-6]: ");
        
            choice = EasyScanner.nextInt();
            System.out.println("\n ______________________");
        }
    }
    
    public void clientMenu()
    {
        System.out.println("\n Client Menu");
        System.out.println("\n Pick from options below which action you'd like to take: ");
        System.out.println("\n ______________________");
        System.out.println();
        System.out.println("\t  1. Add a Client to the system");
        System.out.println("\t  2. List all the Clients on the system");
        System.out.println("\t  3. Remove a Client from the system");
        System.out.println("\t  4. List Clients by name");
        System.out.println("\t  5. List Clients by ID");
        System.out.println("\t  6. Print Clients ID's");
        System.out.println("\t  7. Find best Property for Client");
        
        System.out.println();
        System.out.println("\t  0. Return to People Menu");
        System.out.println();
        System.out.println("Enter Choice [0-6]: ");
        
        int choice = EasyScanner.nextInt();
        System.out.println("\n ______________________");
        
        while(choice != 0)
        {
            switch(choice)
            {
                case 1:
                    createClient();
                    break;
                    
                case 2:
                    System.out.println(branchWD.listOfClients());
                    break;
                
                case 3: 
                    deleteClient();
                    break;
                    
                case 4:
                    listOfClientsByName();
                    break;
                    
                case 5:
                    listOfClientsByID();
                    break;
                    
                case 6:
                    printClientID();
                    break;
                    
                case 7:
                    bestMatch();
                    break;
                    
                default:
                    System.out.println("Invalid option selected");
            
            }
            
            System.out.println("\n Client Menu");
            System.out.println("\n Pick from options below which action you'd like to take: ");
            System.out.println("\n ______________________");
            System.out.println();
            System.out.println("\t  1. Add a Client to the system");
            System.out.println("\t  2. List all the Clients on the system");
            System.out.println("\t  3. Remove a Client from the system");
            System.out.println("\t  4. List Clients by name");
            System.out.println("\t  5. List Clients by ID");
            System.out.println("\t  6. Print Clients ID's");
            System.out.println("\t  7. Find best Property for Client");
        
            System.out.println();
            System.out.println("\t  0. Return to People Menu");
            System.out.println();
            System.out.println("Enter Choice [0-6]: ");
        
            choice = EasyScanner.nextInt();
            System.out.println("\n ______________________");
        }
    }
    
    
    //PROPERTY MENUs
    
    public void propertiesMenu()
    {
        System.out.println("\n Properties Menu");
        System.out.println("\n Pick from options below which action you'd like to take: ");
        System.out.println("\n ______________________");
        System.out.println();
        System.out.println("\t  1. Add a Property to the system");
        System.out.println("\t  2. List all the Properties on the system");
        System.out.println("\t  3. Remove a Property from the system");
        System.out.println("\t  4. List Property by address");
        System.out.println("\t  5. List Property by ID");
        System.out.println("\t  6. Print Properties ID's");
        
        System.out.println();
        System.out.println("\t  7. Open Menu for Properties available to Buy");
        System.out.println("\t  8. Open Menu for Properties available to Rent");
        System.out.println("\t  9. Open Menu for BnB Properties");
        System.out.println();
        System.out.println("\t  0. Return to Main Menu");
        System.out.println();
        System.out.println("Enter Choice [0-9]: ");
       
        int choice = EasyScanner.nextInt();
        System.out.println("\n ______________________");
    
        while(choice != 0)
        {
            switch(choice)
            {
                case 1:
                    createProperty();
                    break;
                
                case 2:
                    System.out.println(branchWD.listOfProperties());
                    break;
                    
                case 3:
                    deleteProperty();
                    break;
                
                case 4: 
                    listOfPropertiesByAddress();
                    break;
                
                case 5:
                    listOfPropertiesByID();
                    break;
                
                case 6:
                    printPropertyID();
                    break;
                    
                case 7:
                    toBuyMenu();
                    break;
                    
                case 8:
                    toRentMenu();
                    break;
                    
                case 9:
                    BnBMenu();
                    break;
                
                default: 
                    System.out.println("Invalid option selected");
            }
            
            System.out.println("\n Properties Menu");
            System.out.println("\n Pick from options below which action you'd like to take: ");
            System.out.println("\n ______________________");
            System.out.println();
            System.out.println("\t  1. Add a Property to the system");
            System.out.println("\t  2. List all the Properties on the system");
            System.out.println("\t  3. Remove a Property from the system");
            System.out.println("\t  4. List Property by address");
            System.out.println("\t  5. List Property by ID");
            System.out.println("\t  6. Print Properties ID's");
        
            System.out.println();
            System.out.println("\t  7. Open Menu for Properties available to Buy");
            System.out.println("\t  8. Open Menu for Properties available to Rent");
            System.out.println("\t  9. Open Menu for BnB Properties");
            System.out.println();
            System.out.println("\t  0. Return to Main Menu");
            System.out.println();
            System.out.println("Enter Choice [0-9]: ");
       
            choice = EasyScanner.nextInt();
            System.out.println("\n ______________________");
        }
    }
    
    public void toRentMenu()
    {
        System.out.println("\n To Rent Menu");
        System.out.println("\n Pick from options below which action you'd like to take: ");
        System.out.println("\n ______________________");
        System.out.println();
        System.out.println("\t  1. Add a Property to Rent to the system");
        System.out.println("\t  2. List all the Properties to Rent");
        System.out.println("\t  3. Remove a Property for Rent");
        System.out.println("\t  4. List Properties to Rent by address");
        System.out.println("\t  5. List Properties to Rent by ID");
        System.out.println("\t  6. Print Rent Property ID's");
        
        System.out.println();
        System.out.println("\t  0. Return to Properties Menu");
        System.out.println();
        System.out.println("Enter Choice [0-6]: ");
        
        int choice = EasyScanner.nextInt();
        System.out.println("\n ______________________");
        
        while(choice != 0)
        {
            switch(choice)
            {
                case 1:
                    createToRent();
                    break;
                    
                case 2:
                    System.out.println(branchWD.listOfToRent());
                    break;
                
                case 3: 
                    deleteToRent();
                    break;
                    
                case 4:
                    listOfPropsToRentByAddress();
                    break;
                    
                case 5:
                    listOfPropsToRentByID();
                    break;
                    
                case 6:
                    printToRentID();
                    break;
                    
                default:
                    System.out.println("Invalid option selected");
            
            }
            
            System.out.println("\n To Rent Menu");
            System.out.println("\n Pick from options below which action you'd like to take: ");
            System.out.println("\n ______________________");
            System.out.println();
            System.out.println("\t  1. Add a Property to Rent to the system");
            System.out.println("\t  2. List all the Properties to Rent");
            System.out.println("\t  3. Remove a Property for Rent");
            System.out.println("\t  4. List Properties to Rent by address");
            System.out.println("\t  5. List Properties to Rent by ID");
            System.out.println("\t  6. Print Rent Property ID's");
        
            System.out.println();
            System.out.println("\t  0. Return to Properties Menu");
            System.out.println();
            System.out.println("Enter Choice [0-6]: ");
        
            choice = EasyScanner.nextInt();
            System.out.println("\n ______________________");
        }
    }
    
    public void toBuyMenu()
    {
        System.out.println("\n To Buy Menu");
        System.out.println("\n Pick from options below which action you'd like to take: ");
        System.out.println("\n ______________________");
        System.out.println();
        System.out.println("\t  1. Add a Property to Buy to the system");
        System.out.println("\t  2. List all the Properties available to Buy");
        System.out.println("\t  3. Remove a Property available to buy");
        System.out.println("\t  4. List Properties to Buy by address");
        System.out.println("\t  5. List Properties to Buy by ID");
        System.out.println("\t  6. Print Purchasable Property ID's");
        
        System.out.println();
        System.out.println("\t  0. Return to Properties Menu");
        System.out.println();
        System.out.println("Enter Choice [0-6]: ");
        
        int choice = EasyScanner.nextInt();
        System.out.println("\n ______________________");
        
        while(choice != 0)
        {
            switch(choice)
            {
                case 1:
                    createToBuy();
                    break;
                    
                case 2:
                    System.out.println(branchWD.listOfToBuy());
                    break;
                
                case 3: 
                    deleteToBuy();
                    break;
                    
                case 4:
                    listOfPropsToBuyByAddress();
                    break;
                    
                case 5:
                    listOfPropsToBuyByID();
                    break;
                    
                case 6:
                    printToBuyID();
                    break;
                    
                default:
                    System.out.println("Invalid option selected");
            
            }
            
            System.out.println("\n To Buy Menu");
            System.out.println("\n Pick from options below which action you'd like to take: ");
            System.out.println("\n ______________________");
            System.out.println();
            System.out.println("\t  1. Add a Property to Buy to the system");
            System.out.println("\t  2. List all the Properties available to Buy");
            System.out.println("\t  3. Remove a Property available to buy");
            System.out.println("\t  4. List Properties to Buy by address");
            System.out.println("\t  5. List Properties to Buy by ID");
            System.out.println("\t  6. Print Purchasable Property ID's");
        
            System.out.println();
            System.out.println("\t  0. Return to Properties Menu");
            System.out.println();
            System.out.println("Enter Choice [0-6]: ");
        
            choice = EasyScanner.nextInt();
            System.out.println("\n ______________________");
        }
    }
    
    public void BnBMenu()
    {
        System.out.println("\n BnB Menu");
        System.out.println("\n Pick from options below which action you'd like to take: ");
        System.out.println("\n ______________________");
        System.out.println();
        System.out.println("\t  1. Add a BnB to the system");
        System.out.println("\t  2. List all the BnBs available");
        System.out.println("\t  3. Remove a BnB from the system");
        System.out.println("\t  4. List BnBs by address");
        System.out.println("\t  5. List BnBs by ID");
        System.out.println("\t  6. Print BnB ID's");
        
        System.out.println();
        System.out.println("\t  0. Return to Properties Menu");
        System.out.println();
        System.out.println("Enter Choice [0-6]: ");
        
        int choice = EasyScanner.nextInt();
        System.out.println("\n ______________________");
        
        while(choice != 0)
        {
            switch(choice)
            {
                case 1:
                    createBnB();
                    break;
                    
                case 2:
                    System.out.println(branchWD.listOfBnB());
                    break;
                
                case 3: 
                    deleteBnB();
                    break;
                    
                case 4:
                    listOfBnBsByAddress();
                    break;
                    
                case 5:
                    listOfBnBsByID();
                    break;
                    
                case 6:
                    printBnBID();
                    break;
                    
                default:
                    System.out.println("Invalid option selected");
            
            }
            
            System.out.println("\n BnB Menu");
            System.out.println("\n Pick from options below which action you'd like to take: ");
            System.out.println("\n ______________________");
            System.out.println();
            System.out.println("\t  1. Add a BnB to the system");
            System.out.println("\t  2. List all the BnBs available");
            System.out.println("\t  3. Remove a BnB from the system");
            System.out.println("\t  4. List BnBs by address");
            System.out.println("\t  5. List BnBs by ID");
            System.out.println("\t  6. Print BnB ID's");
        
            System.out.println();
            System.out.println("\t  0. Return to Properties Menu");
            System.out.println();
            System.out.println("Enter Choice [0-6]: ");
        
            choice = EasyScanner.nextInt();
            System.out.println("\n ______________________");
        }
    }
    
    
    //Create PEOPLE
    public void createAgent()
    {
        String name;
        String email;
        String DOB;
        String ID = "";
        double commissionRate;
        int numSales;
        Properties[] assignedProperties;
        int yearJoined;
        
        System.out.println("Enter the new Agent's details.");
        System.out.println("    Name: ");
        name = EasyScanner.nextString();
        
        System.out.println("    Email: ");
        email = EasyScanner.nextString();
        
        System.out.println("    Date of Birth : ");
        DOB = EasyScanner.nextString();
        
        System.out.println("    Agent ID number: ");
        System.out.println("1. Set Client ID manually" + "\n2. Automatically generate ID");
        int choose = EasyScanner.nextInt();
        if(choose == 1)
        {
            System.out.println("Please enter ID for Agent (100-999)");
            int tempID = EasyScanner.nextInt();
            while(!(tempID < 1000 && tempID > 99))
            {
              System.out.println("Invalid ID. Choose number from (100-999)");
              tempID = EasyScanner.nextInt();
              ID = Integer.toString(tempID);
            }
        }
        else 
        {
            int tempID = rand.nextInt(999 - 99 + 1) + 99;
            ID = Integer.toString(tempID);
        }
        
        System.out.println("    Commission Rate: ");
        commissionRate = EasyScanner.nextDouble();
        
        System.out.println("    Number of Sales: ");
        numSales = EasyScanner.nextInt();
        
        //FIX
        
        // System.out.println();
        // System.out.println("Select the Properties to assign to this agent");
        // System.out.println("\nWaterford Estate Agency's List of Properties: " + "\n" + branchWD.listOfProperties());
        // System.out.println("___________________________");
        // System.out.println("Please enter the index of the Property you wish to Assign to this Agent: ");
        // int index = EasyScanner.nextInt();
        
        System.out.println("    Enter Year Agent Joined Company: ");
        yearJoined = EasyScanner.nextInt();
        
        // Properties[] assigned = new Properties[5];
        // assigned[0] = branchWD.getProperty(index);
        
        Agent agt1 = new Agent(name, email, DOB, ID, commissionRate, numSales,
        // assigned, 
        yearJoined);
        branchWD.addPeople(agt1);
        System.out.println("___________________________");
    }
    
    public void createClient()
    {
        String name, email, DOB;
        String ID = "";
        String lookingTo;
        String idealProp;
        int familySize;
        int budget;
        
        System.out.println("Enter the new Agent's details.");
        System.out.println("    Name: ");
        name = EasyScanner.nextString();
        
        System.out.println("    Email: ");
        email = EasyScanner.nextString();
        
        System.out.println("    Date of Birth : ");
        DOB = EasyScanner.nextString();

        System.out.println("Client ID number: ");
        System.out.println("1. Set Client ID manually" + "\n2. Automatically generate ID");
        int choose = EasyScanner.nextInt();
        if(choose == 1)
        {
            System.out.println("Please enter ID for Client (100-999)");
            int tempID = EasyScanner.nextInt();
            while(!(tempID < 1000 && tempID > 99))
            {
              System.out.println("Invalid ID. Choose number from (100-999)");
              tempID = EasyScanner.nextInt();
              ID = Integer.toString(tempID);
            }
        }
        else 
        {
            int tempID = rand.nextInt(999 - 99 + 1) + 99;
            ID = Integer.toString(tempID);
        }
        
        System.out.println("    Looking to: ");
        lookingTo = Client.lookingToOptions();
        
        System.out.println("    Ideal Property: ");
        idealProp = Properties.propertyTypes();
        
        System.out.println("    Amount of people in Clients Family: ");
        familySize = EasyScanner.nextInt();
        
        System.out.println("    Client Budget: ");
        budget = EasyScanner.nextInt();
        if(lookingTo.equals("BnB"))
        {
            while(budget < 100)
            {
                System.out.println("Min. Price per night: €100 \nInput Again: ");
                budget = EasyScanner.nextInt();
            } 
        }
        else if(lookingTo.equals("Rent"))
        {
            while(budget < 800)
            {
                System.out.println("Min. Price per Month: €800 \nInput Again: ");
                budget = EasyScanner.nextInt();
            }
        }
        else
        {
            while(budget < 100000)
            {
                System.out.println("Min. Price of Properties to buy: €100000 \nInput Again: ");
                budget = EasyScanner.nextInt();
            }
        }
        
        Client clt1 = new Client(name, email, DOB, ID, lookingTo, idealProp, familySize, budget);
        branchWD.addPeople(clt1);
        System.out.println("___________________________");
    }
    
    public void createPerson()
    {
        int choice;
        System.out.println("\n ______________________");
        System.out.println("What kind of Person do you want to add?.");
        System.out.println("\t 1. New Agent");
        System.out.println("\t 2. New Client");
        System.out.println("\t\n 0. Cancel");
        System.out.println();
        System.out.print("Enter choice [0-2]: ");
        choice = EasyScanner.nextInt();
        
        
        if(choice == 1)
        {
            createAgent();
        }
        else if (choice == 2)
        {
            createClient();
        }
        else
        {
            System.out.println("Invalid option selected, try again [1-2]");
            choice = EasyScanner.nextInt();
        }
        
    }
    
    
    //Create PROPERTIES
    public void createToBuy()
    {
        String address, propType, accompaniedLand;
        String ID = "";
        int bathrooms, bedrooms, sqMetres, price;
        Agent assignedAgent;
        boolean furnished;
        
        System.out.println("Enter Address of Property: ");
        address = EasyScanner.nextString();
        while(!(address.length() > 0 && address.length() <= 50))
        {
            System.out.println("Invalid address, maximum characters is set at 50" 
                + "\n Input again: ");
            address = EasyScanner.nextString();
        }
        
        System.out.println("Enter the type of property: (Bungalow, apartment, etc)");
        propType = Properties.propertyTypes();
        
        System.out.println("Enter the number of bedrooms on the property: ");
        bedrooms = EasyScanner.nextInt();

        System.out.println("Enter the number of bathrooms on the property: ");
        bathrooms = EasyScanner.nextInt();

        System.out.println("Enter the size of property (in sq. metres): ");
        sqMetres = EasyScanner.nextInt();
        while(sqMetres < 50 || sqMetres > 200)
        {
            System.out.println("Invalid entry. Min 50 sq.m Max 200 sq.m" +
            "\n Input again: ");
            sqMetres = EasyScanner.nextInt();
        }
        
        System.out.println("Accompanied Land");
        accompaniedLand = toBuy.accompaniedLandOptions();
        
        System.out.println("Enter whether property will be furnished on purchase: (true/false)" );
        furnished = EasyScanner.nextBoolean();
        
        System.out.println();
        System.out.println("Select the agent to assign to this property");
        System.out.println("\nWaterford Estate Agency's List of Agents: " + "\n" + branchWD.listOfAgents());
        System.out.println("___________________________");
        System.out.println("Please enter the index of the Agent you wish to Assign to this property: ");
        int index = EasyScanner.nextInt();
        
        System.out.println("Enter the price of the property: ");
        price = EasyScanner.nextInt();
        while(price < 100000)
        {
            System.out.println("Invalid entry. Min Price to buy: €100000"
                + "\n Input again: ");
            price = EasyScanner.nextInt();
        }
        
        System.out.println("Property ID number: ");
        System.out.println("1. Set ID manually" + "\n2. Automatically generate ID");
        int choose = EasyScanner.nextInt();
        if(choose == 1)
        {
            System.out.println("Please enter ID for Property (9999-99999)");
            int tempID = EasyScanner.nextInt();
            ID = Integer.toString(tempID);
            while(tempID < 9999 || tempID > 99999)
            {
              System.out.println("Invalid ID. Choose number from (9999-99999)");
              tempID = EasyScanner.nextInt();
              ID = Integer.toString(tempID);
            }
        }
        else 
        {
            int tempID = rand.nextInt(99999 - 9999 + 1) + 9999;
            ID = Integer.toString(tempID);
        }
        
        toBuy buy1 = new toBuy(address, propType, bathrooms, bedrooms, sqMetres,ID, (Agent)branchWD.getPerson(index),
        accompaniedLand, price, furnished);
        branchWD.addProperty(buy1);
    }
    
    public void createToRent()
    {
        String address, propType;
        String ID = "";
        int bathrooms, bedrooms, sqMetres, monthlyPrice, weeklyPrice;
        Agent assignedAgent;
        boolean animals;
        
        System.out.println("Enter Address of Property: ");
        address = EasyScanner.nextString();
        while(!(address.length() > 0 && address.length() <= 50))
        {
            System.out.println("Invalid address, maximum characters is set at 50" 
                + "\n Input again: ");
            address = EasyScanner.nextString();
        }
        
        System.out.println("Enter the type of property: (Bungalow, apartment, etc)");
        propType = Properties.propertyTypes();
        
        System.out.println("Enter the number of bedrooms on the property: ");
        bedrooms = EasyScanner.nextInt();

        System.out.println("Enter the number of bathrooms on the property: ");
        bathrooms = EasyScanner.nextInt();

        System.out.println("Enter the size of property (in sq. metres): ");
        sqMetres = EasyScanner.nextInt();
        while(sqMetres < 50 || sqMetres > 200)
        {
            System.out.println("Invalid entry. Min 50 sq.m Max 200 sq.m" +
            "\n Input again: ");
            sqMetres = EasyScanner.nextInt();
        }
        
        System.out.println("Enter weekly price of property: ");
        weeklyPrice = EasyScanner.nextInt();
        while(weeklyPrice < 120)
        {
            System.out.println("Invalid entry, Min. €120");
            weeklyPrice = EasyScanner.nextInt();
        }
        
        int a = weeklyPrice*4;
        monthlyPrice = a;
        
        System.out.println("Enter whether animals allowed: (true/false)" );
        animals = EasyScanner.nextBoolean();
        
        System.out.println();
        System.out.println("Select the agent to assign to this property");
        System.out.println("\nWaterford Estate Agency's List of Agents: " + "\n" + branchWD.listOfAgents());
        System.out.println("___________________________");
        System.out.println("Please enter the index of the Agent you wish to Assign to this property: ");
        int index = EasyScanner.nextInt();
        
        
        System.out.println("Property ID number: ");
        System.out.println("1. Set ID manually" + "\n2. Automatically generate ID");
        int choose = EasyScanner.nextInt();
        if(choose == 1)
        {
            System.out.println("Please enter ID for Property (9999-99999)");
            int tempID = EasyScanner.nextInt();
            ID = Integer.toString(tempID);
            while(tempID < 9999 || tempID > 99999)
            {
              System.out.println("Invalid ID. Choose number from (9999-99999)");
              tempID = EasyScanner.nextInt();
              ID = Integer.toString(tempID);
            }
        }
        else 
        {
            int tempID = rand.nextInt(99999 - 9999 + 1) + 9999;
            ID = Integer.toString(tempID);
        }
        
        toRent rent1 = new toRent(address, propType, bathrooms, bedrooms, sqMetres,
        ID, (Agent)branchWD.getPerson(index), monthlyPrice, weeklyPrice, animals);
        branchWD.addProperty(rent1);
    }
    
    public void createBnB()
    {
        String address, propType;
        String ID = "";
        int bathrooms, bedrooms, sqMetres, deposit, price;
        Agent assignedAgent;
        boolean animals;
        
        System.out.println("Enter Address of Property: ");
        address = EasyScanner.nextString();
        while(!(address.length() > 0 && address.length() <= 50))
        {
            System.out.println("Invalid address, maximum characters is set at 50" 
                + "\n Input again: ");
            address = EasyScanner.nextString();
        }
        
        System.out.println("Enter the type of property: (Bungalow, apartment, etc)");
        propType = Properties.propertyTypes();
        
        System.out.println("Enter the number of bedrooms on the property: ");
        bedrooms = EasyScanner.nextInt();

        System.out.println("Enter the number of bathrooms on the property: ");
        bathrooms = EasyScanner.nextInt();

        System.out.println("Enter the size of property (in sq. metres): ");
        sqMetres = EasyScanner.nextInt();
        while(sqMetres < 50 || sqMetres > 200)
        {
            System.out.println("Invalid entry. Min 50 sq.m Max 200 sq.m" +
            "\n Input again: ");
            sqMetres = EasyScanner.nextInt();
        }
        
        System.out.println("Enter nightly price of property: ");
        price = EasyScanner.nextInt();
        while(price < 80)
        {
            System.out.println("Invalid entry, Min. €80");
            price = EasyScanner.nextInt();
        }
        
        System.out.println("Enter the price of a deposit of property: ");
        deposit = EasyScanner.nextInt();
        
        System.out.println("Enter whether property will be furnished on purchase: (true/false)" );
        animals = EasyScanner.nextBoolean();
        
        System.out.println();
        System.out.println("Select the agent to assign to this property");
        System.out.println("\nWaterford Estate Agency's List of Agents: " + "\n" + branchWD.listOfAgents());
        System.out.println("___________________________");
        System.out.println("Please enter the index of the Agent you wish to Assign to this property: ");
        int index = EasyScanner.nextInt();
        
        
        System.out.println("Property ID number: ");
        System.out.println("1. Set ID manually" + "\n2. Automatically generate ID");
        int choose = EasyScanner.nextInt();
        if(choose == 1)
        {
            System.out.println("Please enter ID for Property (9999-99999)");
            int tempID = EasyScanner.nextInt();
            ID = Integer.toString(tempID);
            while(tempID < 9999 || tempID > 99999)
            {
              System.out.println("Invalid ID. Choose number from (9999-99999)");
              tempID = EasyScanner.nextInt();
              ID = Integer.toString(tempID);
            }
        }
        else 
        {
            int tempID = rand.nextInt(99999 - 9999 + 1) + 9999;
            ID = Integer.toString(tempID);
        }
        
        BnB bnb1 = new BnB(address, propType, bathrooms, bedrooms, sqMetres,
        ID, (Agent)branchWD.getPerson(index), deposit, price, animals);
        branchWD.addProperty(bnb1);
    }
    
    public void createProperty()
    {
        int choice;
        System.out.println("\n ______________________");
        System.out.println("What kind of Property do you want to add?.");
        System.out.println("\t 1. New Property to BUY");
        System.out.println("\t 2. New Property to RENT");
        System.out.println("\t 3. New BnB");
        System.out.println("\t\n 0. Cancel");
        System.out.println();
        System.out.print("Enter choice [0-3]: ");
        choice = EasyScanner.nextInt();
        
        if(choice == 1)
        {
            createToBuy();
        }
        else if (choice == 2)
        {
            createToRent();
        }
        else if (choice == 3)
        {
            createBnB();
        }
        else
        {
            System.out.println("Invalid option selected, try again [1-3]");
            choice = EasyScanner.nextInt();
        }
        
    }
    
    //Read
    public void listOfPeopleByName()
    {
        System.out.println("Enter Person's Name: ");
        String name = EasyScanner.nextString();
        System.out.println(branchWD.searchPeopleByName(name));
    }
    
    public void listOfPeopleByID()
    {
        System.out.println("Enter Person's ID: ");
        String ID = EasyScanner.nextString();
        System.out.println(branchWD.searchPeopleByID(ID));  
    }
    
    public void listOfAgentsByID()
    {
        System.out.println("Enter Agent's ID: ");
        String ID = EasyScanner.nextString();
        System.out.println(branchWD.searchAgentsByID(ID));
    }
    
    public void listOfAgentsByName()
    {
        System.out.println("Enter Agent's Name: ");
        String name = EasyScanner.nextString();
        System.out.println(branchWD.searchAgentsByName(name));
    }
    
    public void listOfClientsByID()
    {
        System.out.println("Enter Client's ID: ");
        String ID = EasyScanner.nextString();
        System.out.println(branchWD.searchClientsByID(ID));
    }
    
    public void listOfClientsByName()
    {
        System.out.println("Enter Client's Name: ");
        String name = EasyScanner.nextString();
        System.out.println(branchWD.searchClientsByName(name));
    }
    
    
    public void listOfPropertiesByAddress()
    {
        System.out.println("Enter Address: ");
        String address = EasyScanner.nextString();
        System.out.println(branchWD.searchPropertiesByAddress(address));
    }
    
    public void listOfPropertiesByID()
    {
        System.out.println("Enter ID: ");
        String id = EasyScanner.nextString();
        System.out.println(branchWD.searchPropertiesByID(id));
    }
    
    public void listOfPropsToRentByAddress()
    {
        System.out.println("Enter Address: ");
        String address = EasyScanner.nextString();
        System.out.println(branchWD.searchToRentByAddress(address));
    }
    
    public void listOfPropsToRentByID()
    {
        System.out.println("Enter ID: ");
        String id = EasyScanner.nextString();
        System.out.println(branchWD.searchToRentByID(id));
    }
    
    public void listOfPropsToBuyByAddress()
    {
        System.out.println("Enter Address: ");
        String address = EasyScanner.nextString();
        System.out.println(branchWD.searchToBuyByAddress(address));
    }
    
    public void listOfPropsToBuyByID()
    {
        System.out.println("Enter ID: ");
        String id = EasyScanner.nextString();
        System.out.println(branchWD.searchToBuyByID(id));
    }
    
    public void listOfBnBsByAddress()
    {
        System.out.println("Enter Address: ");
        String address = EasyScanner.nextString();
        System.out.println(branchWD.searchBnBByAddress(address));
    }
    
    public void listOfBnBsByID()
    {
        System.out.println("Enter ID: ");
        String id = EasyScanner.nextString();
        System.out.println(branchWD.searchBnBByID(id));
    }
    //Delete
    
    public void deletePerson()
    {
        System.out.println("Waterford Branch List of involved Persons: " + branchWD.listOfPeople());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the Individual to be removed:  ");
        int index = EasyScanner.nextInt();
        branchWD.removePeople(index);
        System.out.println("Person removed from system");
    }
    
    public void deleteAgent()
    {
        System.out.println("Waterford Branch List of Agents: " + branchWD.listOfAgents());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the Agent to be removed:  ");
        int index = EasyScanner.nextInt();
        branchWD.removePeople(index);
        System.out.println("Agent removed from system");
    }
    
    public void deleteClient()
    {
        System.out.println("Waterford Branch List of Clients: " + branchWD.listOfClients());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the Client to be removed:  ");
        int index = EasyScanner.nextInt();
        branchWD.removePeople(index);
        System.out.println("Client removed from system");
    }
    
    public void deleteProperty()
    {
        System.out.println("Waterford Branch List of Properties: " + branchWD.listOfProperties());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the Property to be removed:  ");
        int index = EasyScanner.nextInt();
        branchWD.removeProperty(index);
        System.out.println("Property removed from system");
    }
    
    public void deleteToBuy()
    {
        System.out.println("Waterford Branch List of Properties to buy: " + branchWD.listOfToBuy());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the Property to be removed:  ");
        int index = EasyScanner.nextInt();
        branchWD.removeProperty(index);
        System.out.println("Property removed from system");
    }
    
    public void deleteToRent()
    {
        System.out.println("Waterford Branch List of Properties to rent: " + branchWD.listOfToRent());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the Property to be removed:  ");
        int index = EasyScanner.nextInt();
        branchWD.removeProperty(index);
        System.out.println("Property removed from system");
    }
    
    public void deleteBnB()
    {
        System.out.println("Waterford Branch List of BnB's: " + branchWD.listOfBnB());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the BnB to be removed:  ");
        int index = EasyScanner.nextInt();
        branchWD.removeProperty(index);
        System.out.println("BnB removed from system");
    }
    
    
    public void printPersonsID()
    {
        System.out.println("Waterford Branch list of Involed Person's: " + branchWD.listOfPeople());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the Person you wish to print");
        int index = EasyScanner.nextInt();
        System.out.println(branchWD.getPerson(index).printID());
    }
    
    public void printAgentID()
    {
        System.out.println("Waterford Branch list of Agents: " + branchWD.listOfAgents());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the Agent you wish to print:  ");
        int index = EasyScanner.nextInt();
        System.out.println(branchWD.getPerson(index).printID()); 
    }
    
    public void printClientID()
    {
        System.out.println("Waterford Branch list of Clients: " + branchWD.listOfClients());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the Client you wish to print:  ");
        int index = EasyScanner.nextInt();
        System.out.println(branchWD.getPerson(index).printID());
    }
    
    
    public void printPropertyID()
    {
        System.out.println("Waterford Branch list of Properties: " + branchWD.listOfProperties());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the Property you wish to print:  ");
        int index = EasyScanner.nextInt();
        System.out.println(branchWD.getProperty(index).printID());
    }
    
    
    public void printToBuyID()
    {
        System.out.println("Waterford Branch list of Properties to Buy: " + branchWD.listOfToBuy());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the Property you wish to print:  ");
        int index = EasyScanner.nextInt();
        System.out.println(branchWD.getProperty(index).printID());
    }
    
   
    public void printToRentID()
    {
        System.out.println("Waterford Branch list of Properties to Rent: " + branchWD.listOfToRent());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the Property you wish to print:  ");
        int index = EasyScanner.nextInt();
        System.out.println(branchWD.getProperty(index).printID());
    }
    
    public void printBnBID()
    {
        System.out.println("Waterford Branch list of BnB's: " + branchWD.listOfBnB());
        System.out.println("______________________________");
        System.out.println("Enter the Index of the Property you wish to print:  ");
        int index = EasyScanner.nextInt();
        System.out.println(branchWD.getProperty(index).printID());
    }
    
    
    
    
    public void bestMatch()
    {
        System.out.println("Waterford Branch list of Clients: " + branchWD.listOfClients());
        System.out.println("______________________________");
        System.out.println("Select which Client you want to find the best match for:");
        String findID = EasyScanner.nextString();
        Client a = branchWD.getClientByID(findID);
        while(a == null)
        {
            System.out.println("ID invalid, please input again: ");
            findID = EasyScanner.nextString();
            if(findID.equals("0"))
            {
                return;
            }
            a = branchWD.getClientByID(findID);
        }
        
        String aChoice = a.getLookingTo();
        
        String buy = "Buy";
        String rent = "Rent";
        String bnb = "Let a BnB";
        System.out.println("Most suitable properties for Client are: \n");
        
        if (aChoice.equals(buy))
        {
            System.out.println(branchWD.listOfToBuy());
        }
        else if (aChoice.equals(rent))
        {
            System.out.println(branchWD.listOfToRent());
        }
        else if (aChoice.equals(bnb))
        {
            System.out.println(branchWD.listOfBnB());
        }
    }
}
