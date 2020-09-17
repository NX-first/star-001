import java.util.Scanner;
 
public class ang {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Length of first side:");
		double side1 = Double.parseDouble(in.nextLine());
		System.out.print("Enter Length of second side:");
		double side2 = Double.parseDouble(in.nextLine());
		System.out.print("Enter Length of thrid side:");
		double side3 = Double.parseDouble(in.nextLine());
		if (((side1 + side2) < side3) || ((side2 + side3) < side1) || ((side1 + side3) < side2)) {
			System.out.println("The input does not describe a triangle.");
		} else {
			double perimeter=side1+side2+side3;
			double semiperimeter=0.5* perimeter;
			double temp=semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3);
			double area=Math.sqrt(temp);
			System.out.println("周长是"+perimeter);
			System.out.println("面积是"+area);
		}
	}
}