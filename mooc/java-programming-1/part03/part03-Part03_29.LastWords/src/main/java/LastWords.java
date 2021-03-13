
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;
        while (true) {
            sentence = scanner.nextLine();
            if (sentence.equals("")) {
                break;
            } else {
                String[] sentenceSplit = sentence.split(" ");
                System.out.println(sentenceSplit[sentenceSplit.length - 1]);
            }
        }
    }
}
