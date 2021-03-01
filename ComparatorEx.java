import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = { "cat", "Dog", "lion", "tiger" };
        Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // String.CASE_INSENSITIVE_ORDER 정렬기준(대소문자 구분안함)에 의해 정렬
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending()); // 역순 정렬하기
        System.out.println("strArr = " + Arrays.toString(strArr));

    }

}

class Descending implements Comparator {
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1; // -1을 곱해서 기본 정렬방식의 역으로 변경, 아니면 c2.compareTo(c1)으로 해도 됨.
        }
        return -1;
    }
}
// Comparator와 Comparable은 모두 인터페이스다(컬렉션을 정렬하는데 필요한 메서드들을 정의하고 있음.).
// Comparator:
// public int compare(Object o1, Object o2) -> 주어진 다른 두 객체를 서로 비교
// Comparable: 같은 타입의 인스턴스끼리 서로 비교할 수 있는 클래스들이 주로 구현(Wrapper, String, Date ...)
// 작은 값부터 큰 값으로 정렬되도록 구현되어 있음. 그래서 Comparable을 구현한 클래스는 정렬이 가능함.
// public int compareTo(Object o) -> 주어진 객체와 자기 자신을 비교함.
