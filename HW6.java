/**
 * Java1HW6
 *
 * @author Elena Novizkaja
 * @version 27.02.2022
 */
public class HW6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik",200);
        Dog dog = new Dog("Bobik",500,10);
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.swim(5));
            System.out.println(animal.run(600));
            System.out.println(animal.swim(20));
        }
    }
}

class Dog extends Animal {
    Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }
}

class Cat extends Animal {
    Cat(String name, int maxRun) {
        super(name, maxRun, 0);
    }

    @Override
    public String swim(int dist) {
       return name + " can not swim";
   }
}


interface IAnimal {
    String run(int dist);
    String swim(int dist);
}

abstract class Animal implements IAnimal{
    protected String name;
    protected int maxRun;
    protected int maxSwim;

    Animal (String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    @Override
    public String run(int dist) {
        if (dist > maxRun) {
            return name + " no run " + dist;

        } else {
            return name + " run " + dist;
        }
    }

    @Override
    public String swim(int dist) {
        if (dist > maxSwim) {
            return name + " no swim " + dist;
        } else {
            return name + " swim " + dist;
        }
    }

   @Override
   public String toString() {
        return name + ", " + maxRun + ", " + maxSwim;
   }
}