package ok;

import java.util.Scanner;
   public class ������͵�ʵ�� {

	public static void main(String arg[]){
	System.out.print("please input t1  ");
	Scanner input1 = new Scanner(System.in);
    double a = input1.nextDouble();
    System.out.print("please input t2  ");
	Scanner input2 = new Scanner(System.in);
    double b = input2.nextDouble();
    System.out.print("please input t3  ");
	Scanner input3 = new Scanner(System.in);
    double c = input3.nextDouble();
    System.out.print("please input U  ");
	Scanner input4 = new Scanner(System.in);
    double U = input4.nextDouble();	
    double w=a+b+c;
    double f=w/3;
    double e=9*1.85*0.00001*0.0015/(2*981*9.8*f);
    double r=Math.sqrt(e);
	double i=9*1.414*3.1415926*0.005/U;
	double o=(1.85*0.00001*0.0015)*(1.85*0.00001*0.0015)*(1.85*0.00001*0.0015)/(981*9.8);
	double p=Math.sqrt(o);
	double j=(1+0.00823/(1.013*10000*r))*(1+0.00823/(1.013*10000*r))*(1+0.00823/(1.013*10000*r));
	double k=1/Math.sqrt(j);
	double z=1/Math.sqrt(f*f*f);
	double q=i*k*z*p;
	double Q=q*Math.pow(10, 19);
	double N=Q/1.6;
	int n1= (int) Math.round(N);
	double ei = 0;
	double n=0;
	if(N-n1>=0.5){
		ei=Q/(n1+1);
		n=n1+1;
		}
	else{  ei=Q/n1;
	    n=n1;
	    }
	System.out.printf("ʱ��tg=%.2fs �͵ε��q=%.3f*10^-19C     �����n=%.0f   ���Ԫ���ei=%.3f ����ע�Ᵽ����λ��Ч���֣�",f,Q,n,ei);
 
	
	}   			  
 }
   



