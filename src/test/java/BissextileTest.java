import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BissextileTest {
    @Test
    public void shouldReturnFalse(){
            assertEquals(false, Bissextile.apply(1));
        }

        @Test
        public void shouldReturnTrue(){
        assertEquals(true, Bissextile.apply(4));
    }

    @Test
    public void eightShouldReturnTrue(){
        assertTrue(Bissextile.apply(8));

    }
    @Test
    public void hundredShouldReturnFalse(){
        assertEquals(false, Bissextile.apply(100));
    }
    @Test
    public void fourhundredShouldReturnTrue() { assertEquals( true, Bissextile.apply(400 ));}
    @Test
    public void twothousandfourShouldReturnTrue()  {assertEquals( true, Bissextile.apply(2004));}
}

