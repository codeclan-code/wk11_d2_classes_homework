import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("War n Peace", "Tolstoy", "Historical");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("War n Peace",book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Tolstoy",book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Historical",book.getGenre());
    }
}
