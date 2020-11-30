package ProductsManagement;

import java.util.ArrayList;
//�����  �кܶ���

public class StockManager {
	
	// �˴�����һ���޲εĹ��췽��
	public StockManager() {
		super();
	}

	
	private ArrayList<Product> stocks = new ArrayList<Product>();

	public void addProduct(Product item) // �²�Ʒ��ID��������в�Ʒ�б��ID��ͬ���޷�����
	{
		int aa = 1;
		int a = item.getId();
		for (Product stock : stocks) { // ����ҵ��� ���ü�����
			if (stock.getId() == a) // ��������id�͵õ���idһ�������aa=0
			{
				aa = 0;
			}
		}
		if (aa == 1) // ֻ�е�aaΪ1��ʱ��ſ��԰Ѳ�Ʒ��ӽ�ȥ
		{
			stocks.add(item);
		} else if (aa == 0) {
			System.out.println("�Բ���������Ĳ�ƷID�������в�ƷID����ͬ�������������µ�ID��");
		}
	}

	public void delivery(int id, int amount) // ���ݸ�����ID�ҵ���Ʒ��Ȼ����ò�Ʒ��increaseQuantity������Ϊ�ò�Ʒ����ָ���Ŀ������
	{
		for (Product stock : stocks) { // ����ҵ��� ���ü�����
			if (stock.getId() == id) {
				stock.increaseQuantity(amount);
			}
		}
	}

	public Product findProduct(int id) // �������������������ID��ƥ���ID�Ĳ�Ʒ��������ҵ�ƥ��Ĳ�Ʒ���ͷ��������Ʒ������Ҳ���ƥ��Ĳ�Ʒ���ͷ���null��
	{
		for (Product stock : stocks) {
			if (stock.getId() == id) {
				return stock;
			}
		}
		return null;
	}

	public int numberInStock(int id) // ���������ҵ�IDƥ��Ĳ�Ʒ��Ȼ�󷵻ظò�Ʒ��ǰ������������Ҳ���IDƥ��Ĳ�Ʒ���򷵻�0
	{
		for (Product stock : stocks) {
			if (stock.getId() == id) {
				return stock.getQuantity();
			}
		}

		return 0;
	}

	public void printProductDetails() // �÷������Ա�����Ʒ����������ͨ������ÿ��Product�����toString��������ӡ�����в�Ʒ����ϸ��Ϣ
	{
		for (Product stock : stocks) {
			System.out.println(stock.toString());
		}

	}

	public void printLowStockProducts(int limit) // ��ӡ�����п��ˮƽ���ڸ���ֵ����Ϊ�������ݸ��������Ĳ�Ʒ������
	{
		for (Product stock : stocks) {
			if (stock.getQuantity() <= limit) {
				System.out.println(stock.toString());
			}
		}
	}

	public Product findProductByName(String name) // ���ݲ�Ʒ�����ƣ�������ID����������������ƥ��Ĳ�Ʒ��������ҵ�ƥ��Ĳ�Ʒ���ͷ��������Ʒ������Ҳ���ƥ��Ĳ�Ʒ���ͷ���null��
	{
		for (Product stock : stocks) {
			if (stock.getName().equals(name)) {
				return stock;
			}
		}
		return null;
	}

}