

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        Dolphin dolphin1 = new Dolphin("Dolphin1", 5);
        Penguin penguin1 = new Penguin("Penguin1", 3, 50.0f);

        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(penguin1);

        myZoo.swimAllAquaticAnimals();
        System.out.println("Max Penguin Swimming Depth: " + myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();
    }
}