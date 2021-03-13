
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String mainCharacter = scanner.nextLine();
        System.out.println("What is their job?");
        String theirJob = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+mainCharacter+", who was "+theirJob+".");
        System.out.println("On the way to work, "+mainCharacter+" reflected on life.");
        System.out.println("Perhaps "+mainCharacter+" will not be "+theirJob+" forever.");

    }
}
