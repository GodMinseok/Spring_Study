package hello.inflearn_Spring_Basic.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
