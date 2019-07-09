import java.util.Scanner;
public class Multi3{
	public static void main (String []args){
		int num;
		Scanner lee= new Scanner(System.in);
		System.out.println("Ingrese el numero: ");
		num=lee.nextInt();
		Multiplo3 obj= new Multiplo3(num);
		obj.mul3();
	}
}