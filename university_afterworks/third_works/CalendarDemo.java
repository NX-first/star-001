import java.util.Calendar;
import java.util.Scanner;

public class CalendarDemo {

	public static void main(String[] args) {
	System.out.println("请输入年月:");
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	int month=sc.nextInt();
	Calendar c=Calendar.getInstance();
	c.set(Calendar.YEAR, year);
	c.set(Calendar.MONTH,month-1);
	c.set(Calendar.DAY_OF_MONTH,1);
	int n=c.get(Calendar.DAY_OF_WEEK);
	System.out.println("日\t一\t二\t三\t四\t五\t六\t");
	int count=0;
	int m=c.getActualMaximum(Calendar.DATE);
	for(int i=1;i<n;i++)
	{
		System.out.print("\t");
		count++;
	}
	for(int j=1;j<=m;j++)
	{
		System.out.print(j+"\t");
		count++;
		if(count%7==0)
			System.out.println();
	}
	}

}
