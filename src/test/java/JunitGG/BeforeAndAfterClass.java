package JunitGG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeforeAndAfterClass {

    @Test
    public void testSetup() {
        String str = "I did it";
        assertEquals("I did it",str);
        //assertEquals("I am done with Junit",str);
    }

    @BeforeClass
    public static void methodToExecuteBefore() {
        System.out.println("------------------");
        System.out.println("Before");
        System.out.println("------------------");
    }

    @AfterClass
    public static void methodToExecuteAfter() {
        System.out.println("------------------");
        System.out.println("After");
        System.out.println("------------------");
    }

}
