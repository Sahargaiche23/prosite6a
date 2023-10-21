import java.util.Objects;

abstract class Aquatic {
    private String name;
    private int age;
    private String habitat;

    public Aquatic(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return age == other.age &&
                Objects.equals(name, other.name) &&
                Objects.equals(habitat, other.habitat);
    }
}
