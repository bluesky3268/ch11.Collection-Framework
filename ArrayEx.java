import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4 };
        int[][] arr2D = { { 11, 12, 13 }, { 21, 22, 23 } };

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2D = " + Arrays.deepToString(arr2D));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr4 = " + Arrays.toString(arr4));
        System.out.println("arr5 = " + Arrays.toString(arr5));
        System.out.println("arr6 = " + Arrays.toString(arr6));

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);
        System.out.println("arr7 = " + Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1);
        System.out.println("arr7 = " + Arrays.toString(arr7));

        for (int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);
        }

        // for(int x = 0; x < arr7.length; x++){
        // int i = arr7[x];
        // char[] graph = new char[i];
        // }

        String[][] str2D = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };
        String[][] str2D2 = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };
        System.out.println(Arrays.equals(str2D, str2D2));
        // 다차원 배열은 배열의 배열이기 때문에 equals()를 사용하게 되면 문자열을 비교하는 것이 아니라 배열에 저장된 배열의 주소를 비교하므로
        // false가
        // 나오게 된다.
        System.out.println(Arrays.deepEquals(str2D, str2D2));

        char[] chArr = { 'A', 'B', 'C', 'B', 'E' };
        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
        System.out.println("=== After sorting ===");
        Arrays.sort(chArr);
        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
        // binarySearch하기 전에는 반드시 Arrays.sort()로 정렬을 먼저 하고 검색해야 함.
        // 이진 검색은 검색할 배열의 범위를 반복적으로 절반씩 줄여나가기 때문에 검색속도가 상당히 빠름.
        // 배열의 길이가 10배 늘어나도 검색횟수는 3~4회밖에 늘어나지 않음. 단, 정렬이 되어 있는 경우에만 사용가능.

    }

}
