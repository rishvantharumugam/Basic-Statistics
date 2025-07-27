package Statistics;

import java.util.Arrays;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-------Median-------");
		System.out.print("Enter the no of Data:");
		int n=sc.nextInt();
		float [] m=new float[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter l["+i+"]:");
			m[i]=sc.nextFloat();
		}
		Arrays.sort(m);
		float Median=0;
		if(n%2!=0) {
			Median=m[n/2];
		}
		else {
			Median=(m[(n/2)-1]+m[n/2])/2;
		}
		System.out.printf("Median :%.3f",Median);
	}

}
