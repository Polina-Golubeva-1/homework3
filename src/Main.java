import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
        //1.пройти по массиву, вывести все элементы в прямом и в обратном порядке
       /* double[] step1 = new double[scanner.nextInt()];

        for (int i = 0; i < step1.length; i++) {
            step1[i] = Math.random();
            System.out.println(step1[i] + " ");
        }

            for (int j = step1.length - 1; j >= 0; j--) {
                System.out.println(step1[j] + " ");
            }*/

      /*  //2.найти минимальный-максимальный элементы и вывести

       double[] step1 = new double[scanner.nextInt()];
       for (int i = 0; i < step1.length; i++) {
            step1[i] =Math.random();
        }
        double min = step1[0];
        double max = step1[0];

        for (int i = 1; i < step1.length; i++) {
            if (step1[i] < min) {
                min = step1[i];
            }
            if (step1[i] > max) {
            max = step1[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);*/
       /*  //3.найти индекс минимального-максимального элементов и вывести

        double[] step1 = new double[scanner.nextInt()];
        for (int i = 0; i < step1.length; i++) {
            step1[i] = Math.random();
        }

        double elementMin = step1[0], elementMax = step1[0];
        int minindex = 0;
        int maxindex = 0;
        for (int j = 0; j < step1.length; j++) {

            if (elementMax < step1[j]) {
                elementMax = step1[j];
                maxindex = j;
            }

            if (elementMin > step1[j]) {
                elementMin = step1[j];
                minindex = j;
            }
        }
            System.out.println("Minimum value: " + minindex);
        System.out.println("Maximum value: " + maxindex);
   //4. найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет

        double[] step1 = new double[scanner.nextInt()];
        int counter = 0;
        int element1 = 0;

        for (int i = 0; i < step1.length; i++) {
            array[i] = Math.random();
            System.out.println(step1[i] + " ");
        }
        for (double element : step1) {
            if (element1 == element) {
                counter = counter + 1;
            }
        }
        if (counter > 0) {
            System.out.println("Нулевых элементов: " + counter);
        } else {
            System.out.println("Нулевые элементы отсутствуют");
        }*/

/*        //5. пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.

        double[] step1 = new double[scanner.nextInt()];
        double buffer;

        for (int i = 0; i < step1.length; i++) {
            step1[i] = Math.random();
            System.out.println(step1[i]);
        }

        for (int j = 0; j < step1.length / 2; j++) {
            buffer = step1[j];
            step1[j] = step1[(step1.length - 1) - j];
            step1[(step1.length - 1) - j] = buffer;

        }
        System.out.println("---------------");
        System.out.println("Выходной массив");
        for (double element : step1) {
            System.out.println(element);
        }
    }*/

       //6. проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего)
        int[] step1 = { 0, 3, 6, 9, 12};
        boolean result = false;
        for (int i = 0; i < step1.length - 1; i++) {
            if (step1[i] < step1[i + 1]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        System.out.println(result ? "Последовательность возрастающая " : "Последовательность не возрастающая ");
    }
}

