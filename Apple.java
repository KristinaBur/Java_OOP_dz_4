
class Apple extends Fruit {

    private final double WEIGHT = 1.0;
    private static int counter = 1;

    {
        counter++;
    }

    public Apple() {
        super("Яблоко №" + counter);
    }

    @Override
    public double getWeight() {
        return WEIGHT;
    }

}