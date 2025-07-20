package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Lambdas {
    public static void main(String[] args) {
//        Exercise 17.6
//        (a)
        DoubleBinaryOperator multiply = (double a, double b) -> a * b;
        System.out.println(multiply.applyAsDouble(14,2));

//        (b)
        DoubleBinaryOperator multiply2 = (a, b) -> a * b;
        System.out.println(multiply2.applyAsDouble(2,5));

//        (c)
        DoubleBinaryOperator multiply3 = (a, b) -> {return a * b;};
        System.out.println(multiply2.applyAsDouble(7,5));

//        (d)
        Supplier<String> welcome = () -> "Welcome to Lambdas!";
        System.out.println(welcome.get());

//        (e)
        Supplier<List<String>> myList = ArrayList::new;
        List<String> list = myList.get();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
     }
}

