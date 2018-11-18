import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[][] matrix = new Integer[n][n];
        try {
            Scanner fin = new Scanner(new FileReader("input.txt"));
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    matrix[i][j] = fin.nextInt();
                }
            }
        } catch(java.io.FileNotFoundException e) {
            System.out.println("Wrong file");
        }
        int max_elem = 0;
        for (int i = 0; i < n; ++i) {
            boolean greater = true;
            boolean smaller = true;
            for (int j = 1; j < n; ++j) {
                if (matrix[i][j] < matrix[i][j - 1]) {
                    greater = false;
                }
                if (matrix[i][j] > matrix[i][j - 1]) {
                    smaller = false;
                }
            }
            if (greater && max_elem < matrix[i][n - 1]) {
                max_elem = matrix[i][n - 1];
            }
            if (smaller && max_elem < matrix[i][0]) {
                max_elem = matrix[i][0];
            }
        }
        System.out.println(max_elem);
    }
}