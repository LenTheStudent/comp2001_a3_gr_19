

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testConstructor()
    {
        SalesItem salesIte1 = new SalesItem("Bike", 100);
        assertEquals(100, salesIte1.getPrice());
        assertEquals("Bike", salesIte1.getName());
        assertEquals(0, salesIte1.getNumberOfComments());
    }
    
    @Test
    public void getRatingTest()
    {
        SalesItem salesIte2 = new SalesItem("Bike", 100);
        Comment comment2 = new Comment("Corey", "This bike is bunk.", 2);
        assertEquals(2, comment2.getRating());
    }

    @Test
    public void ratingsInvalidTest()
    {
        SalesItem salesIte1 = new SalesItem("Bike", 100);
        Comment comment1 = new Comment("Corey", "This is the best bike ever.", 6);
        assertEquals(true, salesIte1.ratingInvalid(6));
        assertEquals(true, salesIte1.ratingInvalid(-1));
        assertEquals(false, salesIte1.ratingInvalid(1));
    }


    @Test
    public void findCommentByAuthorTest()
    {
        SalesItem salesIte2 = new SalesItem("Bike", 100);
        Comment comment2 = new Comment("test", "review", 5);
        assertEquals("test", salesIte2.findCommentByAuthor("test"));
    }

    @Test
    public void findMostHelpfulCommentTest()
    {
        SalesItem salesIte1 = new SalesItem("Bike", 100);
        Comment comment1 = new Comment("Corey", "This bike bikes", 2);
        Comment comment2 = new Comment("Bob", "This bike bikes poorly", 1);
        comment1.upvote();
    }
}

