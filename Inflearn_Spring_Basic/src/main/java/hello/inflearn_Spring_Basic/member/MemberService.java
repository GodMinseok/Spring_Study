package hello.inflearn_Spring_Basic.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
