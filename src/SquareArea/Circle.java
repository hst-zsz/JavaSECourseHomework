package SquareArea;
/*  Circle类
 * 定义一个圆的半径
 * 计算圆的面积
 */
public class Circle {
	//私有的 静态的 成员变量中静态变量 方法区内存中   ：创建一个圆的半径
	private static double circle;
    //  有参数的构造方法 创建对象
	public Circle(double r) {    
		circle = r;
	}
    //静态方法 计算圆的面积
	public static double circleArea() {
		return circle * circle * 3.1415;
	}
}