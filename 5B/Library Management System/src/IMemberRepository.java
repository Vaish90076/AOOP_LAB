// IMemberRepository.java
public interface IMemberRepository {
    void addMember(Member member);
    void removeMember(String memberId);
    Member getMember(String memberId);
}
