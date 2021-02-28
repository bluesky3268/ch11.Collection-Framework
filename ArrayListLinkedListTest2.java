import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(1000000);
        LinkedList ll = new LinkedList();
        add(al);
        add(ll);

        System.out.println("==== 접근 시간 테스트 ====");
        System.out.println("ArrayList : " + access(al));
        System.out.println("LinkedList : " + access(ll));
    }

    public static void add(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i + "");
        }
    }

    public static long access(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++)
            list.get(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
    // LinkedList는 불연속적으로 위치한 각 요소들은 서로 연결한 것.
    // 이 말은 즉, 처음부터 n번째 데이터까지 순차적으로 따라가야 원하는 값을 찾을 수 있다.
    // 따라서 저장해야하는 데이터의 수가 많아질수록 데이터를 읽어오는데 시간이 오래 걸린다.
    // => 데이터의 개수가 변하지 않는다 : Arraylist
    // => 데이터의 개수가 자주 변한다 : LinkedList

    // 처음에 작업하기 전에는 ArrayList를 사용하고, 작업할 때는 LinkedList에 데이터를 옮기는 것도 방법.
    // ArrayList al = new ArrayList(100000);
    // for(int i = 0; i < 100000; i++)
    // al.add(i+"");
    // LinkedList ll = new LinkedList(al);
    // for(int i = 0; i < 100000; i++)
    // ll.add(500, "X");
}
