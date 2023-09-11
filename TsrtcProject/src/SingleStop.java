import java.util.Scanner;

public class SingleStop {

	void Busstops() {	
		System.out.println("Express");
		System.out.println("Palle Velugu");
		Scanner scan;
		scan=new Scanner(System.in);
		int a= scan.nextInt();
		if(a==1) {
		SingleStop BusstopsExpress;
		BusstopsExpress=new SingleStop();
		BusstopsExpress.Express();
		}
		else if(a==2) {
			SingleStop BusstopsExpress;
			BusstopsExpress=new SingleStop();
			BusstopsExpress.Express();
			}
		else if(a>=2) {
			System.out.println("Give proper input");
		}
	}
	void Express() {
		String d="   Express";
		System.out.println("Enter no. of Psngrs");
		Scanner scan;
		scan=new Scanner(System.in);
		int p= scan.nextInt();
		System.out.println("Enter no. of Audlts");
		scan=new Scanner(System.in);
		int a= scan.nextInt();
		System.out.println("Enter no. of Children");
		scan=new Scanner(System.in);
		int c= scan.nextInt();
		if(p==a+c) {
		int afare=a*150;
		int cfare=c*120;
		int fare=afare+cfare;
		System.out.println("****TSRTC****");
		System.out.println("   depo - KNR");
		System.out.println(d);
		System.out.println("    PSGR TKT");
		System.out.println("   KNR TO JBS");
		System.out.println("  A : "+a+"  "+"C : "+c);
		System.out.println("    Fare :$ "+fare)/*+fare)*/;
		System.out.println("--------------------");
		System.out.println("   NOT TRANSFERABLE");
		System.out.println("HELPLINE 040 69440000");
		}
		else {
			System.out.println("Given data is mismatch");
		}
	}
	void PalleVelugu() {
		String d="  Palle Velugu";
		System.out.println("Enter no. of Psngrs");
		Scanner scan;
		scan=new Scanner(System.in);
		int p= scan.nextInt();
		System.out.println("Enter no. of Audlts");
		scan=new Scanner(System.in);
		int a= scan.nextInt();
		System.out.println("Enter no. of Children");
		scan=new Scanner(System.in);
		int c= scan.nextInt();
		if(p==a+c) {
		int afare=a*130;
		int cfare=c*100;
		int fare=afare+cfare;
		System.out.println("****TSRTC****");
		System.out.println("   depo - KNR");
		System.out.println(d);
		System.out.println("    PSGR TKT");
		System.out.println("   KNR TO JBS");
		System.out.println("  A : "+a+"  "+"C : "+c);
		System.out.println("    Fare :$ "+fare)/*+fare)*/;
		System.out.println("--------------------");
		System.out.println("   NOT TRANSFERABLE");
		System.out.println("HELPLINE 040 69440000");
		}
		else {
			System.out.println("Given data is mismatch");
		}
	}
}
