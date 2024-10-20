package ex4;

import dinosaurs.Dinosaur;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Exercise4 {
    public static void main(String[] args) {
        //Constructor reference
        BiFunction<String, Integer, Dinosaur> newDino = Dinosaur::new;
        // Static method reference
        Consumer<List<Dinosaur>> sortDinos = Collections::sort;
        // Unbound Instance method reference
        Function<Dinosaur, String> getName = Dinosaur::getName;
        // Bound instance method
        Consumer<String> printName = System.out::println;

        List<Dinosaur> dinos = Arrays.asList(
                newDino.apply("Peter", 500),
                newDino.apply("Paul", 250),
                newDino.apply("James", 316),
                newDino.apply("Jude", 777)
        );

        sortDinos.accept(dinos);
        for (Dinosaur dino: dinos) {
            String name = getName.apply(dino);
            printName.accept(name);
        }


    }
}
