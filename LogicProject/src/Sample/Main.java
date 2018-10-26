package Sample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner reader = new Scanner(System.in);
    	String userInput;
    	
        Idea idea1 = new Idea();
        
        System.out.print("How many attributes does your idea have?\n>");
        userInput = reader.nextLine();
        
        idea1.setAttributes(Integer.parseInt(userInput));
        
        System.out.print("Has the teacher approved of your project idea? [yes or no]\n>");
        userInput = reader.nextLine();
        
        idea1.setApproval(booleanInput(userInput));
        
        System.out.print("Does your idea contain objects? [yes or no]\n>");
        userInput = reader.nextLine();
        
        idea1.setObjects(booleanInput(userInput));
        
        System.out.print("is your idea cool? [yes or no]\n>");
        userInput = reader.nextLine();
        
        idea1.setCoolness(booleanInput(userInput));
        
        System.out.print("Is your idea unique? [yes or no]\n>");
        userInput = reader.nextLine();
        
        idea1.setUniqueness(booleanInput(userInput));
    }
    
    public static boolean booleanInput(String s) {
    	
    	boolean result = false;
    	
    	if(s.equalsIgnoreCase("yes"))
    		result = true;
    	else if(s.equalsIgnoreCase("no"))
    		result = false;
    	
    	return result;
	}
}
