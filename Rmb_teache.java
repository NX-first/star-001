import java.util.*;
 public class Rmb_teache {
	public static void main (String[] args) { 
	//10, 5, 2, 1; 
	System.out.println("Input money:");
	Scanner in = new Scanner(System.in); 
	int m = in.nextInt(); 
	int n10 = m / 10;
	m %= 10;
	int n5 = m / 5;
	m %= 5; 
	int n2 = m / 2;
	m %= 2;
	int n1 = m;
	System.out.println("m=" + "10*" + n10 + "+5*" + n5 +"+2*" + n2 + "+1*" + n1 ); 
	} 
 }

