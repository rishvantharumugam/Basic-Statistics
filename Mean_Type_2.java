package Statistics;

import java.util.Scanner;

public class Mean_Type_2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("------Mean:Descrete Frequency Distribution-----");
		System.out.print("Enter the No of Data:");
		int n=sc.nextInt();
		int i;
		float Sum=0;
		float tf=0;
		for(i=1;i<=n;i++)
		{
			System.out.print("Enter Data "+i+"and Frequency "+i+":");
			float x=sc.nextFloat();
			float f=sc.nextFloat();
			float fx=x*f;
			Sum+=fx;
			tf+=f;
		}
		float mean=Sum/tf;
		System.out.printf("Mean:%.3f",mean);
	}
}
