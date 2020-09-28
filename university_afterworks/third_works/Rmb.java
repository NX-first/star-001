import java.util.Scanner;
class Rmb{
	public static void main(String[] args){
		Scanner money = new Scanner(System.in);
		System.out.print("请输入任意一个金额（如1.46）：");
		int rmb = money.nextInt();
		int a = rmb*100;
		if(100<a<500){
			int Y_1 = a % 100;
			System.out.println(a);
		}
	}
}
