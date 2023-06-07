import java.util.ArrayList;

class Box<T extends Fruit> {

    private ArrayList<T> fruits;
    private String name;
    private static int counter;
    private Class<T> type;

    {
        counter++;
    }

    public Box(Class<T> type) {
        this.type = type;
        name = "ящик(а) №" + counter;
        fruits = new ArrayList<T>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
        System.out.printf("в %s добавлен фрукт %s\n", name, fruit);

    }


    public double getWeight() {
        if (fruits.isEmpty())
            return 0;
        T fruit = fruits.get(0);
        double weight = fruit.getWeight() * fruits.size();
        return weight;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public void transferTo(Box<T> box) {
        if (this == box)
            return;
        box.fruits.addAll(fruits);
        fruits.clear();
        System.out.printf("Все фрукты из %s пересыпаны в %s\n", this, box);
    }

    @Override
    public String toString() {
        if (type.getSimpleName().equals("Apple")) {
            return name + " для яблок";
        } else {
            return name + " для апельсинов";
        }
    }

}