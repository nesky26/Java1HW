/**
 * Java1HW3
 *
 * @author Elena Novizkaja
 * @version 17.02.2022
 */

public class HW3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        initialValue(7,67);
        arrayMaxMin();
    }

    static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1, 0, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(arr[i]==0? 1: 0);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(arr[i]<6? arr[i]*2: arr[i]);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[arr.length - 1 - i][i] = 1;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] initialValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
        return(arr);
    }

    static void arrayMaxMin() {
        int[] arr = { 15, -5, 53, 122, -11, 54, 5555, 12, -234, 8, -59, 0 };
        int max=arr[0];
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            max=(arr[i]>max? arr[i]: max);
        }
        System.out.println("Max=" + max);
        for (int i = 1; i < arr.length; i++) {
            min=(arr[i]<min? arr[i]: min);
        }
        System.out.println("Min=" + min);
    }
}


