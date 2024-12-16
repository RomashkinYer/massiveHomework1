import java.util.Random;

public class Main {

    public static final int SIZE = 8;

    //Метод вывода двух матриц
    public static void main(String [] args){
        int[][] colors = createMatrix(SIZE, SIZE);

        System.out.println("Первоначальная матрица: ");
        printMatrix(colors);

        System.out.println("\nПеревернутая матрица: ");
        printMatrix(rotateMatrix(colors));

    }

    //Метод для заполнения матрицы случайными значениями в диапазоне от 0 до 255
    private static int[][] createMatrix(int rows, int cols){
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
                colors[i][j] = random.nextInt(256);
            }
        }
        return colors;
    }

    //Метод для поворота матрицы на 90 градусов
    private static int[][] rotateMatrix(int[][] colors){
        int n = colors.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = colors[i][j];
            }
        }

        return rotated;
    }

    private static void printMatrix(int [][] colors){
        for (int[] row : colors) {
            for (int value : row){
                System.out.printf("%4d ", value);
            }
            System.out.println();
        }
    }






}