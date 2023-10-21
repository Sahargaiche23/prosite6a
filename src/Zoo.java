public class Zoo {
  final Aquatic[] aquaticAnimals = new Aquatic[10];

    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                break;
            }
        }
    }

    public void swimAllAquaticAnimals() {
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                aquatic.swim();
            }
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                float depth = ((Penguin) aquatic).getSwimmingDepth();
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int numDolphins = 0;
        int numPenguins = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                numDolphins++;
            } else if (aquatic instanceof Penguin) {
                numPenguins++;
            }
        }

        System.out.println("Number of Dolphins: " + numDolphins);
        System.out.println("Number of Penguins: " + numPenguins);
    }
    }
