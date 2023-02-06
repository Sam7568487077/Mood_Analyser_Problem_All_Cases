import java.util.Arrays;
import java.util.Scanner;

public class MoodAnalyser {
    Scanner sc = new Scanner(System.in);


    public void analyseMood(String message) {
        String happy = "happy";
        String sad = "sad";
        String mood = null;
        String[] messageSplit = message.split(" ");
        for(int i=0;i<messageSplit.length;i++) {
            if (messageSplit[i].equals(happy))
            {
                mood = "Happy";

            }
            else {
                mood = "Sad";
            }
        }
        System.out.println(mood);
    }
}
