package ProductsManagement;
//import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        StockManager manager = new StockManager();     //创建一个新的储存机构     
        //实例方法的调用，采用引用.方法名
        manager.addProduct(new Product(132, "Clock Radio"));   // 加商品ID和名字 
        
        
        //manager.addProduct(new Product(37,  "Mobile Phone"));
        //等同于以下两行代码 
        Product firstProduct = new Product(37,  "Mobile Phone");
        manager.addProduct(firstProduct);
        
        
        manager.addProduct(new Product(37,  "Mobile Phone"));
        manager.addProduct(new Product(23,  "Microwave Oven"));

        manager.printProductDetails();                           //打印商品详情
        
        manager.addProduct(new Product(23, "MY light"));
        manager.delivery(37, 4);                                //给指定商品加库存数量
        manager.delivery(132, 1);  
        manager.printProductDetails();                         //打印商品详情
        manager.printLowStockProducts(3);                       //打印库存不大于3的产品名称
        System.out.println(manager.findProduct(23));                     //通过ID查找商品
        System.out.println(manager.findProductByName("Clock Radio"));    //通过名字查找商品
        manager.addProduct(new Product(23,  "TV"));
        manager.printProductDetails();                           //打印商品详情
    }
}
