package SquareArea;
/*   Trapezoid��
 *   ������̬�����������ε��ϵס��µס���
 *   �������ε����
 */
public class Trapezoid {
	private static double length1, length2, high;
    //���췽��
	public Trapezoid(double a, double b, double h) {    
		length1 = a;
		length2 = b;
		high = h;
	}
    //��̬����
	public static double trapezoidArea() {
		return (length1 + length2) * high / 2;
	}
}