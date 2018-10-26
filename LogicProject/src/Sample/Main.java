package Sample;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    	Scanner reader = new Scanner(System.in);
    	String userInput;
    	int counter = 0;

    	List<Idea> ideaList = new ArrayList<>();
    	List<Idea> goodIdeas = new ArrayList<>();
    	List<Idea> badIdeas = new ArrayList<>();

    	boolean isFinished = false;

    	while(isFinished = false) {
    		System.out.println("Please enter the name of your idea:\n>");
    		userInput = reader.nextLine();

    		ideaList.add(new Idea(userInput));

    		enterValues(ideaList.get(counter));

    		counter++;
    		System.out.println("Do you have another idea? [yes or no]\n>");
    		userInput = reader.nextLine();

    		isFinished = booleanInput(userInput);
		}

		for(Idea i: ideaList) {
			enterValues(i);

			if(i.isIdeaWorthy() == true)
				goodIdeas.add(i);
			else
				badIdeas.add(i);
		}

		System.out.println("Bad ideas: " + badIdeas);
		System.out.println("Good ideas : " + goodIdeas);
    }



	public static void enterValues(Idea i) {
		Scanner reader = new Scanner(System.in);
		String userInput;

		System.out.print("How many attributes does your idea have?\n>");
		userInput = reader.nextLine();

		i.setAttributes(Integer.parseInt(userInput));

		System.out.print("Has the teacher approved of your project idea? [yes or no]\n>");
		userInput = reader.nextLine();

		i.setApproval(booleanInput(userInput));

		System.out.print("Does your idea contain objects? [yes or no]\n>");
		userInput = reader.nextLine();

		i.setObjects(booleanInput(userInput));

		System.out.print("Is your idea cool? [yes or no]\n>");
		userInput = reader.nextLine();

		i.setCoolness(booleanInput(userInput));

		System.out.print("Is your idea unique? [yes or no]\n>");
		userInput = reader.nextLine();

		i.setUniqueness(booleanInput(userInput));
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
