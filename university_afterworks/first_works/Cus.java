class Cus{
/* 说明变量屏蔽及作用域实例*/
	public static void main(String[] args){
		Cus cus = new Cus();
		String name = "John Smith";
		{
			//下列说明是非法的，仍在前面一个name的作用域中
			//String name = "Tom David";
			cus.name = name;
			System.out.println("The cus`s name:" + cus.name);
		}
	}
	private String name;
}
