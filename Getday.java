import java.util.Scanner;
import java.util.Calendar;
 
public class Getday {
	public static void main(String[] args) {
		Scanner time = new Scanner(System.in);
		//计算两个日期相差天数
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		//第一个日期
		System.out.print("请输入第一年年份（回车结束）：");
		int year1 = time.nextInt();
		System.out.print("请输入第一月月份（回车结束）：");
		int month1 = time.nextInt();
		System.out.print("请输入第一天日期（回车结束）：");
		int day1 = time.nextInt();
		c1.set(year1, month1, day1);
		//第二个日期
		System.out.print("请输入第二年年份（回车结束）：");
		int year2 = time.nextInt();
		System.out.print("请输入第二月月份（回车结束）：");
		int month2 = time.nextInt();
		System.out.print("请输入第二天日期（回车结束）：");
		int day2 = time.nextInt();
		c2.set(year2, month2, day2);
		//赋值
		long t1=c1.getTimeInMillis();
		long t2=c2.getTimeInMillis();
		long days=(t2-t1)/(24*60*60*1000);
		System.out.println(days);
	}
}