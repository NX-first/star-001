public class StaticVar{
	public static int number;
}
public class OtherClass{
	public void method(){
		int x = StaticVar.number;
	}
}
public static void main(String[] rgs){
	System.out.println(x);
}