import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();
        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(new Integer(num));
        }
        List list = new LinkedList(set); // LinkedList (Collection c)
        Collections.sort(list); // Collections.sort(List list)
        System.out.println(list);
        // 컬렉션에 저장된 객체간 Integer이기 때문에 Integer클래스에 정의된 기본 정렬이 사용됨.
    }

}
