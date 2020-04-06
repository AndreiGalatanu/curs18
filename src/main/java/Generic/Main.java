package Generic;

import org.assertj.core.error.ConditionAndGroupGenericParameterTypeShouldBeTheSame;
import org.assertj.core.internal.bytebuddy.description.type.TypeList;
import ro.fasttrackit.mvnbase.Recursive;

public class Main {
    public static void main(String[] args) {

        simpleBox();
        genericBox();
        displayBox();
    }

    private static void displayBox() {
        DisplayBox<Person> boxCuPerson=new DisplayBox<>(new Person("Maria"));
        DisplayBox<Laptop> boxCuLaptop=new DisplayBox<>(new Laptop());


        System.out.println(boxCuPerson.displayItem());
        System.out.println(boxCuLaptop.displayItem());

    }

    private static void genericBox() {

        GenericBox<String> boxCuString = new GenericBox("itemu");
        GenericBox<Integer> boxCuIntreg = new GenericBox(new Integer(1));
        GenericBox<Recursive> boxCuRecursive = new GenericBox(new Recursive());

        Object stringBox = boxCuString.getItem();
        Object intregDinBox = boxCuIntreg.getItem();
        Object recursiveDinBox = boxCuRecursive.getItem();


        System.out.println(stringBox);
        System.out.println(intregDinBox);
        System.out.println(recursiveDinBox);


    }

    private static void simpleBox() {
        var boxCuString = new Box("salut");
        var boxCuIntreg = new Box(new Integer(1));
        var boxCuRecursive = new Box(new Recursive());

        Object stringBox = boxCuString.getItem();
        Object intregDinBox = boxCuIntreg.getItem();
        Object recursiveDinBox = boxCuRecursive.getItem();


        System.out.println(stringBox);
        System.out.println(intregDinBox);
        System.out.println(recursiveDinBox);


    }
}
