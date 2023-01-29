package chain.example2;

/**
 * @author hubin
 * @date 2023年01月05日 13:17
 */
public class App {
    public static void main(String[] args) {
        Member member = new Member("hb", "123456");
        MemberService.login(member);
    }
}
