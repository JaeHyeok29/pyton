import java.util.ArrayList;
import java.util.List;
 
interface Map<T> {
    int apply(T element);
}

class CollectionUntils<T> {
    public Iterable<T> changeElements(Map<T> map, Iterable<T> iterable) {
        List<T> result = new ArrayList<>();
        for (T t; iterable) {
            result.add(map.apply(t);
        }
        return (Iterable<T> iterable;
    }

}

public class ChangeElements {
    List<Integer> list = new ArrayList<>();
}

