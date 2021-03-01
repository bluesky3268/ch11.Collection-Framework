import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };
        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }
        System.out.println(set);
    }
    // set은 중복 허용이 안되고 순서유지가 안되는데
    // 1이 2개가 출력되는 이유는 하나는 String인스턴스이고, 다른 하나는 Integer인스턴스이기 때문에 서로 다른 객체라서 중복으로
    // 간주하지 않음.
    // set은 순서 유지가 안되는데 순서를 유지하고 싶다면 LinkedHashSet을 사용해야 함.
}
