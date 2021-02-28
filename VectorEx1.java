import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5); // capacity가 6인 vector를 생성.
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize(); // : 빈 공간을 없앤다. -> capacity와 size를 같게 만든다.
        System.out.println("==== After capacity ====");
        print(v);

        v.ensureCapacity(6); // : capacity가 최소 6으로 만든다.
        System.out.println("==== After ensureCapacity ====");
        print(v);

        v.setSize(7);
        // : size를 7로 만들고 capacity는 12가 됨(capacity가 부족하면 새로운 인스턴스를 생성하는데 자동적으로 기존의 크기보다
        // 2배 크게 생성한다.)
        System.out.println("==== After setSize ====");
        print(v);

        v.clear(); // : 모든 요소를 삭제함. (당연히 capacity는 유지됨.)
        System.out.println("==== After clear ====");
        print(v);

    }

    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size : " + v.size());
        System.out.println("capacity : " + v.capacity());
    }

    /*
     * ArrayList와 Vector와 같은 배열을 이용한 자료구조는 데이터를 읽어오고 저장하는데는 효율이 좋음. 하지만 처음에 인스턴스를
     * 생성할 때 저장할 데이터의 개수를 잘 고려해서 충분한 크기의 인스턴스를 생성해야 함.
     * 
     * 왜냐하면 용량을 변경해야 할 때 새로운 배열을 생성 후, 기존의 배열의 데이터를 복사해야하기 때문에 효율이 많이 떨어짐.
     */

}
