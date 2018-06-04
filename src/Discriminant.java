import java.util.Scanner;

public class Discriminant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int a, b, c, D;
		System.out.println("Program for Discriminant: Please fill the data !");
		System.out.println("Type а: ");
		a = in.nextInt();
		System.out.println("Type b: ");
		b = in.nextInt();
		System.out.println("Type c: ");
		c = in.nextInt();
		in.close();
		
		D=(b*b)-(4*a*c);
		
		if(D >= 0){ 
			System.out.println ("Discriminant = " + D);
		}
		else{
			System.out.println("Error: Discriminant can't be less then 0");	
		}	
	}
}
