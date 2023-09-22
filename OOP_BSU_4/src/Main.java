import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[5][5];
        int[] X = new int[5];
        Task.chooseInputType(A);

        X = Task.doTask(A);

        System.out.println("Исходная матрица:\n");
        Task.outputMatrix(A);

        System.out.println("Результат:\n");
        Task.outputInConsoleX(X);
        Task.outputInFileX(X);
    }
}