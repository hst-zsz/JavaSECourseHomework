package TicketMachine;
/*
 * TicketMachine��  ���� 
 * ��Ʊ��
 * ���ü�Ǯ��������  
 */
public class TicketMachine {
	   //���ñ���
	    private int price; 
	    private int balance;
	    private int total;
	    //����setter and getter
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

        
        
		//ʵ������   �÷���ΪͶ���Ǽ�������Ľ��  Ϊbalance= balance���˴�ΪĬ��ֵ0�� + amount  
        //        amountΪͶ�ҵĽ�Ҳ������Ǯ��
        //        balanceΪ��ǰ�����
	    public void insertMoney(int amount) {
	        balance += amount;
	    }

       //ʵ������ ������Ʊʱ��Ĵ�ӡ
		public void print() {
	        System.out.println("==============================");
	        System.out.println("This is a ticket");
	        System.out.println("price : " + price);
	        System.out.println("==============================");
	        //������balance����ʱ��balanceΪamount��-price
	        balance -= price; 
	        total += price;
	    }
        //ʵ������  ����  ������� ͬʱ��ϵͳĬ���������Ϊ0
	    public int refund() {
	        int result = balance;
	        balance = 0;
	        return result;
	    }
        //����
	    public void reset() {
	        balance = 0;
	        total = 0;
	    }

//	    public static void main(String[] args) {
//	        TicketMachine ticketMachine = new TicketMachine();  //������Ʊ������
//	        ticketMachine.setPrice(2);     
//	        ticketMachine.insertMoney(-10);   //����.������
//	        System.out.println("balance : " + ticketMachine.getBalance());
//	        ticketMachine.print();
//	        ticketMachine.print();
//	        System.out.println("balance : " + ticketMachine.getBalance());
//	        System.out.println("refund : " + ticketMachine.refund());
//
//	        System.out.println("total : " + ticketMachine.getTotal());
//	    }


}
