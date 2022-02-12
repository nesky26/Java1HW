/**
 * Java1HW2
 *
 * @author Elena Novizkaja
 * @version 12.02.2022
 */
public class HW2 {
    public static void main(String[] args) {
        System.out.println(SumInside(5,-10));
        System.out.println(CheckSign(-56)? "Positive": "Negative");
        System.out.println(CheckSign1(-118));
        printWordNTimes("Good day!!!",4);
        System.out.println(LeapYear(2000));
    }

    static boolean SumInside(int a, int b) {
        return (a+b>=10 && a+b<=20);
    }

    static boolean CheckSign(int d) {
        return d >= 0;
    }

    static boolean CheckSign1(int k) {
       return(k < 0? true: false);
    }

    static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    static boolean LeapYear(int year) {
        return((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? true: false);
    }
}