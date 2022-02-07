package exam.e6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

         People p1 = new People("001",21);
         People p2 = new People("002",33);
         People p3 = new People("003",41);
         //實作1:請實作一個「泛型」的Map中的key值為people的id，value為people物件，將上述三個people放入Map中
        
        Map<String,People> map = new HashMap<>();

        // System.out.println(p1.getId());

        map.put(p1.getId(), p1);
        map.put(p2.getId(), p2);
        map.put(p3.getId(), p3);



         //實作2:請用for迴圈或者iterator，計算Map中三人的平均年齡，取到小數以下第一位

        Iterator<Map.Entry<String,People>> itr = map.entrySet().iterator();

        double sum = 0;
        while(itr.hasNext())
        {
             Map.Entry<String, People> entry = itr.next();
             sum += entry.getValue().getAge();
             if (itr.hasNext() == false){
                 sum /= map.size();
                 System.out.printf("%.1f",sum);
             }
        }

    }
}
