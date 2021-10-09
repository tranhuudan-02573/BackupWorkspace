package HashMap;


import java.util.HashMap;
 
/**
 * Xoa phan tu cua HashMap
 * 
 * @author viettuts.vn
 */
public class HashMapExample5 {
 
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
        // xoa phan tu co key = 4
        hashMap.remove(4);
        // hien thi hashMap
        System.out.println(hashMap);
        // xoa toan bo hashMap
        hashMap.clear();
        // hien thi hashMap
        System.out.println(hashMap);
    }
}