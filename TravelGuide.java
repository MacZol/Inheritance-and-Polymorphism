
/**
 * Write a description of class TravelGuide here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TravelGuide extends Book
{
    // instance variables - replace the example below with your own
    private String country;

    /**
     * Constructor for objects of class TravelGuide
     */
    public TravelGuide(String title, int year, String author, String publisher)
    {
        super(title, year, author, publisher);
        country = "UK";
    }
    
    // Accessor to get country
    public String getCountry()
    {
        return country;
    }
    
    // Mutator to change country
    public void setCountry(String country)
    {
        this.country = country;
    }
    
    // toString method to print out the details
    public String toString()
    {
        return "Travel Guide " + super.toString() + " Country: " + country;
    }
}
