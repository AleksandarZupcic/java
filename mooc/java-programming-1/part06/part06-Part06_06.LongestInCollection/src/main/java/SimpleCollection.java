
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest(){
        if(this.elements.size() == 0) return null;
        
        String longlong = "";
        for(String s : this.elements){
            if(longlong.length() < s.length()){
                longlong = s;
            }
        }
        return longlong;
    }
}
