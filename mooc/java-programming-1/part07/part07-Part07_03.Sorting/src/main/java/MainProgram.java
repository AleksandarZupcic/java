import java.io.*; 
import java.util.*; 
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
        if(array.length == 1) return array[0];
        int smallest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int indexSmallest = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == smallest(array)){
                indexSmallest = i;
                break;
            }
        }
        return indexSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int[] slicedArr = new int[table.length - startIndex];
        int counter = 0;
        for(int i = startIndex; i < table.length; i++){
            slicedArr[counter] = table[i];
            counter++;
        }
        
        int diff = table.length - slicedArr.length;
        return diff + indexOfSmallest(slicedArr);
    }
    
    public static void swap(int[] array, int index1, int index2){
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}
