import java.util.Scanner;

public class Client {
    int rang = 0;
    Solution sol = new Solution();
    public void Start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядок матрицы n:");
        rang = scanner.nextInt();
        int[][] matrix = new int[rang][rang];
        System.out.println("Введите n*n чисел");
        for (int i = 0; i < rang; i++) {
            for (int j = 0; j < rang; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(sol.Calculate(matrix) + " " + "- Это результат из Client");
    }
}
