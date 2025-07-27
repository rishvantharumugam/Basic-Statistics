package Statistics;

import java.util.Scanner;

public class Medain_Type_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-------Median:Continous Frequency Distribution-------");
		System.out.print("Enter the no of Data:");
		int n=sc.nextInt();
		float [] l=new float[n];
		float [] h=new float[n];
		float [] f=new float[n];
		float [] cf=new float[n];
		float lower=0,pcf=0,fsum=0;
		for(int i=0;i<n;i++) {
			System.out.print("Enter l["+i+"]:");
			l[i]=sc.nextFloat();
			System.out.print("Enter h["+i+"]:");
			h[i]=sc.nextFloat();
			System.out.print("Enter f["+i+"]:");
			f[i]=sc.nextFloat();
			fsum+=f[i];
		}
		if(h[0]!=l[1]) {
			for(int i=0;i<n;i++){
				l[i]=(float) (l[i]-0.5);
				h[i]=(float) (h[i]+0.5);
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(l[i]);
			System.out.println(h[i]);
		}
		float C=h[1]-l[1];
		boolean flag=true;
		for(int i=0;i<n;i++) {
			if(h[i]-l[i]!=C) {
				flag=false;
			}
		}
		float N=fsum/2;
		if(flag==false){
			System.out.println("Invalid Class Intervals");
		}
		else {
			for(int i=0;i<n;i++){
				if(i==0){
					cf[i]=f[i];
				}
				else {
					cf[i]=cf[i-1]+f[i];
				}
			}
			float ff=0;
			for(int i=0;i<n;i++) {
				if(cf[i]<=N && cf[i+1]>N) {
					lower=l[i+1];
					pcf=cf[i];
					ff=f[i+1];
				}
			}
			float Median=lower+((N-pcf)/ff)*C;
			System.out.printf("Median :%.3f",Median);
			
		}
	}
}
