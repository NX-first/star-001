class Customer{
	String name, address, telephone;

	String getName(){
		return name;
	}
	void setName(String name){
		this.name = name;
	}

	String getAddress(){
		return address;
	}
	void setAddress(String address){
		this.address = address;
	}

	String getTelephone(){
		return telephone;
	}
	void setTelephone(String telephone){
		this.telephone = telephone;
	}

	public static void main(String[] rags){
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		customer1.setName("倪鑫");
		customer1.setAddress("湖北 黄冈");
		customer1.setTelephone("150727979**");

		customer2.setName("杜潢");
		customer2.setAddress("湖北 黄冈");
		customer2.setTelephone("132054633**");
		System.out.print("The first customer name: ");
		System.out.println(customer1.getName());
		System.out.print("The first customer address: ");
		System.out.println(customer1.getAddress());
		System.out.print("The first customer telephone: ");
		System.out.println(customer1.getTelephone());

		System.out.print("The second customer name: ");
		System.out.println(customer2.getName());
		System.out.print("The second customer address: ");
		System.out.println(customer2.getAddress());
		System.out.print("The second customer telephone: ");
		System.out.println(customer2.getTelephone());
	}
	




}