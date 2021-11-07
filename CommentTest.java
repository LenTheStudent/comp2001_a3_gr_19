

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testConstructor()
    {
        Comment comment1 = new Comment("Bill", "Not bad", 3);
        assertEquals("Bill", comment1.getAuthor());
        assertEquals("Not bad", comment1.getComment());
        assertEquals(3, comment1.getRating());
        assertEquals(0, comment1.getVoteCount());
    }

    @Test
    public void testUpvote()
    {
        Comment comment2 = new Comment("author", "comment", 3);
        comment2.upvote();
        assertEquals(1, comment2.getVoteCount());
    }

    @Test
    public void testDownvote()
    {
        Comment comment1 = new Comment("author", "comment", 3);
        comment1.upvote();
        comment1.downvote();
        assertEquals(0, comment1.getVoteCount());
    }
}



