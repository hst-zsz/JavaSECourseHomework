package SquareArea;
import java.util.Scanner;
public class Test {
	
public static void main (String[] args) {
				
			System.out.print("������Բ�İ뾶��");
			Scanner scan = new Scanner(System.in);
			double r = scan.nextInt();
			new Circle(r);
			
			System.out.println("�����Բ�����Ϊ��"+Circle.circleArea());		
			System.out.print("���������ε��ϵ͡��µס��ߣ�");         
			double a =scan.nextInt();
			double b =scan.nextInt();
			double h =scan.nextInt();
			
			new Trapezoid(a,b,h);
			System.out.println("��������ε����Ϊ��"+Trapezoid.trapezoidArea());

		}
}
