package hello.Inflearn_Spring_Basic;

import hello.Inflearn_Spring_Basic.discount.FixDiscountPolicy;
import hello.Inflearn_Spring_Basic.member.MemberRepository;
import hello.Inflearn_Spring_Basic.member.MemberService;
import hello.Inflearn_Spring_Basic.member.MemberServiceImpl;
import hello.Inflearn_Spring_Basic.member.MemoryMemberRepository;
import hello.Inflearn_Spring_Basic.order.OrderService;
import hello.Inflearn_Spring_Basic.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }


}
