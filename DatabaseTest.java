

/**
 * The test class DatabaseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DatabaseTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class DatabaseTest
     */
    public DatabaseTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }
    
    public void testAll()
    {
        System.out.println("1 Create database");
        Database db = new Database();
        
        System.out.println("2 Create new book");
        Book bk1 = new Book("Objects First with Java", 2012, "Barnes & Kolling", "Prentice Hall");
        
        // Add publication
        System.out.println("3 Add publication");
        db.addPublication(bk1);
        
        System.out.println("4 Test publications before a year");
        db.deletePublicationsBeforeYear(2020);
        
        
    }
}
