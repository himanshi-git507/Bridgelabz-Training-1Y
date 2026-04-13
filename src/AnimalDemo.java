import java.util.*;

class Animal {
    public String toString() {
        return "Animal";
    }
}

class Dog extends Animal {
    public String toString() {
        return "Dog";
    }
}

class Cat extends Animal {
    public String toString() {
        return "Cat";
    }
}

class AnimalUtil {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        AnimalUtil.printAnimals(dogs);
        AnimalUtil.printAnimals(cats);
    }
}
