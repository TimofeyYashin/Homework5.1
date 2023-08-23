import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] numbers1 = {1.57, 7.564, 9.986};
        for (int i = 0; i < numbers.length; i++) {
        }

        char[] numbers2 = {'\u2640', '\u2754', '\u2714', '\u260F', '\u2709'};
        for (int i = 0; i < numbers2.length; i++) {
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.print(numbers[0] + "," + numbers[1] + "," + numbers[2]);
        System.out.println();

        double[] numbers1 = {1.57, 7.564, 9.986};
        for (int i = 0; i < numbers1.length; i++) {
            if (i == numbers1.length - 1) {
                System.out.println(numbers1[i]);
                break;
            }
            System.out.print(numbers1[i] + ",");
        }

        char[] numbers2 = {'\u2640', '\u2754', '\u2714', '\u260F', '\u2709'};
        for (int i = 0; i < numbers2.length; i++) {
            if (i == numbers2.length - 1) {
                System.out.println(numbers2[i]);
                break;
            }
            System.out.print(numbers2[i] + ",");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.print(numbers[2] + "," + numbers[1] + "," + numbers[0]);
        System.out.println();

        double[] numbers1 = {1.57, 7.564, 9.986};
        double[] revers = new double[numbers1.length];
        int number = 0;
        for (int i = 1; i <= numbers1.length; i++) {
            revers[number++] = numbers1[numbers1.length - i];
        }
        System.out.print(Arrays.toString(revers));


        char[] numbers2 = {'\u2640', '\u2764', '\u2714', '\u260F', '\u2709'};
        char[] reverse = new char[numbers2.length];
        int count = 0;
        for (int i = 1; i <= numbers2.length; i++) {
            reverse[count++] = numbers2[numbers2.length - i];
        }
        System.out.println();
        System.out.print(Arrays.toString(reverse));
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] numbers = {1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0)
                numbers[i]++;
        }
        System.out.print(Arrays.toString(numbers));
    }
}
