import java.util.Arrays;
import java.util.Scanner;

public class MoodAnalyser {
    Scanner sc = new Scanner(System.in);


    public void analyseMood(String message) {
        try {
            if (message == null) {
                throw new ExceptionTest("Null point exception Occurred");
            }

                if (message.contains("happy")) {
                    System.out.println("Happy");
                } else {
                    System.out.println("Sad");
                }
        }
        catch(ExceptionTest n)
        {
            System.out.println(n.getMessage());
        }
    }
}
