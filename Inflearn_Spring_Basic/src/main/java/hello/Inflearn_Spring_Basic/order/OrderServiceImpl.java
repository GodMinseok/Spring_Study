package hello.Inflearn_Spring_Basic.order;

import hello.Inflearn_Spring_Basic.discount.DiscountPolicy;
import hello.Inflearn_Spring_Basic.discount.FixDiscountPolicy;
import hello.Inflearn_Spring_Basic.discount.RateDiscountPolicy;
import hello.Inflearn_Spring_Basic.member.Member;
import hello.Inflearn_Spring_Basic.member.MemberRepository;
import hello.Inflearn_Spring_Basic.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new
            MemoryMemberRepository();
    private DiscountPolicy discountPolicy;
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}

