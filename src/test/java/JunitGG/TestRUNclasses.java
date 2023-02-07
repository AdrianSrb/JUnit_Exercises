package JunitGG;

import JunitGG.TestJunit;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRUNclasses {


        public static void main(String[] args) {

            Result result = JUnitCore.runClasses(TestJunit.class);

//            for (Failure failure : result.getFailures()) {
//
//                System.out.println(failure.toString());
//            }

            Result result_2 = JUnitCore.runClasses(AnnotationsExample.class);

            for (Failure failure : result_2.getFailures()) {

                System.out.println(failure.toString());
            }

            //System.out.println("Result: " + result.wasSuccessful());
            System.out.println("Result: "+result_2.wasSuccessful());
        }

}
