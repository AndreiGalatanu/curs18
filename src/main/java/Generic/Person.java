package Generic;

public class Person implements Displayble {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String display(){
        return "My name is "+name;
    }


}
