package HashMap;

import java.util.HashMap;
 
/**
 * cap nhat phan tu cua HashMap
 * 
 * @author viettuts.vn
 */
public class HashMapExample4 {
 
    public static void main(String args[]) {
        // khoi tao hashMap
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // them cac phan tu vao hashMap
        hashMap.put(1, "Java");
        hashMap.put(3, "C++");
        hashMap.put(2, "PHP");
        hashMap.put(4, "Python");
        // hien thi hashMap
        System.out.println(hashMap);
        // cap nhat gia tri cua phan tu co key = 4
        hashMap.put(4, "Angular8");
        // hien thi hashMap
        System.out.println(hashMap);
    }
}