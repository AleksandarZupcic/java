
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;
        while(true){
            sentence = scanner.nextLine();
            if(sentence.equals("")){
                break;
            }
            else{
                String[] splitSentence = sentence.split(" ");
                for(int i = 0; i < splitSentence.length; i++){
                    System.out.println(splitSentence[i]);
                }
            }
        }
    }
}
