import java.util.EmptyStackException;
import java.util.Vector;

class MyStack extends Vector {
    public Object push(Object item) {
        addElement(item);
        return item;
    }

    // 맨 위에 저장된 객체 꺼내기 (꺼내는 것이기 때문에 Stack에서는 삭제되는 것.)
    public Object pop(Object item) {
        Object obj = peek();
        removeElementAt(size() - 1); // 마지막 요소 삭제하기
        return obj;
    }

    // Stack에 저장된 마지막 요소 읽어오기(꺼내는 것이 아니고 그냥 객체를 반환)
    public Object peek() {
        int len = size();
        if (len == 0) // Stack이 비어 있다면 EmptyStackException 발생시킴
            throw new EmptyStackException();// : RuntimeException이므로 따로 예외처리 안해도 됨.
        return elementAt(len - 1);
    }

    public boolean empty() {
        return size() == 0;
    }

    public int search(Object o) {
        int i = lastIndexOf(o); // 뒤에서부터 찾기
        if (i >= 0) { // 해당객체를 찾으면
            return size() - i;
        }
        return -1; // 해당 객체를 찾지 못하면 -1을 반환
    }
}
