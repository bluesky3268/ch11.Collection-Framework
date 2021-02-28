import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();
        // Stack : 순차적으로 데이터를 추가, 삭제하기 때문에 ArrayList가 적합
        // Queue : ArrayList보다 데이터의 추가, 삭제가 쉬운 LinkedList로 구현하는 것이 더 적합함.
        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("=== Stack ===");
        while (!st.empty()) {
            System.out.println(st.pop());
        }
        System.out.println("=== Queue ===");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

    }

}
