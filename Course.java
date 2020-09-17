import java.util.*;
class Time{
	private int Bigweek;
	private int Smallweek;
	private int coursetime;
	public Time(int Bigweek, int Smallweek, int coursetime){
		this.Bigweek = Bigweek;
		this.Smallweek = Smallweek;
		this.coursetime = coursetime;
	}
	public int getBigweek(){
		return Bigweek;
	}
	public int getSmallweek(){
		return Smallweek;
	}
	public int getCoursetime(){
		return coursetime;
	}
}
public class Course{
	String name;
	Time tim;
	String Courseteacher;
	String grade;
	String credit;
	String getName(){
		return name;
	}
	void setName(String name){
		this.name = name;
	}
	String getCourseteacher(){
		return Courseteacher;
	}
	void setCourseteacher(){
		this.Courseteacher = Courseteacher;
	}
	String getGrade(){
		return grade;
	}
	void setGrade(){
		this.grade = grade;
	}
	Time getTim(){
		return tim;
	}
	void setTim(Time tim){
		this.tim = tim;
	}
	String getCredit(){
		return credit;
	}
	void setCredit(String credit){
		this.credit = credit;
	}
	public Course(){
		System.out.println("父类无参数构造方法");
	}
	public Course(String name, Time tim, String Courseteacher, String grade, String credit){
		this.name = name;
		this.tim = tim;
		this.Courseteacher = Courseteacher;
		this.grade = grade;
		this.credit = credit;
	}
	public void print(){
		System.out.print("the Course`name:");
		System.out.println(this.getName());
		System.out.print("the Course`steacher is:");
		System.out.println(this.getCourseteacher());
		System.out.print("the time is:");
		System.out.println(this.getTim().getBigweek() + "-" + this.getTim().getSmallweek() + "-" + this.getTim().getCoursetime());
		System.out.print("the grade is:");
		System.out.println(this.getGrade());
		System.out.print("the credit is:");
		System.out.println(this.getCredit());
	}
	public static void main(String[] args){
		Time dt1 = new Time(5, 4, 4);
		Time dt2 = new Time(6, 3, 1);
		Course t1 = new Course("线性代数", dt1,"郭金海","2.5分","80");
		Course t2 = new Course("离散数学", dt2,"胡杰","3 分","85");
		System.out.println("------");
		t1.print();
		System.out.println("------");
		t2.print();
	}
}