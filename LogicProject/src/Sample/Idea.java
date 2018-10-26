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
    public boolean getObjects ()
    {
        return containsObjects;
    }
    public boolean getCoolness ()
    {
        return isCool;
    }
    public boolean getUniqueness () {
    	return isUnique;
	}

}
