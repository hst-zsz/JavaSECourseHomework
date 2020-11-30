package TicketMachine;
/*
 * TicketMachine类  对象 
 * 售票机
 * 设置价钱、余额、总数  
 */
public class TicketMachine {
	   //设置变量
	    private int price; 
	    private int balance;
	    private int total;
	    //设置setter and getter
	    public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

		public void setTotal(int total) {
			this.total = total;
		}	    
	    
        public int getTotal() {
			return total;
		}

        
        
		//实例方法   该方法为投币是计算输入的金额  为balance= balance（此处为默认值0） + amount  
        //        amount为投币的金额，也就是总钱数
        //        balance为当前的余额
	    public void insertMoney(int amount) {
	        balance += amount;
	    }

       //实例方法 用于买票时候的打印
		public void print() {
	        System.out.println("==============================");
	        System.out.println("This is a ticket");
	        System.out.println("price : " + price);
	        System.out.println("==============================");
	        //余额等于balance（此时的balance为amount）-price
	        balance -= price; 
	        total += price;
	    }
        //实例方法  退零  返回余额 同时将系统默认余额设置为0
	    public int refund() {
	        int result = balance;
	        balance = 0;
	        return result;
	    }
        //归零
	    public void reset() {
	        balance = 0;
	        total = 0;
	    }

//	    public static void main(String[] args) {
//	        TicketMachine ticketMachine = new TicketMachine();  //创建售票机对象
//	        ticketMachine.setPrice(2);     
//	        ticketMachine.insertMoney(-10);   //引用.方法名
//	        System.out.println("balance : " + ticketMachine.getBalance());
//	        ticketMachine.print();
//	        ticketMachine.print();
//	        System.out.println("balance : " + ticketMachine.getBalance());
//	        System.out.println("refund : " + ticketMachine.refund());
//
//	        System.out.println("total : " + ticketMachine.getTotal());
//	    }


}
