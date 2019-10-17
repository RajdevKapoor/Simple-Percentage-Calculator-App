import java.io.*;
public class PercentCalculator 
{
		public static void main(String args[]) throws IOException
		{
			int sum;
			double perc;
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter marks in 5 subjects out of 100");
			int a=Integer.parseInt(in.readLine());
			int b=Integer.parseInt(in.readLine());
			int c=Integer.parseInt(in.readLine());
			int d=Integer.parseInt(in.readLine());
			int e=Integer.parseInt(in.readLine());
			sum=a+b+c+d+e;
			perc=sum/5.0;
			System.out.println("the percentage is "+perc);
		}

	}
