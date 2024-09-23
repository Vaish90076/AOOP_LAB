import java.util.HashMap;
import java.util.Map;

public class InMemoryMemberRepository implements IMemberRepository {
    private Map<String, Member> memberMap = new HashMap<>();

    @Override
    public void addMember(Member member) {
        memberMap.put(member.getId(), member);
    }

    @Override
    public void removeMember(String memberId) {
        memberMap.remove(memberId);
    }

    @Override
    public Member getMember(String memberId) {
        return memberMap.get(memberId);
    }
}
