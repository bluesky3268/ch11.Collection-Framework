import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");
        // asdf라는 key가 이미 존재하기 때문에 value를 1234로 덮어씀.
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("id와 password를 입력하세요.>>");
            System.out.print("id : >>");
            String id = sc.nextLine().trim();

            System.out.print("password : >>");
            String password = sc.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id가 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            } else {
                if (!(map.get(id)).equals(password)) {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                } else {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
            }

        }
    }

}
