package ProductsManagement;
//import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        StockManager manager = new StockManager();     //����һ���µĴ������     
        //ʵ�������ĵ��ã���������.������
        manager.addProduct(new Product(132, "Clock Radio"));   // ����ƷID������ 
        
        
        //manager.addProduct(new Product(37,  "Mobile Phone"));
        //��ͬ���������д��� 
        Product firstProduct = new Product(37,  "Mobile Phone");
        manager.addProduct(firstProduct);
        
        
        manager.addProduct(new Product(37,  "Mobile Phone"));
        manager.addProduct(new Product(23,  "Microwave Oven"));

        manager.printProductDetails();                           //��ӡ��Ʒ����
        
        manager.addProduct(new Product(23, "MY light"));
        manager.delivery(37, 4);                                //��ָ����Ʒ�ӿ������
        manager.delivery(132, 1);  
        manager.printProductDetails();                         //��ӡ��Ʒ����
        manager.printLowStockProducts(3);                       //��ӡ��治����3�Ĳ�Ʒ����
        System.out.println(manager.findProduct(23));                     //ͨ��ID������Ʒ
        System.out.println(manager.findProductByName("Clock Radio"));    //ͨ�����ֲ�����Ʒ
        manager.addProduct(new Product(23,  "TV"));
        manager.printProductDetails();                           //��ӡ��Ʒ����
    }
}
