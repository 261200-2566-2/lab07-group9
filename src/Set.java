import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;


public class Set<T>  {
    private final HashMap<T, Object> map;
    private final Object dummy = new Object();

    public Set(){
        map = new HashMap<>();
    }

    public boolean add(T value){
        return map.put(value,dummy) == null;
        //ถ้ามีตัวยังไม่มีตัวจะเพิ่ม(== null) return true แต่ถ้ามีแล้ว (!= null) return false
    }

    //mean U
    public boolean addAll(Set<T> s2){
        boolean result = false;
        for (T element: s2.map.keySet()) {
            //keySet for call all element in s2
            if(add(element)){
                //add element s2 to this Set
                result = true;
            }
        }
        return result;
    }

    public void clear(){
        map.clear();
    }

    public boolean contains(T value){
        return map.containsKey(value);
    }
}
