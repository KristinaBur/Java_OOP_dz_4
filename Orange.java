
class Orange extends Fruit {
    private final double WEIGHT = 1.5;
    private static int counter = 1;

    {
        counter++;
    }

    public Orange() {
        super("Апельсин №" + counter);
    }

    @Override
    public double getWeight() {
        return WEIGHT;
    }

}