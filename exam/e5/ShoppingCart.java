package exam.e5;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {

        //實作1.加入二台Notebook("Asus",30000),Notebook("Acer",20000),Food("Cookie",200)到shoppingList中
        List<Product> shoppingList = new ArrayList<>();

        Notebook n0 = new Notebook("Asus",30000);
        Notebook n1 = new Notebook("Acer",20000);
        Food f0 = new Food("Cookie", 200);

        shoppingList.add(n0);
        shoppingList.add(n1);
        shoppingList.add(f0);

        // System.out.println(shoppingList.size());

        //實作2.利用for迴圈，計算shoppingList中的總金額,並印在Console中
        int sum = 0;
        for (Product product : shoppingList) {
            sum += product.getPrice();
            // System.out.println(sum);
        }
        System.out.println("shoppingList中的總金額 = "+sum);

        //實作3.利用for迴圈，計算shoppingList中是Notebook型態的總金額,並印在Console中
        sum = 0;
        for (Product product : shoppingList) {
 
            // System.out.println(product.getClass());

            if (product.getClass() == Notebook.class){
                sum += product.getPrice();
            }

            // System.out.println(sum);
        }
        System.out.println("shoppingList中的Notebook總金額 = "+sum);


    }
}
