package hello.Inflearn_Spring_Basic.discount;

import hello.Inflearn_Spring_Basic.member.Grade;
import hello.Inflearn_Spring_Basic.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }

    }
}