package Sample;

public class Idea {
    int numAttributes = 0;
    boolean teacherApproval = false;
    boolean containsObjects = false;
    boolean isItCool = false;

    public static set(int a, boolean t, boolean c, boolean i)
    {
        numAttributes = a;
        teacherApproval = t;
        containsObjects = c;
        isItCool = i;
    }

    public static int setAttributes (int a)
    {
        numAttributes = a;
    }
    public static boolean setApproval (boolean t)
    {
        teacherApproval = t;
    }
    public static boolean setObjects (boolean c)
    {
        containsObjects = c;
    }
    public static boolean setCoolness (boolean i)
    {
        isItCool = i;
    }

    public static int getAttributes ()
    {
        return numAttributes;
    }
    public static boolean getApproval ()
    {
        return teacherApproval;
    }
    public static boolean getObjects ()
    {
        return containObjects;
    }
    public static boolean getCoolness ()
    {
        return isItCool;
    }

}
