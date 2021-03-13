
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greatestNum = 0;
        if(number1 > number2 && number1 > number3){
            greatestNum = number1;
        }
        if(number2 > number1 && number2 > number3){
            greatestNum = number2;
        }
        if(number3 > number1 && number3 > number2){
            greatestNum = number3;
        }
        if(greatestNum == 0){
            greatestNum = number1;
        }
        return greatestNum;
    }

    public static void main(String[] args) {
        int result = greatest(-5, -8, -4);
        System.out.println("Greatest: " + result);
    }
}
