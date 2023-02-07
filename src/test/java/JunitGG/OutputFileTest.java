package JunitGG;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class OutputFileTest
{
    private File output;

    @Before
    public void createOutputFile()
    {
        output = new File("file.io");
    }

    @After
    public void deleteOutputFile()
    {
        output.delete();
    }

    @Test
    public void testFile1()
    {
        // code for test case objective
    }
    @Test public void testFile2()
    {
        // code for test case objective
    }
}

/*Execution chain

 CreateOutputFile() -> testFile1() -> deleteOutputFile() ->CreateOutputFile() -> testFile2() -> deleteOutputFile()

 or more readable

1.createOutputFile()
2.testFile1()
3.deleteOutputFile()
4.createOutputFile()
5.testFile2()
6.deleteOutputFile()

Still, assumption that testFile1() will run before testFile2() is not guaranteed
 */

