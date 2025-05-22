package DominandoInterfacesELambdaEmJava.InterfacesFuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class App {

    public static void main(String[] args) {
        /*Lista imultável*/
        List<User> users = List.of(new User("Maria", 23), new User("João", 19), new User("Ana", 17));

        var consumer = new Consumer<User>() {
            @Override
            public void accept(final User user) {
                System.out.println(user);
            }
        };

        users.forEach(consumer);
        System.out.println();
        users.forEach(System.out::println);
        System.out.println();
        printStringValue(Record::toString, users);
        System.out.println();
        printStringValue(user -> String.valueOf(user.age()), users);
        System.out.println();
        printStringValue(User::name, users);
    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
