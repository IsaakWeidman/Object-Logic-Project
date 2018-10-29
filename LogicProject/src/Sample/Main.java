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

//    	if(isFinished == false) {
//    		System.out.println("If");
//
//			System.out.print("Please enter the name of your idea:\n>");
//			userInput = reader.nextLine();
//
//			ideaList.add(new Idea(userInput));
//
//			enterValues(ideaList.get(counter));
//
//			counter++;
//
//			System.out.print("Do you have another idea? [yes or no]\n>");
//			userInput = reader.nextLine();
//
//			isFinished = booleanInput(userInput);
//		}

    	while(!isFinished) {

    		System.out.println("while");

    		System.out.print("Please enter the name of your idea:\n>");
    		userInput = reader.nextLine();

    		ideaList.add(new Idea(userInput));

    		enterValues(ideaList.get(counter));

    		counter++;

    		System.out.print("Do you have another idea? [yes or no]\n>");
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

/*
The Program does NOT work as intended for an unknown reason. For some reason, in the while loop in the main, the first
iteration runs perfectly as it is supposed to. After the first iteration, however, the while loop ignores all the code
except the method call for enterValues(). There is an if statement before the loop with the exact same code as the
while loop in it, and when it is not commented out, the program behaves exactly the same as it did without it. We do not
know how to fix this issue.

//======================================================================================================================

If
Please enter the name of your idea:
>Test
How many attributes does your idea have?
>5
Has the teacher approved of your project idea? [yes or no]
>yes
Does your idea contain objects? [yes or no]
>yes
Is your idea cool? [yes or no]
>yes
Is your idea unique? [yes or no]
>yes
Do you have another idea? [yes or no]
>yes
How many attributes does your idea have?
>5
Has the teacher approved of your project idea? [yes or no]
>yes
Does your idea contain objects? [yes or no]
>yes
Is your idea cool? [yes or no]
>yes
Is your idea unique? [yes or no]
>yes
Bad ideas: []
Good ideas : [Test]

 */
