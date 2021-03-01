import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bingo {
    public static void main(String[] args) {
        // Set set = new HashSet();
        Set set = new LinkedHashSet();
        int[][] board = new int[5][5];

        for (int i = 0; set.size() < 25; i++) {
            set.add((int) (Math.random() * 50) + 1 + "");
        }
        Iterator it = set.iterator();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) it.next());
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
    // HashSet은 저장된 순서를 보장하지 않고, 자체적인 저장방식에 따라 순서가 결정됨.
    // 그래서 이 경우에는 LinkedHashSet이 더 좋은 방법임. 어차피 값은 랜덤함수에서 랜덤하게 뽑아져서 담기기 때문에
}
