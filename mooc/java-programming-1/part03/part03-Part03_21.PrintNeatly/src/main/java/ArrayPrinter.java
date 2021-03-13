
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {75, 61, 21, 57, 53, 106, 90, 122, 14, 46, 45, 39, 114, 28, 142, 9, 100, 31, 89, 39};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for(int i = 0; i < array.length; i++){
            if(array[i] != array[array.length - 1]){
                System.out.print(array[i] + ", ");
            }
            else{
                System.out.println(array[i]);
            }
        }
    }
}
