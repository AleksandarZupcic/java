public class Smileys {
    public static void main(String[] args) {
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        String numOfSpaces = (characterString.length() % 2 == 0) ? " " : "  ";
        String inBetween = " " + characterString + numOfSpaces;
        
        smileyRows(inBetween.length() + 4);
        
        System.out.print(":) ");
        System.out.print(characterString + numOfSpaces);
        System.out.println(":)");
        
        smileyRows(inBetween.length() + 4);
    }
    
    private static void smileyRows(int charLength){
        for(int i = 0; i < charLength; i+=2){
            System.out.print(":)");
        }
        System.out.println("");
    }

}
