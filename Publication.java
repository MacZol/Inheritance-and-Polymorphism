
/**
 * Write a description of class Publication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Publication
{
    // instance variables - replace the example below with your own
    private String tl;      // title
    private int yr;         // year

    /**
     * Constructor for objects of class Publication
     */
    public Publication(String title, int year)
    {
        // initialise instance variables
        tl = title;
        yr = year;
    }
    
    // Accessor to get title
    public String getTitle()
    {
        return tl;
    }
    
    // Accessor to get year
    public int getYear()
    {
        return yr;
    }
}
