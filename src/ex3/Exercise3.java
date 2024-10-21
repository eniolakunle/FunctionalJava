package ex3;

import dinosaurs.Dinosaur;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Exercise3 {
    public static void main(String[] args) {
        int[] dinoCount = {0}; // is allowed as value/reference does not change, but the state of the reference does.
//        int dinoCount = 0; //variable must be final or effectively final (not allowed to change), this does not compile.
        Consumer<List<Dinosaur>> increaseDino = list -> {
            list.add(new Dinosaur("Dino" + dinoCount, 45));
            dinoCount[0]++;
//            dinoCount++;
        };
        increaseDino.accept(new ArrayList<Dinosaur>());
        System.out.println(dinoCount[0]);
//        System.out.println(dinoCount);
    }}

