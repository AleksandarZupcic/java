
public class AdvancedAstrology {

    public static void printStars(int number) {
        while(number > 0){
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        while(number > 0){
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        int initSize = size;
        while(size > 0){
            size--;
            printSpaces(size);
            printStars(initSize - size);
        }
    }

    public static void christmasTree(int height) {
        int tree = 1;
        int initHeight = height;
        
        while(height > 0){
            height--;
            printSpaces(height);
            printStars(tree);
            tree += 2;
        }
        
        printSpaces(initHeight - 2);
        printStars(3);
        printSpaces(initHeight - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
