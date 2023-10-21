public  class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String name, int age, float swimmingDepth) {
        super(name, age, "Antarctica");
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming in the cold waters.");
    }
}