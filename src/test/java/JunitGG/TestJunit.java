package JunitGG;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {

    @Test
    public void testSetup() {
        String str = "I did it";
        assertEquals("I did it",str);
        //assertEquals("I am done with Junit",str);
    }
}
