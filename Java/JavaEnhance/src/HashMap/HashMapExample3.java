package HashMap;



import java.util.HashMap;
 
/**
 * truy cap phan tu cua HashMap
 * 
 * @author viettuts.vn
 */
public class HashMapExample3 {
 
    public static void main(String args[]) {
        // init hashMap
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // add elements to hashMap
        hashMap.put(1, "Java");
        hashMap.put(3, "C++");
        hashMap.put(2, "PHP");
        hashMap.put(4, "Python");
        // hien thi HashMap
        System.out.println("Phan tu co key = 1 la: " + hashMap.get(1));
        System.out.println("Phan tu co key = 2 la: " + hashMap.get(2));
    }
}
