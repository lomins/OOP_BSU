import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {
    private static int n;
    private static int m;

    public static void chooseInputType(int[][] array){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип ввода матрицы:" +
                "\n1. Консоль \n2.Файл");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                inputFromConsole(array);
                break;
            case 2:
                inputFromFile(array);
                break;
        }
    }

    private static void inputFromConsole(int[][] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n и m: ");
        n = scanner.nextInt();
        m = scanner.nextInt();

        System.out.println("Введите данные массива: ");
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                array[i][j] = scanner.nextInt();
            }
        }
    }

    private static void inputFromFile(int[][] array){
        String path = "data.txt";
        try {
            try (Scanner in = new Scanner(new File(path))) {
                n = in.nextInt();
                m = in.nextInt();

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        array[i][j] = in.nextInt();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка " + e + "! файл " +
                    path + " не найден!");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка " + e + "! Не" +
                    "соответствие типов данных!");
        }
    }

    public static int[] doTask(int[][] array) {
        int[] result = new int[5];

        for (int col = 0; col < 5; col++) {
            result[col] = 1;

            for (int row = col; row < 5; row++) {
                result[col] *= array[row][col];
            }
        }

        return result;
    }

    public static void outputMatrix(int[][] array){
        for(int i = 0; i<n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void outputInConsoleX(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void outputInFileX(int[] array) {
        try {
            PrintStream print = new PrintStream(new FileOutputStream("outputFile.txt"));
            System.setOut(print);

            for(int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
