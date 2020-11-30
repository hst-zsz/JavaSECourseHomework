package ProductsManagement;

import java.util.ArrayList;
//库存类  有很多库存

public class StockManager {
	
	// 此处存在一个无参的构造方法
	public StockManager() {
		super();
	}

	
	private ArrayList<Product> stocks = new ArrayList<Product>();

	public void addProduct(Product item) // 新产品的ID如果与已有产品列表的ID相同就无法加入
	{
		int aa = 1;
		int a = item.getId();
		for (Product stock : stocks) { // 如果找到了 调用加数量
			if (stock.getId() == a) // 如果储存的id和得到的id一样，则给aa=0
			{
				aa = 0;
			}
		}
		if (aa == 1) // 只有当aa为1的时候才可以把产品添加进去
		{
			stocks.add(item);
		} else if (aa == 0) {
			System.out.println("对不起，您输入的产品ID号与已有产品ID号相同，请重新输入新的ID号");
		}
	}

	public void delivery(int id, int amount) // 根据给定的ID找到产品，然后调用产品的increaseQuantity方法，为该产品增加指定的库存数量
	{
		for (Product stock : stocks) { // 如果找到了 调用加数量
			if (stock.getId() == id) {
				stock.increaseQuantity(amount);
			}
		}
	}

	public Product findProduct(int id) // 在容器中搜索与其参数ID相匹配的ID的产品。如果能找到匹配的产品，就返回这个产品；如果找不到匹配的产品，就返回null。
	{
		for (Product stock : stocks) {
			if (stock.getId() == id) {
				return stock;
			}
		}
		return null;
	}

	public int numberInStock(int id) // 在容器中找到ID匹配的产品，然后返回该产品当前的数量。如果找不到ID匹配的产品，则返回0
	{
		for (Product stock : stocks) {
			if (stock.getId() == id) {
				return stock.getQuantity();
			}
		}

		return 0;
	}

	public void printProductDetails() // 该方法可以遍历产品的容器，并通过调用每个Product对象的toString方法来打印出所有产品的详细信息
	{
		for (Product stock : stocks) {
			System.out.println(stock.toString());
		}

	}

	public void printLowStockProducts(int limit) // 打印出所有库存水平低于给定值（作为参数传递给方法）的产品的详情
	{
		for (Product stock : stocks) {
			if (stock.getQuantity() <= limit) {
				System.out.println(stock.toString());
			}
		}
	}

	public Product findProductByName(String name) // 根据产品的名称（而不是ID）在容器中搜索相匹配的产品。如果能找到匹配的产品，就返回这个产品；如果找不到匹配的产品，就返回null。
	{
		for (Product stock : stocks) {
			if (stock.getName().equals(name)) {
				return stock;
			}
		}
		return null;
	}

}