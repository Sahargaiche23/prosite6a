class Dolphin extends Aquatic {
    public Dolphin(String name, int age) {
        super(name, age, "Ocean");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin is swimming in the ocean.");
    }
}