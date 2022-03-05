/**
 * Java1HW7
 *
 * @author Elena Novizkaja
 * @version 03.03.2022
 */
public class HW7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 12), new Cat("Witas", 25), new Cat("Wasja", 12)
        };
        Plate plate = new Plate(40, 60);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.add(50);
        System.out.println(plate);


        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
    }
}

class Plate {
    private int food;
    private int volume;

    Plate( int food, int volume){
        this.food = food;
        this.volume = volume;
    }

    boolean decreaseFood ( int n) {
        if (food < n) {
            return false;
       }
        food -= n;
        return true;
    }

    void add(int food) {
        if (this.food + food <= volume) {
            this.food += food;
        }
    }

    @Override
    public String toString () {
        return "Plate: " + food;
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    public void setFullness(boolean status) {
        fullness = status;
    }

    void eat (Plate p){
       if (!fullness) {
           fullness = p.decreaseFood(appetite);
       }
    }

    public int getAppetite () {
        return appetite;
    }

    @Override
    public String toString () {
        return "Cat: " + name + ", appetite: " + appetite + ", fullness=" + fullness;
    }
}
