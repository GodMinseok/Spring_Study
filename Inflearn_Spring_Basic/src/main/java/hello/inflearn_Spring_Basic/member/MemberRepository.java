package hello.inflearn_Spring_Basic.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
