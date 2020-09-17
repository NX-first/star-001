// 定义一个图形类及其子类（三角形和矩形），分别计算面积和周长
class MyGraphic{
	public double width;
	public double length;
	public double area;
	public double Perimeter;
	public double areaMyGraphic(){
		return area;
	}
	public double PerimeterMyGraphic(){
		return Perimeter;
	}
}
class rectangle extends MyGraphic{
	public double areaMyGraphic(){
		area = width * length;
		return area;
	}
	public double PerimeterMyGraphic(){
		Perimeter = (width + length) * 2;
		return Perimeter;
	}
}
class Triangle extends MyGraphic{
	// 子类继承父类
	public double high;
	public double bottom;
	public double side;
	public double areaMyGraphic(){
		area = (bottom * high) / 2;
		return area;
	}
	public double PerimeterMyGraphic(){
		Perimeter = high + bottom + side;
		return Perimeter;
	}
}
public class jicheng{
	//主类
	public static void main(String[] args){
		rectangle p1 = new rectangle();//声明对象和创建对象
		p1.width = 3;
		p1.length = 4;
		p1.areaMyGraphic();
		p1.PerimeterMyGraphic();
		System.out.println("矩形面积" + p1.areaMyGraphic() + "矩形周长" + p1.PerimeterMyGraphic());
		Triangle p2 = new Triangle();//声明对象和创建对象
		p2.high = 3;
		p2.side = 5;
		p2.bottom = 4;
		p2.areaMyGraphic();
		p2.PerimeterMyGraphic();
		System.out.println("三角形面积" + p2.areaMyGraphic() + "三角形周长" + p2.PerimeterMyGraphic());
	}
}