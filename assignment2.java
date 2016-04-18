
import java.util.Scanner;

class assignment2{
	public static void main(String[] args){
		int number,i=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		number= in.nextInt();
			int count=0;
			for(i=number;i>=2;i--){
				if(number%i==0){
					count=count+1;
				}
			}
			System.out.println(count);
			if(count==1){
				System.out.println("Number is prime");
			}else{
				System.out.println("This is not a prime number");
			}
}
}