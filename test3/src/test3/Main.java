package test3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 수
        int[] results = new int[T]; // 결과를 저장할 배열

        for (int t = 0; t < T; t++) {
            int k = sc.nextInt(); // 층 수
            int n = sc.nextInt(); // 호 수

            int[][] apart = new int[k + 1][n];

            // 0층 초기화
            for (int j = 0; j < n; j++)
                apart[0][j] = j + 1;

            // 나머지 층 초기화
            for (int a1 = 1; a1 <= k; a1++) {
                for (int a = 0; a < n; a++) {
                    for (int j = 0; j <= a; j++) {
                        apart[a1][a] += apart[a1 - 1][j];
                    }
                }
            }
            results[t] = apart[k][n - 1];
        }

        // 모든 결과를 출력
        for (int t = 0; t < T; t++) {
            System.out.println(results[t]);
        }
    }
}
