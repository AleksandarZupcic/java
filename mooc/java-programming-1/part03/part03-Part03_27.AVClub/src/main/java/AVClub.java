
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;
        while(true){
            sentence = scanner.nextLine();
            if(sentence.equals("")){
                break;
            } else{
                String sentenceSplit[] = sentence.split(" ");
                for(int i = 0; i < sentenceSplit.length; i++){
                    if(sentenceSplit[i].contains("av")){
                        System.out.println(sentenceSplit[i]);
                    }
                }
            }
        }
    }
}
