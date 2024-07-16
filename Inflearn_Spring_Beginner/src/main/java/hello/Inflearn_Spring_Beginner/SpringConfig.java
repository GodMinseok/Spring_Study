package hello.Inflearn_Spring_Beginner;

import hello.Inflearn_Spring_Beginner.repository.JdbcMemberRepository;
import hello.Inflearn_Spring_Beginner.repository.MemberRepository;
import hello.Inflearn_Spring_Beginner.repository.MemoryMemberRepository;
import hello.Inflearn_Spring_Beginner.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;
@Configuration
public class SpringConfig {
    private final DataSource dataSource;
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
// return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);
    }
}
