package Statistics;

import java.util.Scanner;

public class Medain_Type_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-------Median:Descrete Frequency Distribution-------");
		System.out.print("Enter the no of Data:");
		int n=sc.nextInt();
		float [] x=new float[n];
		float [] f=new float[n];
		float [] cf=new float[n];
		int fsum=0;
		for(int i=0;i<n;i++) {
			System.out.print("Enter x["+i+"]:");
			x[i]=sc.nextFloat();
			System.out.print("Enter f["+i+"]:");
			f[i]=sc.nextFloat();
			fsum+=f[i];
		}
		for(int i=0;i<n;i++){
			if(i==0){
				cf[i]=f[i];
			}
			else {
				cf[i]=cf[i-1]+f[i];
			}
		}
		float m=(fsum+1)/2;
		for(int i=0;i<n;i++) {
			if(cf[i]<=m && cf[i+1]>m) {
				System.out.printf("Median: %.3f",x[i+1]);
				break;
			}
		}
		
	}

}
