package Day1;

public class FibonacciQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The first 20 Fibonacci numbers:");
		int temp=0,a=0,b=1;
		double count=2;
		System.out.print(a +  " " +b );
		for(int i=1;i<20;i++){
			temp=a+b;
			a=b;
			b=temp;
			count +=temp;
			System.out.print(" "+ temp);
		}
		System.out.print("\nThe average of the numbers :" + count/20);

		
		}

}
