package hello.Inflearn_Spring_Basic.order;

import hello.Inflearn_Spring_Basic.discount.DiscountPolicy;
import hello.Inflearn_Spring_Basic.discount.FixDiscountPolicy;
import hello.Inflearn_Spring_Basic.discount.RateDiscountPolicy;
import hello.Inflearn_Spring_Basic.member.Member;
import hello.Inflearn_Spring_Basic.member.MemberRepository;
import hello.Inflearn_Spring_Basic.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}

