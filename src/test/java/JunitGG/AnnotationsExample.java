package JunitGG;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AnnotationsExample {

    private ArrayList<String> list;

    @BeforeClass
    public static void m1() {
        System.out.println("                                                     ");
        System.out.println("Using @BeforeClass , executed before all test cases ");
        System.out.println("----------------------------------------------------");
    }

    @Before
    public void m2() {
        list = new ArrayList<String>();
        System.out.println("                                                     ");
        System.out.println("Using @Before annotations ,executed before each test cases ");
        System.out.println("----------------------------------------------------");

    }

    @AfterClass
    public static void m3() {
        System.out.println("                                                     ");
        System.out.println("Using @AfterClass ,executed after all test cases");
        System.out.println("----------------------------------------------------");

    }

    @After
    public void m4() {
        list.clear();
        System.out.println("                                                     ");
        System.out.println("Using @After ,executed after each test cases");
        System.out.println("----------------------------------------------------");

    }

    @Test
    public void m5() {
        list.add("test");
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
    }

    @Ignore
    public void m6() {
        System.out.println("                                                     ");
        System.out.println("Using @Ignore , this execution is ignored");
        System.out.println("----------------------------------------------------");

    }

    @Test(timeout = 10)
    public void m7() {
        System.out.println("                                                     ");
        System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");
        System.out.println("----------------------------------------------------");

    }

//    @Test(expected = NoSuchMethodException.class)
//    public void m8() {
//        System.out.println("                                                     ");
//        System.out.println("Using @Test(expected) ,it will check for specified exception during its execution");
//        System.out.println("----------------------------------------------------");
//
//
//    }

}
