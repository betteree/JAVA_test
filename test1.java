package test1;

import java.util.Scanner;


public class test_main {
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int a, b, c;
		int[] re = new int[T]; 
		
		for(int i = 0; i < T; i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			c = 1;
			
			for (int j = 1; j <= b; j++)
			{
				c = c * a % 10;
			}
			
			if (c == 0) 
			{
			    c = 10;
			}
			
			re[i]=c;
		}
		for(int i = 0; i < T; i++)
			System.out.println(re[i]);
		sc.close();
	}
	
}
