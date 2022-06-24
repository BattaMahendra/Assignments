import java.util.Scanner;

public class EvenNumbers {

public void evenLessThanN(int n) {
		
		for(int i=1; i<n; i++) {
			if(i%2==0) {
				System.out.print(i+" , ");
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number you wish");
		int i=sc.nextInt();
		sc.close();
		EvenNumbers obj1=new EvenNumbers();
		obj1.evenLessThanN(i);
	}

}
