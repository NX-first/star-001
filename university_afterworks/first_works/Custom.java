class Custom{
	// 说明变量屏蔽及作用域实例
	public static void main(String[] args){
		Custom custom = new Custom();
		{
			String name = "Tom David";
			custom.name = name;
			System.out.println("这个custom的名字叫做：" + custom.name);
		}
	//下面的再说明是个正确的，前一个name的作用域已结束
	String name = "John Smith";
	custom.name = name;
	System.out.println("这个custom的名字叫做：" + custom.name);
	}
	private String name;
}
