package dinosaurs;


public class Dinosaur {
    private double weight;
    private final String name;
    private int health = 100;
    private boolean isAwake;
    private DinosaurType dinoType;

    public Dinosaur(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setWakeStatus(boolean bool){
        isAwake = bool;
    }

    public boolean getWakeStatus(){
        return isAwake;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void changeHealth(int deltaHealth) {
        // Positive or negative
        this.health += deltaHealth;

        if (this.health > 100) {
            this.health = 100;
        } else if (this.health < 0) {
            this.health = 0;
        }

    }

    public double getWeight() {
        return this.weight;
    }

    public void setDinoType(DinosaurType dinoType) {
        this.dinoType = dinoType;
    }

    public DinosaurType getDinoType(){
        return dinoType;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

}
