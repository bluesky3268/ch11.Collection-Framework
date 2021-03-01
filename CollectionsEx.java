import java.util.*;
import static java.util.Collections.*;

public class CollectionsEx {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list);

        rotate(list, 2); // 오른쪽으로 2칸씩 이동
        System.out.println(list);

        swap(list, 0, 2); // 0번째와 2번째 자리 이동
        System.out.println(list);

        shuffle(list); // 저장된 요소의 위치를 임의 변경
        System.out.println(list);

        sort(list); // 정렬
        System.out.println(list);

        sort(list, reverseOrder());
        System.out.println(list);

        int idx = binarySearch(list, 3);
        System.out.println("index of 3 = " + idx);

        System.out.println("max = " + max(list));
        System.out.println("min = " + min(list));
        System.out.println("min = " + max(list, reverseOrder()));

        fill(list, 9);
        System.out.println("list = " + list);

        List newList = nCopies(list.size(), 2);
        System.out.println("newList = " + newList);

        System.out.println(disjoint(list, newList)); // 공통 요소가 없으면 true;

        copy(list, newList);
        System.out.println("newList = " + newList);
        System.out.println("list = " + list);

        replaceAll(list, 2, 1);
        System.out.println("list = " + list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);
        System.out.println("list2 = " + list2);
    }

}
