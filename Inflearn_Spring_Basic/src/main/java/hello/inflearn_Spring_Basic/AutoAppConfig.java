package hello.inflearn_Spring_Basic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


@Configuration
@ComponentScan(
        basePackages = "hello.inflearn_Spring_Basic.member",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes =
                Configuration.class))
public class AutoAppConfig {

    //@Bean(name = "memoryMemberRepository")
    //public MemberRepository memberRepository() {
       // return new MemoryMemberRepository();
   // }
}

