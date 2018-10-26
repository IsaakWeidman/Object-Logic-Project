package Sample;

public class Idea {

	private String name;
	 
    private int numAttributes;
    private boolean teacherApproved;
    private boolean containsObjects;
    private boolean isCool;
    private boolean isUnique;

    public Idea(String n, int a, boolean t, boolean c, boolean is, boolean iu) {
    	name = n;
        numAttributes = a;
        teacherApproved = t;
        containsObjects = c;
        isCool = is;
        isUnique = iu;
    }
    
    public Idea(String n) {
    	name = n;
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
	public void setName (String n) {
    	name = n;
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
	public String getname() {
    	return name;
	}

    public boolean isIdeaWorthy () {

        boolean isWorthy;
        if (numAttributes < 5)
            isWorthy = false;

        if (!teacherApproved)
            isWorthy = false;

        if (!containsObjects)
            isWorthy = false;

        if (!isCool)
            isWorthy = false;

        if (!isUnique)
            isWorthy = false;
        else
            isWorthy = true;

        return isWorthy;
    }
}
