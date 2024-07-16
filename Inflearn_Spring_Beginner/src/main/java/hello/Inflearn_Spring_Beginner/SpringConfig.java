package hello.Inflearn_Spring_Beginner;

import hello.Inflearn_Spring_Beginner.repository.JdbcTemplateMemberRepository;
import hello.Inflearn_Spring_Beginner.repository.JpaMemberRepository;
import hello.Inflearn_Spring_Beginner.repository.MemberRepository;
import hello.Inflearn_Spring_Beginner.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfig {
    private final MemberRepository memberRepository;
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}
