package SquareArea;
/*   Trapezoid类
 *   创建静态变量定义梯形的上底、下底、高
 *   计算梯形的面积
 */
public class Trapezoid {
	private static double length1, length2, high;
    //构造方法
	public Trapezoid(double a, double b, double h) {    
		length1 = a;
		length2 = b;
		high = h;
	}
    //静态方法
	public static double trapezoidArea() {
		return (length1 + length2) * high / 2;
	}
}