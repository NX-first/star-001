import java.util.Calendar;
import java.util.Scanner;

class Calen{
	public static void main(String[] args){
		Scanner time = new Scanner(System.in);
		System.out.print("请输入年份（回车结束）：");
		int year = time.nextInt();
		System.out.print("请输入月份（回车结束）：");
		int month = time.nextInt();
		Calendar s = Calendar.getInstance();  // 得到一个Calendar对象
		/*
		*将设置的年和月设置到Calendar对象，月减一，日为第一天，因为系统中0是1月，
		*到了12就归零,如果你输入的是9月，相当于系统的0123456789，就是10月，
		*所以减一就是8，系统认定就是012345678，就是九月。
		*/
		s.set(year, month-1, 1);  
		//得到每月实际最大天数
		int dayofMonth = s.getActualMaximum(Calendar.DAY_OF_MONTH);
		//得到每月第一天是星期几，1是星期日，2是星期一
		int dayofWeek = s.get(Calendar.DAY_OF_WEEK);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//将第一天前的星期打印制表符
		for(int i = 1; i < dayofWeek; i++){
			System.out.print("\t");
		}
		for(int j = 0; j < dayofMonth; j++){
			System.out.print(j+1+"\t");
			//设置每七天换行
			if((dayofWeek+j)%7==0){
				System.out.println();
			}
		}
	}
