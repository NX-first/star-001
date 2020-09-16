import java.util.*;
class Date {
	private int year;
	private int month;
	private int day;
 	public Date(int dat, int month, int year){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
}
public class Teacher{
	String name;
	boolean sex;
	Date birth;
	String salaryID;
	String depart;
	String posit;
	String getName(){
		return name;
	}
	void setName(String name){
		this.name = name;
	}
	boolean getSex(){
		return sex;
	}
	void setSex(){
		this.sex = sex;
	}
	Date getBirth(){
		return birth;
	}
	void setBirth(Date birth){
		this.birth = birth;
	}
	String getSalaryID(){
		return salaryID;
	}
	void setSalaryID(String salaryID){
		this.salaryID = salaryID;
	}
	String getDepart(){
		return depart;
	}
	void setDepart(String depart){
		this.depart = depart;
	}
	String getPosit(){
		return posit;
	}
	void setPosit(String posit){
		this.posit = posit;
	}
	public Teacher(){
		System.out.println("父类无参数的构造方法！");
	}
	public Teacher(String name, boolean sex, Date birth, String salaryID, String depart, String posit){
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.salaryID = salaryID;
		this.depart = depart;
		this.posit = posit;
	}
	public void print(){
		System.out.print("the teacher`name:");
		System.out.println(this.getName());
		System.out.print("the teacher`sex:");
		if(this.getSex()==false){
			System.out.println("女");
		}
		else{
			System.out.println("男");
		}
		System.out.print("the teacher`birth:");
		System.out.println(this.getBirth().getYear() + "-" + this.getBirth().getMonth() + "-" + this.getBirth().getDay());
		System.out.print("the teacher`salaryID:");
		System.out.println(this.getSalaryID());
		System.out.print("the teacher`posit:");
		System.out.println(this.getPosit());
		System.out.print("the teacher`depart:");
		System.out.println(this.getDepart());
	}
	public static void main(String[] args){
		Date dt1 = new Date(11, 23, 1989);
		Date dt2 = new Date(2, 6, 1975);
		Date dt3 = new Date(5, 9, 1988);
		Date dt4 = new Date(8, 3, 1977);
		Date dt5 = new Date(6, 21, 1990);
		Teacher t1 = new Teacher("王莹", false, dt1,"123","经济学","prefessor");
		ResearchTeacher rt = new ResearchTeacher("王夏", true, dt2, "421","软件工程","prefessor","software");
		LabTeacher lat = new LabTeacher("杨玉环", false, dt3, "145", "人文","prefessor","dean");
		LibTeacher lit = new LibTeacher("马二", true, dt4, "163","外语","prefessor", "speech lib");
		AdminTeacher at = new AdminTeacher("杨青", true, dt5, "156", "物理","prefessor","physical");
		System.out.println("------");
		t1.print();
		System.out.println("------");
		rt.print();
		System.out.println("------");
		lat.print();
		System.out.println("------");
		lit.print();
		System.out.println("------");
		at.print();
	}
}
class ResearchTeacher extends Teacher{
	private String resField;
	public ResearchTeacher(String name, boolean sex, Date birth, String salaryID, String depart, String posit, String resField){
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.salaryID = salaryID;
		this.depart = depart;
		this.posit = posit;
		this.resField = resField;
	}
	String getResField(){
		return resField;
	}
	void setResField(String resField){
		this.resField = resField;
	}
	public void print(){
		System.out.println("research teacher info is:");
		System.out.print("the teacher`name:");
		System.out.println(this.getName());
		System.out.print("the teacher`sex:");
		if(this.getSex()==false){
			System.out.println("女");
		}
		else{
			System.out.println("男");
		}
		System.out.print("the teacher`birth:");
		System.out.println(this.getBirth().getYear() + "-" + this.getBirth().getMonth() + "-" + this.getBirth().getDay());
		System.out.print("the teacher`salaryID:");
		System.out.println(this.getSalaryID());
		System.out.print("the teacher`posit:");
		System.out.println(this.getPosit());
		System.out.print("the teacher`depart:");
		System.out.println(this.getDepart());
		System.out.print("the teacher`resField:");
		System.out.println(this.getResField());
	}
}
class LabTeacher extends Teacher{
	private String labName;
	public LabTeacher(String name, boolean sex, Date birth, String salaryID, String depart, String posit, String labName){
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.salaryID = salaryID;
		this.depart = depart;
		this.posit = posit;
		this.labName = labName;
	}
	String getLabName(){
		return labName;
	}
	void setLabName(String labName){
		this.labName = labName;
	}
	public void print(){
		System.out.println("lab teacher info is:");
		System.out.print("the teacher`name:");
		System.out.println(this.getName());
		System.out.print("the teacher`sex:");
		if(this.getSex()==false){
			System.out.println("女");
		}
		else{
			System.out.println("男");
		}
		System.out.print("the teacher`birth:");
		System.out.println(this.getBirth().getYear() + "-" + this.getBirth().getMonth() + "-" + this.getBirth().getDay());
		System.out.print("the teacher`salaryID:");
		System.out.println(this.getSalaryID());
		System.out.print("the teacher`posit:");
		System.out.println(this.getPosit());
		System.out.print("the teacher`depart:");
		System.out.println(this.getDepart());
		System.out.print("the teacher`labName:");
		System.out.println(this.getLabName());
	}
}
class LibTeacher extends Teacher{
	private String libName;
	public LibTeacher(String name, boolean sex, Date birth, String salaryID, String depart, String posit, String LibName){
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.salaryID = salaryID;
		this.depart = depart;
		this.posit = posit;
		this.libName = libName;
	}
	String getlibName(){
		return libName;
	}
	void setLibName(String libName){
		this.libName = libName;
	}
	public void print(){
		System.out.println("lib teacher info is:");
		System.out.print("the teacher`name:");
		System.out.println(this.getName());
		System.out.print("the teacher`sex:");
		if(this.getSex()==false){
			System.out.println("女");
		}
		else{
			System.out.println("男");
		}
		System.out.print("the teacher`birth:");
		System.out.println(this.getBirth().getYear() + "-" + this.getBirth().getMonth() + "-" + this.getBirth().getDay());
		System.out.print("the teacher`salaryID:");
		System.out.println(this.getSalaryID());
		System.out.print("the teacher`posit:");
		System.out.println(this.getPosit());
		System.out.print("the teacher`depart:");
		System.out.println(this.getDepart());
		System.out.print("the teacher`libName:");
		System.out.println(this.getlibName());
	}
}
class AdminTeacher extends Teacher{
	private String managePos;
	public AdminTeacher(String name, boolean sex, Date birth, String salaryID, String depart, String posit, String managePos){
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.salaryID = salaryID;
		this.depart = depart;
		this.posit = posit;
		this.managePos = managePos;
	}
	String getManagePos(){
		return managePos;
	}
	void setManagePos(String managePos){
		this.managePos = managePos;
	}
	public void print(){
		System.out.println("research teacher info is:");
		System.out.print("the teacher`name:");
		System.out.println(this.getName());
		System.out.print("the teacher`sex:");
		if(this.getSex()==false){
			System.out.println("女");
		}
		else{
			System.out.println("男");
		}
		System.out.print("the teacher`birth:");
		System.out.println(this.getBirth().getYear() + "-" + this.getBirth().getMonth() + "-" + this.getBirth().getDay());
		System.out.print("the teacher`salaryID:");
		System.out.println(this.getSalaryID());
		System.out.print("the teacher`posit:");
		System.out.println(this.getPosit());
		System.out.print("the teacher`depart:");
		System.out.println(this.getDepart());
		System.out.print("the teacher`managePos:");
		System.out.println(this.getManagePos());
	}
}