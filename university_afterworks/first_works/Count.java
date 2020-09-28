public class Count{
	private int serialNumber;
	private static int counter = 0;
	public Count() {
		counter++;
		serialNumber = counter;
	}
	public static void main(String[] args){
		System.out.println(counter);
	}
}//jintai
