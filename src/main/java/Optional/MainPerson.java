package Optional;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Optional;

public class MainPerson {
    public static void main(String[] args) {
        var service = new PersonService(
                List.of(
                        new Person("Maria", 33),
                        new Person("Masadia", 3),
                        new Person("Maridasa", 33),
                        new Person("Marasdia", 23),
                        new Person("Mddria", 43)

                        )
        );


        final Optional<Person> byAge = service.getByAge(55);
        if (byAge.isPresent()) {
            System.out.println(byAge.get());
        } else {
            System.out.println("No 55 yod");
        }
        final Optional<Person> person = service.getByName("Gicu");
        if (person.isPresent()) {
            System.out.println(person.get());
        } else {
            System.out.println("no Gicu");
        }

        final Person multePretentii = service.getByName("Georage")
                .orElse(service.getByName("misu")
                        .orElse(service.getByAge(30)
                                .orElse(null)));
        System.out.println(multePretentii);
        final Person not = service.getByName("not")
                .orElseThrow();
    }
}
