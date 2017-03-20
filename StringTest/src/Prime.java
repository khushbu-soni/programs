import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		String primeNumbers="";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=input.nextInt();
		int i=0;
		int num=0;
		for (i= 1; i<= n; i++) {
			int counter =0;
			for (num = i; num>=1; num--) {
				if(i%num==0)
					counter+=1;
			}
			if(counter==2){
				primeNumbers=primeNumbers+i+" ";
			}
		}
		System.out.println("primeNumbers "+primeNumbers);
		input.close();
	}
}
