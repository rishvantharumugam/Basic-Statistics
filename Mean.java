package Statistics;

import java.util.Scanner;

public class Mean {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("---------Mean---------");
		System.out.print("Enter the No of Data:");
		int Data=sc.nextInt();
		int Sum=0;
		for(int i=1;i<=Data;i++) {
			System.out.print("Data ");
			System.out.print(i+":");
			int n=sc.nextInt();
			Sum+=n;
		}
		float Mean=(float)Sum/Data;
		System.out.printf("Mean:%.3f",Mean);
		
	}
}
