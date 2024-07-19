package hello.inflearn_Spring_Basic.order;

import hello.inflearn_Spring_Basic.discount.FixDiscountPolicy;
import hello.inflearn_Spring_Basic.member.Grade;
import hello.inflearn_Spring_Basic.member.Member;
import hello.inflearn_Spring_Basic.member.MemoryMemberRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class OrderServiceImplTest {

    @Test
    void createOrder() {
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "name", Grade.VIP));

        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new FixDiscountPolicy());
        Order order = orderService.createOrder(1L, "itemA", 10000);
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}