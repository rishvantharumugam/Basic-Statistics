package Statistics;

import java.util.Scanner;

public class Mean_Type_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-------Mean:Continous Frequency Distribution-------");
		System.out.print("Enter the no of Data:");
		int n=sc.nextInt();
		float [] l=new float[n];
		float [] h=new float[n];
		float [] f=new float[n];
		float [] X=new float[n];
		float [] d=new float[n];
		float [] fd=new float[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter l["+i+"]:");
			l[i]=sc.nextFloat();
			System.out.print("Enter h["+i+"]:");
			h[i]=sc.nextFloat();
			System.out.print("Enter f["+i+"]:");
			f[i]=sc.nextFloat();
			X[i]=(l[i]+h[i])/2;
		}
		if(h[0]!=l[1]) {
			for(int i=0;i<n;i++){
				l[i]=(float) (l[i]-0.5);
				h[i]=(float) (h[i]+0.5);
			}
		}
		float C=h[1]-l[1];
		boolean flag=true;
		float A;
		float fsum=0,fdsum=0;
		for(int i=0;i<n;i++) {
			if(h[i]-l[i]!=C) {
				flag=false;
			}
		}
		if(flag==false){
			System.out.println("Invalid Class Intervals");
		}
		else {
			if(n%2!=0){
				A=X[n/2];
			}
			else {
				A=X[n/2]+X[(n/2)+1];
			}
			for(int i=0;i<n;i++) {
				d[i]=(X[i]-A)/C;
				fd[i]=f[i]*d[i];
				fsum+=f[i];
				fdsum+=fd[i];
			}
			float mean=A+(fdsum/fsum)*C;
			System.out.printf("Mean:%.3f",mean);
		}
	}
	
}
