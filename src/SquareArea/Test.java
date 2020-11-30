package SquareArea;
import java.util.Scanner;
public class Test {
	
public static void main (String[] args) {
				
			System.out.print("请输入圆的半径：");
			Scanner scan = new Scanner(System.in);
			double r = scan.nextInt();
			new Circle(r);
			
			System.out.println("计算得圆的面积为："+Circle.circleArea());		
			System.out.print("请输入梯形的上低、下底、高：");         
			double a =scan.nextInt();
			double b =scan.nextInt();
			double h =scan.nextInt();
			
			new Trapezoid(a,b,h);
			System.out.println("计算得梯形的面积为："+Trapezoid.trapezoidArea());

		}
}
