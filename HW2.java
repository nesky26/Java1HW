/**
 * Java1HW2
 *
 * @author Elena Novizkaja
 * @version 12.02.2022
 */
public class HW2 {
    public static void main(String[] args) {
        System.out.println(sumInside(5,10));
        checkSign(-56);
        System.out.println(checkSign1(-118));
        printWordNTimes("Good day!!!",4);
        System.out.println(leapYear(2001));
    }

    static boolean sumInside(int a, int b) {
        return (a+b>=10 && a+b<=20);
    }

    static void checkSign(int d) {System.out.println( d >= 0? "Positive": "Negative"); }

    static boolean checkSign1(int k) {
       return(k < 0);
    }

    static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    static boolean leapYear(int year) {
        return(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
