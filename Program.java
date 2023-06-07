public class Program {

    public static void main(String[] args) {

        System.out.println("*** Создадим фрукты ***");
        Apple apple1 = new Apple();
        System.out.printf("создан фрукт %s\n", apple1);
        Apple apple2 = new Apple();
        System.out.printf("создан фрукт %s\n", apple2);
        Apple apple3 = new Apple();
        System.out.printf("создан фрукт %s\n", apple3);
        Apple apple4 = new Apple();
        System.out.printf("создан фрукт %s\n", apple4);
        Apple apple5 = new Apple();
        System.out.printf("создан фрукт %s\n", apple5);
        Apple apple6 = new Apple();
        System.out.printf("создан фрукт %s\n", apple6);
        System.out.println();

        Orange orange1 = new Orange();
        System.out.printf("создан фрукт %s\n", orange1);
        Orange orange2 = new Orange();
        System.out.printf("создан фрукт %s\n", orange2);
        Orange orange3 = new Orange();
        System.out.printf("создан фрукт %s\n", orange3);
        Orange orange4 = new Orange();
        System.out.printf("создан фрукт %s\n", orange4);
        System.out.println();

        System.out.println("*** Создадим ящики для фруктов ***");
        Box<Apple> box1 = new Box<Apple>(Apple.class);
        System.out.printf("создан %s\n", box1);
        Box<Orange> box2 = new Box<Orange>(Orange.class);
        System.out.printf("создан %s\n", box2);
        Box<Apple> box3 = new Box<Apple>(Apple.class);
        System.out.printf("создан %s\n", box3);
        System.out.println();

        System.out.println("*** Разложим фрукты по ящикам ***");
        box1.addFruit(apple1);
        box1.addFruit(apple2);
        box1.addFruit(apple3);
        box1.addFruit(apple4);
        
        box2.addFruit(orange1);
        box2.addFruit(orange2);
        box2.addFruit(orange3);
        box2.addFruit(orange4);

        box3.addFruit(apple5);
        box3.addFruit(apple6);
        System.out.println();

        System.out.printf("*** Сравниваем %s и %s по весу ***\n", box1, box2);

        if (box1.compare(box2)) {
            System.out.println("Вес ящиков одинаковый");
        } else {
            System.out.println("Вес ящиков отличается");
        }
        System.out.println();

        System.out.printf("*** Пересыпаем фрукты из %s в %s ***\n", box3, box1);
        box3.transferTo(box1);
        System.out.println();

        System.out.printf("*** Еще раз сравниваем %s и %s по весу ***\n", box1, box2);

        if (box1.compare(box2)) {
            System.out.println("Вес ящиков одинаковый");
        } else {
            System.out.println("Вес ящиков отличается");
        }
        System.out.println();

    }

}