package ex2;

import dinosaurs.Dinosaur;
import dinosaurs.DinosaurType;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exercise2 {
    public static void main(String[] args) {
        Predicate<Dinosaur> isCarnivore = dinosaur -> dinosaur.getDinoType() == DinosaurType.CARNIVORE;
        Supplier<Dinosaur> newDino = () -> new Dinosaur("Dino" + LocalTime.now().getSecond(), 200);
        Consumer<Dinosaur> printName = dino -> System.out.println(dino.getName());
        Function<Dinosaur, String> dinoDiet = dinosaur -> switch (dinosaur.getDinoType()) {
            case CARNIVORE -> "Chickens & Rodents";
            case HERBIVORE -> "Grass & Leaves";
            case OMNIVOROUS -> "Chickens & Corn";
            case null, default -> "No Specified Type!";
        };

        Dinosaur dino = newDino.get();

        System.out.println("Is " + dino.getName() + " a carnivore? " + isCarnivore.test(dino));
        System.out.println(dino.getName() + " eats " + dinoDiet.apply(dino));

        dino.setDinoType(DinosaurType.CARNIVORE);
        System.out.println("Is " + dino.getName() + " a carnivore? " + isCarnivore.test(dino));
        System.out.println(dino.getName() + " eats " + dinoDiet.apply(dino));

        printName.accept(dino);
    }
}
