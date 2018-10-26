package Sample;

public class Idea {
	 
    private int numAttributes;
    private boolean teacherApproved;
    private boolean containsObjects;
    private boolean isCool;
    private boolean isUnique;

    public Idea(int a, boolean t, boolean c, boolean is, boolean iu) {
        numAttributes = a;
        teacherApproved = t;
        containsObjects = c;
        isCool = is;
        isUnique = iu;
    }
    
    public Idea() {
    	numAttributes = 0;
    	teacherApproved = false;
    	containsObjects = false;
    	isCool = false;
    	isUnique = false;
	}

    public void setAttributes (int a)
    {
        numAttributes = a;
    }
    public void setApproval (boolean t)
    {
        teacherApproved = t;
    }
    public void setObjects (boolean c)
    {
        containsObjects = c;
    }
    public void setCoolness (boolean i)
    {
        isCool = i;
    }
    public void setUniqueness (boolean i) {
    	isUnique = i;
	}

    public int getAttributes ()
    {
        return numAttributes;
    }
    public boolean getApproval ()
    {
        return teacherApproved;
    }
    public boolean getObjects () {   return containsObjects; }
    public boolean getCoolness ()
    {
        return isCool;
    }
    public boolean getUniqueness () {
    	return isUnique;
	}

    public void isIdeaWorthy (Idea idea1) {
        if (numAttributes < 5)
            System.out.println("It needs to have at least 5 attributes!");

        if (!teacherApproved)
            System.out.println("Get his/her approval before using it! Make it school appropriate!");

        if (!containsObjects)
            System.out.println("This is literally the point of the project.");

        if (!isCool)
            System.out.println("A cool idea will help the lessons stick more!");

        if (!isUnique)
            System.out.println("Make your own idea! Be creative!");
        else
            System.out.println("Ooh!, very creative!");
    }
}
