package kata;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordWraperUnitTest {

    @Test
    public void shouldReturnNullWithNullString(){
        assertEquals(WordWraper.wrap(null, 0), null);
    }

    @Test
    public void shouldReturnEmptyStringWithNullString(){
        assertEquals(WordWraper.wrap("", 0), "");
    }

    @Test
    public void shouldReturnItselfWithLongerColPrm(){
        assertEquals(WordWraper.wrap("asas", 5), "asas");
    }

    @Test
    public void shouldReturn(){

    }
}
