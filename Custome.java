class Custome {
// 说明变量屏蔽及作用域实例
	public static void main(String[] args){
		Custome custome = new Custome();
		String name = "John Smith";
		{
			//下列说明是非法的，仍在前一个name的域内
			name = "Tom David";
			custome.name = name;
			System.out.println("这个custome的名字是：" + custome.name);
		}
	}

	private String name;
}