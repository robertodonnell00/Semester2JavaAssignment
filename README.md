# Semester 2 Java Assignment
(Project was made in BlueJ)

## Description
This system was designed for an Estate Agency. It is a CRUD system, meaning you can create, read, update, and delete information on the system. It is designed so that the Agency can keep track of their agents, clients, and properties. It breaks properties down into categories such as: Properties to Rent, to Buy and BnB properties. It keeps track of all the house keeping details of all the essential information that the agency would want about their properties, clientele, and staff. They can add, remove, and read all the information stored on the system easily. 

## The features and components of the program
The system can save and load information over long term. Information is loaded automatically and saves automatically on termination. There is also the option to save manually on the main menu.
There are multiple menus on the system, for people, for agents, clients, for properties, to rent, to buy, and BnB’s. There is also a main menu. 
Everything created has a unique ID that you can enter manually or generate automatically.
There are mini menus throughout the system for ease of creation. For example, when making a property, you are asked to when specify the type of property i.e., bungalow, semi-detached. Instead of manually entering the same information for different properties there is a mini menu that lets you select an option like 1) Bungalow 2) Two-Storey, etc. You also have the option to manually enter the type of property. Similar menus appear when making ID’s and picking what the client is looking for.
You can assign an Agent to a property and when printing the property details, the system will print an id card for the agent instead of all the agent’s details.
The system allows you to find an appropriate property for a client based on what they’re looking for.
You can create new people or properties easily whether from their respective menu’s or from their more general menus.

## An explanation of how I incorporated the five required concepts from the brief
-	Inheritance – Made 2 super classes. The first was for people who were involved with the company. “People” was the name of the super class, “Agent” and “Client” were the names of the subclasses. The super class had basic housekeeping info that is needed for all people like name, email address, date of birth and an ID. Agent and Client inherited those details from the people class and had variables of their own. For example, Agent class had commission rate, number of sales and year joined. The same was done for Properties, toBuy, toRent, and BnB were subclasses of Properties.
-	Persistence – Using Xstream, I made it so once you run the program it automatically loads the necessary xml sheets and once you close the system it saves automatically. There is also an option to save manually from the main menu.
-	Polymorphism – I used polymorphism to save different object types together, eg Agents and Clients were saved together in People.
-	Abstraction – I used abstraction for the ID’s. Every object created needed to have an ID but I thought their needed to be some way to distinguish between ID’s just by looking at them. So, in the People and Properties super classes, I made an abstract String method called classID(). This was so that in their sub-classes, there needed to be a method called classID() that would return a value for each individual class. Eg, the agent class returns, agt. The Client class returns clt, etc. This was so once a person looked an id like “clt123”, they could instantly know it’s a client and “agt456” would be an agent.

## Help Received
Catherine Fitzpatrick, lecture notes and lab sheets for semester 2
Padraig Crotty, former SETU who graduated last year doing Applied Computing. Padraig helped me with the Casting used throughout the project. 



