import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5; // Queue에 최대 5개만 저장되도록 함.

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.print(">>");
            try {
                // 화면으로부터 입력받기
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine().trim();
                if ("".equals(input)) // 입력값이 아무것도 없으면 다시 처음으로 돌아감.
                    continue;
                if (input.equalsIgnoreCase("q")) { // q를 입력받으면 시스템 종료.
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) { // help를 입력받으면 도움말을 보여줌.
                    System.out.println("help - 도움말을 보여줍니다.");
                    System.out.println("q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) { // history를 입력받으면
                    int i = 0;
                    save(input);
                    // Queue에는 메소드가 몇 개 없기 때문에 LinkedList로 형변환 해줌.
                    // ** Iterator : 순서(인덱스)가 없는 요소들을 찾아서 반환.
                    // ListIterator : Iterator를 상속받아 기능을 추가한 것(양방향으로 이동이 가능함.)
                    LinkedList tmp = (LinkedList) q;
                    ListIterator it = tmp.listIterator();
                    while (it.hasNext()) // 다음요소가 있는 지 없는 지 확인 후
                        System.out.println(++i + "." + it.next()); // 있으면 다음 요소를 읽어옴.
                } else {
                    save(input);
                    System.out.println(input);
                }

            } catch (Exception e) {
                System.out.println("입력오류입니다.");
            }
        } // End while
    } // End main

    public static void save(String input) {
        // queue에 저장하기
        if (!"".equals(input)) {
            q.offer(input);
        }
        // queue의 최대크기를 넘어서면 제일 처음 입력된 것을 삭제
        if (q.size() > MAX_SIZE) {
            q.remove();
        }
    }
}
