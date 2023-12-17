import java.util.HashMap;
import java.util.Iterator;
import java.util.Spliterator;

public class Set<T>  {
    private final HashMap<T, Object> map;
    private final Object dummy = new Object();

    public Set(){
        map = new HashMap<>();
    }

    public boolean add(T value){
        return map.put(value,dummy) == null;
        //ถ้ายังไม่มีตัวจะเพิ่ม ให้ put (== null) return true แต่ถ้ามีแล้ว (!= null) return false
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

    public boolean containsAll(Set<T> s2){
        boolean result = false;
        for(T element : s2.map.keySet()){
            if(contains(element)){
                result = true;
            }else{
                return false;
                //ถ้าไม่เจอให้ return false ออกได้เลย
            }
        }
        return result;
    }

    public boolean equals(Object ob){
        return false;
        //return default for next lab
    }

    public int hashCode(){
        return 0;
        //return default for next lab
    }

    public boolean isEmpty(){
        return map.isEmpty();
    }

    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }

    public boolean remove(T value){
        return map.remove(value) != null;
    }

    public boolean removeAll(Set<T> s2){
        boolean result = false;
        for (T element: s2.map.keySet()) {
            if(remove(element)){
                result = true;
            }
        }
        return result;
    }

    public boolean retainAll(Set<T> s2){
        boolean result = false;
        Iterator <T> thisSet = iterator();
        while(thisSet.hasNext()){
            if(!s2.contains(thisSet.next())){
                thisSet.remove();
                result = true;
            }
        }
        return result;
    }

    public int size(){
        return map.size();
    }

    Spliterator<T> spliterator(){
        return null;
        //return default for next lab
    }

    public Object[] toArray(){
        return null;
        //return default for next lab
    }

    public <T> T[] toArray(T[] a) {
        return null;
        //return default for next lab
    }
}
