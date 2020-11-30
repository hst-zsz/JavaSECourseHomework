package TicketMachine;
import java.util.Scanner;

/*
 * 售票机指令 TicketCmd类
 * 
 */
public class TicketCmd {

        public static void main(String[] args) {
        	//设置的票价（在这个地方可更改，本例设置的票价为2元）
            int default_price = 2; 
            //三目运算符 args.length表示传入参数的数组。args...length表示传入参数的个数。
            //args[0],就是你传递的参数一，Integer.parseInt(args[0])是把这个字符转成int。
            //自己理解的是  如果命令行有传入参数（价格），将此参数转成int形并定义为价格，没有的话按照默认价格来
            int price = args.length > 0 ? Integer.parseInt(args[0]) : default_price;
            //创建对象
            TicketMachine ticketMachine = new TicketMachine(); 
            //引用.方法名（实例方法的调用方法）设置该售票机的价格
            ticketMachine.setPrice(price); 
            //输入
            Scanner scanner = new Scanner(System.in);
            //循环执行
            while (true) {
                boolean quitFlag = false;
                System.out.println("===============欢迎使用自动售票机===============");
                System.out.println("本机销售固定票价 " + price + " 元的车票");
                while (true) {
                    System.out.println("请选择服务...");
                    System.out.println("1、投币");
                    System.out.println("2、打印车票");
                    System.out.println("3、找零");
                    int input = scanner.nextInt();
                    switch (input) {
                        case 1:
                            int amount = scanner.nextInt();
                            scanner.nextLine();
                            if (amount < 0) {
                                System.out.println("请正常投币...");
                            } else {
                                ticketMachine.insertMoney(amount);
                            }
                            System.out.println("当前余额：" + ticketMachine.getBalance() + " 元");
                            break;
                        case 2:
                        	//该功能出现问题：若一开始打印车票，则会出票且余额显示的-price的值
                            if(ticketMachine.getBalance() > price) {
                            	ticketMachine.print();
                                System.out.println("当前余额：" + ticketMachine.getBalance() + " 元");		
                            }else {
                            	quitFlag = true;
                                System.out.println("对不起，您的余额不足，请投币充值余额");                            	
                            }
                            break;
                        case 3:
                        	if(ticketMachine.getBalance() >= 0) {
                        		System.out.println("请收好找零 " + ticketMachine.refund() + " 元");
                                quitFlag = true;	
                            }
                            break;
                        default:
                            System.out.println("请输入正确的功能序号");
                    }
                    if (quitFlag) {
                        break;
                    }
                }
            }

        }

    
}
