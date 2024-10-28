//import java.awt.Choice;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    private static String choice = null;

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        
        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        Scanner scan = new Scanner(System.in);
        do {
        	displayMenu();
            choice = scan.nextLine();
            switch (choice) {     
            case "1":
            	intakeNewDog(scan);
            	break; 
            case "2":
            	intakeNewMonkey(scan);
            case "3":	
            	//wip
            	reserveAnimal(scan);
            case "4":	
            	printAnimals();
            	break;
            case "5":	
            	printAnimals();
            	break;
            case "6":	
            	printAnimals();
            	break;
            case "q":	
            	break; 
            } 
        } while (!choice.equals("q"));}
    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        
        Dog d = new Dog(name, name, name, name, name, name, name, name, false, name);
        System.out.println("It's not in the system yet! Enter The dogs name again please");
        	d.setName(scanner.nextLine());
        	System.out.println("please enter the breed");
        	d.setBreed(scanner.nextLine());
        	System.out.println("please enter the gender");
        	d.setGender(scanner.nextLine());
        	System.out.println("please enter the dogs age");
        	d.setAge(scanner.nextLine());
        	System.out.println("please enter the dogs weight");
        	d.setWeight(scanner.nextLine());
        	System.out.println("please enter date you aquired the dog");
        	d.setAcquisitionDate(scanner.nextLine());
        	System.out.println("please enter training status");
        	d.setTrainingStatus(scanner.nextLine());
        	System.out.println("Is the dog reserved? (please enter true or false)");
        	d.setReserved(scanner.nextLine());
        	System.out.println("please enter the country of the dog");	
        	d.setInServiceCountry(scanner.nextLine());
        	dogList.add(d);

        	
        // Add the code to instantiate a new dog and add it to the appropriate list
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
           System.out.println("What is the monkey's name?");
           String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis Monkey is already in our system\n\n");
                    return;    	
                }
            }
            
        	
        Monkey m = new Monkey(choice, choice, choice, choice, choice, choice, choice, choice, false, choice, 0, 0, 0, choice);
        System.out.println("That monkey is not yet in our system! Please enter name");
        m.setName(scanner.nextLine());
        System.out.println("please enter the breed");
        m.setBreed(scanner.nextLine());
        System.out.println("please enter the gender");
        m.setGender(scanner.nextLine());
        System.out.println("please enter the age");
        m.setAge(scanner.nextLine());
        System.out.println("please enter the weight");
        m.setWeight(scanner.nextLine());
        System.out.println("please enter the date aquired");
        m.setAcquisitionDate(scanner.nextLine());
        System.out.println("please enter the training status");
        m.setTrainingStatus(scanner.nextLine());
        System.out.println("please enter if it's reserved");
        m.setReserved(scanner.nextLine());
        System.out.println("please enter what country it is stationed");
        m.setInServiceCountry(scanner.nextLine());
        System.out.println("please enter the tail length");
        m.settailLength(scanner.nextDouble());
        System.out.println("please enter name the height");
        m.setHeight(scanner.nextDouble());
        System.out.println("please enter please the length");
        m.setbodyLength(scanner.nextDouble());
        System.out.println("please enter Species");
        m.setSpecies(scanner.next());        
        System.out.println("Monkey Set!");
        }
        
        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	Scanner scan = new Scanner(System.in);
            System.out.println("would you like to search by dog or monkey?");
            dogList.get(0);
            monkeyList.get(0);
            
            choice = scan.nextLine();
            if(choice.equals("dog")) {
        		System.out.println("would please type in a country you would like to look for a dog in"); 
        		for(Dog dog: dogList) {
        			choice = scan.nextLine();
                    if(dog.inServiceCountry().equalsIgnoreCase(choice)) {
                        System.out.println(dog.getName() +  " needs a owner!");
                        System.out.println("Would you like to adopt the dog? (please type Y/N in caps)");
                        choice = scan.nextLine();
                        if(choice.equals("Y")) {
                        	System.out.println("ok! It's set in reserved!");
                        	dog.setReserved("True");
                        	return;
                        }
                        if(choice.equals("N")) { 
                        	System.out.println("ok! returning to main menu!");
                        	return;
                        } else {
                        	System.out.println("not a y or no! returning to main menu...");
                        	return;
                        }
            	} else {
            		System.out.println("No avaliable animals in that location. I'm sorry!");
            		System.out.println("taking you back to menu...");
            	}
       }
    } else if(choice.equals("monkey")) {
    	System.out.println("would please type in a country you would like to look for a Monkey in");
    	choice = scan.nextLine();
        if(Monkey.inServiceCountry().equalsIgnoreCase(choice)) {
            System.out.println("one needs a owner!");
            System.out.println("Would you like to adopt the Monkey? (please type Y/N in caps)");
            choice = scan.nextLine();
            if(choice.equals("Y")) {
            	System.out.println("ok! It's set in reserved!");
            	Monkey.setReserved("True");
            	return;
            }
            if(choice.equals("N")) { 
            	System.out.println("ok! returning to main menu!");
            	return;
            } else {
            	System.out.println("not a y or no! returning to main menu...");
            	return;
            }
        } else {
        	System.out.println("No avaliable animals in that location. I'm sorry!");
    		System.out.println("taking you back to menu...");
        }
    	
  }  else {              
	   System.out.println("Not a dog or monkey! returning to main menu...");
  }
}

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals() {
            //System.out.println("The method printAnimals needs to be implemented");
            
        	if(choice.equals("6")) {
        		for(int i=0; i < dogList.size(); i++) {
        			Dog curr = dogList.get(i);
        			System.out.println(curr.name);      
                    }
        		try {
        		for(int i=0; i < monkeyList.size(); i++) {
        			Monkey curr = monkeyList.get(i);
        			System.out.println(curr.name); 
        		}
        		}
        		catch(Exception e) {
        			System.out.println("No monkeys in the system yet!");
        		}
        	}
    		else if(choice.equals("5")) {
    			try {
        		for(int i=0; i < monkeyList.size(); i++) {
        			Monkey curr = monkeyList.get(i);
        			System.out.println(curr.name); 
        		}
    		}
    			catch (Exception e) {
    				System.out.println("No monkeys in the system yet!");
    			}
    	}
        		
        	else if(choice.equals("4")) {
        		for(int i=0; i < dogList.size(); i++) {
        			Dog curr = dogList.get(i);
        			System.out.println(curr.name); 
        		}


        		}
            

        }
		public static ArrayList<Monkey> getMonkeyList() {
			return monkeyList;
		}
		public static void setMonkeyList(ArrayList<Monkey> monkeyList) {
			Driver.monkeyList = monkeyList;
		}
		
}

