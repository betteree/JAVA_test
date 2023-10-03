package test2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        String[] re = new String[C]; // 결과를 문자열로 저장

        for (int i = 0; i < C; i++) {
            int N = sc.nextInt();
            int sum = 0;
            int cnt = 0;
            
            int[] std = new int[N]; // 배열 선언과 크기 초기화

            for (int j = 0; j < N; j++) {
                std[j] = sc.nextInt();
                sum += std[j];
            }

            int avg = sum / N;

            for (int k = 0; k < N; k++) {
                if (avg < std[k]) {
                    cnt++;
                }
            }

            double dd = ((double) cnt / N) * 100; // 정수 나눗셈을 피하기 위해 형변환
            re[i] = String.format("%.3f%%", dd); // 결과를 문자열로 변환하여 '%' 추가
        }

        sc.close();

        // 결과 배열 출력
        for (int i = 0; i < C; i++) {
            System.out.println(re[i]);
        }
    }
}
