
import java.util.Scanner;

public class DriverCls {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Choose your choice :");
System.out.println("1.NonStop");
System.out.println("2.SingleStop");
	Scanner scan;
	scan=new Scanner(System.in);
	int a = scan.nextInt();
	if (a==1) {
	//NonStop.display();   //static invoking
	NonStop b=new NonStop(); //non-static invoking
	b.display();
	}
	//Scanner scan;
	//scan=new Scanner(System.in);
	else {
	//int c = scan.nextInt();
	SingleStop d=new SingleStop();
	d.Busstops();
	}
	}
}
