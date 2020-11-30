package TicketMachine;
import java.util.Scanner;

/*
 * ��Ʊ��ָ�� TicketCmd��
 * 
 */
public class TicketCmd {

        public static void main(String[] args) {
        	//���õ�Ʊ�ۣ�������ط��ɸ��ģ��������õ�Ʊ��Ϊ2Ԫ��
            int default_price = 2; 
            //��Ŀ����� args.length��ʾ������������顣args...length��ʾ��������ĸ�����
            //args[0],�����㴫�ݵĲ���һ��Integer.parseInt(args[0])�ǰ�����ַ�ת��int��
            //�Լ�������  ����������д���������۸񣩣����˲���ת��int�β�����Ϊ�۸�û�еĻ�����Ĭ�ϼ۸���
            int price = args.length > 0 ? Integer.parseInt(args[0]) : default_price;
            //��������
            TicketMachine ticketMachine = new TicketMachine(); 
            //����.��������ʵ�������ĵ��÷��������ø���Ʊ���ļ۸�
            ticketMachine.setPrice(price); 
            //����
            Scanner scanner = new Scanner(System.in);
            //ѭ��ִ��
            while (true) {
                boolean quitFlag = false;
                System.out.println("===============��ӭʹ���Զ���Ʊ��===============");
                System.out.println("�������۹̶�Ʊ�� " + price + " Ԫ�ĳ�Ʊ");
                while (true) {
                    System.out.println("��ѡ�����...");
                    System.out.println("1��Ͷ��");
                    System.out.println("2����ӡ��Ʊ");
                    System.out.println("3������");
                    int input = scanner.nextInt();
                    switch (input) {
                        case 1:
                            int amount = scanner.nextInt();
                            scanner.nextLine();
                            if (amount < 0) {
                                System.out.println("������Ͷ��...");
                            } else {
                                ticketMachine.insertMoney(amount);
                            }
                            System.out.println("��ǰ��" + ticketMachine.getBalance() + " Ԫ");
                            break;
                        case 2:
                        	//�ù��ܳ������⣺��һ��ʼ��ӡ��Ʊ������Ʊ�������ʾ��-price��ֵ
                            if(ticketMachine.getBalance() > price) {
                            	ticketMachine.print();
                                System.out.println("��ǰ��" + ticketMachine.getBalance() + " Ԫ");		
                            }else {
                            	quitFlag = true;
                                System.out.println("�Բ����������㣬��Ͷ�ҳ�ֵ���");                            	
                            }
                            break;
                        case 3:
                        	if(ticketMachine.getBalance() >= 0) {
                        		System.out.println("���պ����� " + ticketMachine.refund() + " Ԫ");
                                quitFlag = true;	
                            }
                            break;
                        default:
                            System.out.println("��������ȷ�Ĺ������");
                    }
                    if (quitFlag) {
                        break;
                    }
                }
            }

        }

    
}
