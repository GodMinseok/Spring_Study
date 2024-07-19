package hello.inflearn_Spring_Basic;

import hello.inflearn_Spring_Basic.discount.DiscountPolicy;
import hello.inflearn_Spring_Basic.discount.FixDiscountPolicy;
import hello.inflearn_Spring_Basic.discount.RateDiscountPolicy;
import hello.inflearn_Spring_Basic.member.MemberRepository;
import hello.inflearn_Spring_Basic.member.MemberService;
import hello.inflearn_Spring_Basic.member.MemberServiceImpl;
import hello.inflearn_Spring_Basic.member.MemoryMemberRepository;
import hello.inflearn_Spring_Basic.order.OrderService;
import hello.inflearn_Spring_Basic.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //@Bean memberService -> new MemoryMemberRepository()
    //@Bean orderService -> new MemoryMemberRepository()

    //call AppConfig.memberService
    //call AppConfig.memberRepository
    //call AppConfig.memberRepository
    //call AppConfig.orderService
    //call AppConfig.memberRepository

    //call AppConfig.memberService
    //call AppConfig.memberRepository
    //call AppConfig.orderService

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), new FixDiscountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
