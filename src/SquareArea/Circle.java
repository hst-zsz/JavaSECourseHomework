package SquareArea;
/*  Circle��
 * ����һ��Բ�İ뾶
 * ����Բ�����
 */
public class Circle {
	//˽�е� ��̬�� ��Ա�����о�̬���� �������ڴ���   ������һ��Բ�İ뾶
	private static double circle;
    //  �в����Ĺ��췽�� ��������
	public Circle(double r) {    
		circle = r;
	}
    //��̬���� ����Բ�����
	public static double circleArea() {
		return circle * circle * 3.1415;
	}
}