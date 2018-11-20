import java.util.ArrayList;

/**
 * A database for collections of publications, e.g. books and journals
 * 
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Database
{
    // A collection of books
    private ArrayList<Publication> pubList;

    /**
     * Create a new database
     */
    public Database()
    {
        // New array list
        pubList = new ArrayList<Publication>();

    }
    
    public void addPublication(Publication publication)
    {
        if(pubList.contains(publication))
        {
            // Checks if the publication is already in the list
            System.out.println("This publication is already added");
            System.out.println(publication);
        }
        else
        {
            // If it is not, it adds it in.
            pubList.add(publication);
        }
    }
    
    /**
     * Get the total number of collections 
     * 
     * @return The total number of collections  
     */
    public int getTotal() {
        return pubList.size();
    }    
    
    
    // Method that deletes publications before a given year
    public void deletePublicationsBeforeYear(int year)
    {
        int counter = 0;
        // Access array list
        for ( Publication pub: pubList)
        {
            if(year >= pub.getYear())
            pubList.remove(pub);
            counter++;
            
        }
        // Message saying how many were removed
        System.out.println("Number deleted: " + counter);
    }
   
    
    
    /** 
     * 
     * Print the details of all collections
     */
    public void printList() {
        // for (Journal jrnl : journalList)
        // {
        //    System.out.println(jrnl.toString());
        // }
        {
            for (Publication pub : pubList)
            {
                System.out.println(pubList);
            }
        }
    }
    
    
}
