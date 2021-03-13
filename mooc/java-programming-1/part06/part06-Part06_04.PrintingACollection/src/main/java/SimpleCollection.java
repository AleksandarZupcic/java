
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
    
    @Override
    public String toString(){
        if(this.elements.isEmpty()){
            return "The collection "+this.name+" is empty.";
        }
        
        String els = (this.elements.size() == 1) ? "element" : "elements";
        String strReturn = "The collection "+this.name+" has "+this.elements.size()+" "+els+":\n";
        for(String el : this.elements){
            strReturn += el;
            if(!el.equals(this.elements.get(this.elements.size() - 1))){
                strReturn += "\n";
            }
        }
        return strReturn;
    }
    
}
