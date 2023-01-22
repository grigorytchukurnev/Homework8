import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int [] weight = new int [3];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;

        double [] weight2 = {1.57 , 7.654 , 9.986 };

        int [] myArray = {2,4,5,6,7,8};
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] weight2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < weight2.length; i++) {
            System.out.print(weight2[i]);
            if (i != weight2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] myArray = {2, 4, 5, 6, 7, 8};
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i != myArray.length - 1) {
                System.out.print(", ");}
        }System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int [] weight = new int [3];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;
        for (int i = weight.length-1; i >=0; i--) {
            System.out.print(weight[i]);
            if (i > 0) {
                System.out.print(", ");}
        }
        System.out.println();
        double [] weight2 = {1.57 , 7.654 , 9.986 };
        for (int i = weight.length - 1 ; i >=0 ; i--) {
            System.out.print(weight2[i]);
             if (i > 0) {
                System.out.print(", ");}
            }

        System.out.println();
        int [] myArray = {2,4,5,6,7,8};
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i]);
            if (i > 0) {
                System.out.print(", ");}
        }System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int[] arr2 = {1,2,3};
        for (int i = 0; i < arr2.length ; i++ )
            if (arr2[i] % 2 != 0){
                arr2[i]+=1;}
        System.out.println(Arrays.toString(arr2));
        }
}



