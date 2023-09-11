import java.util.Scanner;
import java.util.Date;  

public class NonStop {
	void display() {
		System.out.println("1.Garuda");
		System.out.println("2.Rajdhani");
		System.out.println("3.Super Luxury");
		System.out.println("4.Express");
		Scanner scan;
		scan=new Scanner(System.in);
		int a= scan.nextInt();
		if(a==1) {
		NonStop displayGaruda;
		displayGaruda=new NonStop();
		displayGaruda.Garuda();
		}
		else if(a==2) {
			NonStop displayRajdhani;
			displayRajdhani=new NonStop();
			displayRajdhani.Rajadhani();
		}
		else if(a==3) {
			NonStop displaySuperLuxury;
			displaySuperLuxury=new NonStop();
			displaySuperLuxury.SuperLuxury();
		}
		else if(a==4) {
			NonStop displayExpress;
			displayExpress=new NonStop();
			displayExpress.Express();
		}	
		else if(a>=5) {
			System.out.println("Select the given options only");
		}
		
	}
	void Garuda() {
		String d="Garuda";
		System.out.println("Enter no. of Psngrs");
		Scanner scan;
		scan=new Scanner(System.in);
		int p= scan.nextInt();
		//NonStop displayGaruda;
		//displayGaruda=new NonStop();
		//displayGaruda.Garuda();
		//scan.close();
		System.out.println("Enter no. of Audlts");
		//Scanner scan;
		scan=new Scanner(System.in);
		int a= scan.nextInt();
		System.out.println("Enter no. of Children");
		scan=new Scanner(System.in);
		int c= scan.nextInt();
		if(p==a+c) {
		int afare=a*180;
		int cfare=c*150;
		int fare=afare+cfare;
		System.out.println("****TSRTC****");
		System.out.println("   depo - KNR");
		System.out.println(d);
		System.out.println("    PSGR TKT");
		System.out.println("   KNR TO JBS");
		java.util.Date date=new java.util.Date();  
		System.out.println(date);
		System.out.println("  A : "+a+"  "+"C : "+c);
		System.out.println("    Fare :$ "+fare)/*+fare)*/;
		System.out.println("--------------------");
		System.out.println("   NOT TRANSFERABLE");
		System.out.println("HELPLINE 040 69440000");
		
		/*Scanner scan;
		scan=new Scanner(System.in);
		int r = scan.nextInt();
		NonStop c= new NonStop();
		c.display();*/
		}
	}
	void Rajadhani() {
		String d="Rajadhani";
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
		int afare=a*230;
		int cfare=c*200;
		int fare=afare+cfare;
		System.out.println("**TSRTC**");
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
	void SuperLuxury() {
		String d="  Super Luxury";
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
		int afare=a*180;
		int cfare=c*150;
		int fare=afare+cfare;
		System.out.println("****TSRTC****");
		System.out.println("   depo - KNR");
		System.out.println(d);
		System.out.println("    PSGR TKT");
		System.out.println("   KNR TO JBS");
		System.out.println("  A : "+a+"  "+"C : "+c);
		System.out.println("    Fare :$ "+fare);
		System.out.println("--------------------");
		System.out.println("   NOT TRANSFERABLE");
		System.out.println("HELPLINE 040 69440000");
		}
		else {
			System.out.println("Given data is mismatch");
		}
	}
	void Express() {
		String d="Express";
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
		System.out.println("    Fare :$ "+fare);
		System.out.println("--------------------");
		System.out.println("   NOT TRANSFERABLE");
		System.out.println("HELPLINE 040 69440000");
		}
		else {
			System.out.println("Given data is mismatch");
		}
	}
}

