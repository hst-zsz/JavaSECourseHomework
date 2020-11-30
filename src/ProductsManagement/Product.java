package ProductsManagement;
//产品类  
public class Product
{    //封装三个变量
    private int id;         //产品ID
    private String name;    //产品名字
    private int quantity;   //产品库存
    //setter and getter
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}   
    //构造函数
    public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		quantity = 0;;
	}
    //实例方法  连接字符串  将四个连在一起 并且按照这样的顺序输出
	public String toString()
    {
        return id + ": " + name +" stock level: " + quantity; //stock level数量
    }

   //实例方法  增加数量
    public void increaseQuantity(int amount)
    {
        if(amount > 0) {
            quantity += amount;
        }
        else {
            System.out.println("Attempt to restock " + name + " with a non-positive amount: " +  amount);
                      
        }
    }

    //卖掉一个后数量减1
    public void sellOne()
    {
        if(quantity > 0) {
            quantity--;
        }
        else {
            System.out.println(
            		  "Attempt to sell an out of stock item: " + name);
        }
    }
}