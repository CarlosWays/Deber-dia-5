import java.util.Scanner;
public class Multi5{
	public static void main (String []args){
		int num;
		Scanner lee= new Scanner(System.in);
		System.out.println("Ingrese el numero: ");
		num=lee.nextInt();
		Multiplo5 obj= new Multiplo5(num);
		obj.mul5();
	}
}