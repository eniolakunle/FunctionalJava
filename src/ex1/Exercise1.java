package ex1;

import dinosaurs.Dinosaur;
import dinosaurs.DinosaurHandler;

public class Exercise1 {
    public static void main(String[] args) {
        // Exercise 1:
        Dinosaur dino = new Dinosaur("Triceratops", 500);
        DinosaurHandler handler = d -> d.setWakeStatus( !d.getWakeStatus() );
        String status;

        for (int i = 0; i < 2; i++){
            handler.handle(dino);
            if (dino.getWakeStatus())
                status = dino.getName() + " is awake!";
            else
                status = dino.getName() + " is asleep";
            System.out.println(status);
        }

    }
}
