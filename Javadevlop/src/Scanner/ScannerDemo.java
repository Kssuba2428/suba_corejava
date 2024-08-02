package Scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	          Scanner s=new Scanner(System.in);
	          int l,b,Area;
	          System.out.println("the enter a length and breath of rectangle:");
	          l=s.nextInt();
              b=s.nextInt();
              Area=l*b;
              System.out.println("the area is="+Area);
	}

}
