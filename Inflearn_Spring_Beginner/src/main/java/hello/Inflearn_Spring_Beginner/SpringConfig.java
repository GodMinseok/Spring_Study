package hello.Inflearn_Spring_Beginner;

import hello.Inflearn_Spring_Beginner.repository.MemberRepository;
import hello.Inflearn_Spring_Beginner.repository.MemoryMemberRepository;
import hello.Inflearn_Spring_Beginner.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
