/**
 * Java1HW5
 *
 * @author Elena Novizkaja
 * @version 22.02.2022
 */
public class HW5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Vasilev Petr", "Teacher", "Vaspet@mailp.ru", "891234567", 25000, 45);
        persArray[2] = new Person("Gavrilenko Olga", "Lawyer", "OLgaGav@mil.com", "8904123456", 50000, 56);
        persArray[3] = new Person("Kunz Irina", "Economist", "Kunz2012@mln.ru", "8922345678", 45000, 28);
        persArray[4] = new Person("Petrov Sergey", "Advocate", "Petrovadv@mnb.ru", "8905123478", 60000, 37);
        System.out.println("Information about first person:");
        System.out.println(persArray[0]);
        //System.out.println(persArray[1]);
        //System.out.println(persArray[2]);
        //System.out.println(persArray[3]);
        //System.out.println(persArray[4]);
        System.out.println();
        System.out.println("Information about persons > 40:");
        for (int i = 0; i < 5; i++) {
             if (persArray[i].getAge() > 40) {System.out.println(persArray[i]);};
        }
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person (String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", " + position + ", " + email + ", " + phone +
                ", " + salary + ", " + age + ";";
    }
}
