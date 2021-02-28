import java.util.*;

class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        // subList : 읽기전용
        print(list1, list2);

        Collections.sort(list1); // 정렬하기
        Collections.sort(list2); //
        print(list1, list2);
        // list1이 list2를 포함하는가? -> 모든 요소를 포함한다면 true
        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        // list1에서 list2와 겹치는 부분을 제외하고 나머지 삭제 -> list1에 변화가 있으면 true반환
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);

        // list2에서 list1에 포함된 객체 모두 삭제
        for (int i = 0; i < list2.size() - 1; i++) {
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);

    } // End Main

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}