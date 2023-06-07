abstract class Fruit {

    private String name;
    private double weight;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }

}