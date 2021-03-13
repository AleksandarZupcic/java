
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        
        Person comparePerson = (Person) obj;
        if(
            this.name.equals(comparePerson.name) &&
            this.weight == comparePerson.weight &&
            this.birthday.equals(comparePerson.birthday) &&
            this.height == comparePerson.height
        ){
            return true;
        }
        return false;
    }
}
