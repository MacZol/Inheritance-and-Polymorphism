/**
 * A simple model of a Journal
 * 
 * @author  (Maciek Zolyniak)
 * @version (1.0)
 */
public class Journal extends Publication
{
    // The month when the journal was published
    private int month;

    /**
     * Create a journal. 
     * 
     * @param title     The title of the journal.
     * @param month     The month when the journal was published.
     * @param year      The year when the journal was published.     
     */
    public Journal(String title, int year, int month)
    {
        super(title, year);
        this.month = month;

    }
    
    // If the journals title, month and year is the same the journals will be treated the same
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        if(!(obj instanceof Journal))
        {
            return false;
        }
        
        // Super accessing the super class and all of itss methods, here its getting the title and year
        Journal other = (Journal) obj;
        return super.getTitle().equals(other.getTitle()) && month == (other.month) && super.getYear() == (other.getYear());
    }
    

    /**
     * Get the month of the journal when it was published
     *  
     * @return  The month of the journal when it was published
     */
    public int getMonth()
    {
        return month;
    }
    
    // Replaced the print method with a toString
    public String toString()
    {
        // Returns details of journal
        return "Journal: " + super.getTitle() + " (" + getMonthName(month) + " " + super.getYear() + ")";
    }
    
    /**
     * To get the first three letters of a given month's name
     * 
     * @param month A given month
     * @return   The first three letters of the given month's name
     */
    private String getMonthName(int month) {
        switch (month) {
            case 1: return "Jan";
            case 2: return "Feb";
            case 3: return "Mar";
            case 4: return "Apr";
            case 5: return "May";
            case 6: return "Jun";
            case 7: return "Jul";
            case 8: return "Aug";
            case 9: return "Sep";
            case 10: return "Oct";
            case 11: return "Nov";
            case 12: return "Dec";
            default: return "Unknow";
        }
    }    
}
