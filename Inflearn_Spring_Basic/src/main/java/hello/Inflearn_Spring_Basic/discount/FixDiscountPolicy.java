package hello.Inflearn_Spring_Basic.discount;

import hello.Inflearn_Spring_Basic.member.Grade;
import hello.Inflearn_Spring_Basic.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; //1000원 할인
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }

    }
}
