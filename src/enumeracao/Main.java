package enumeracao;


import entities.Order;
import entities.OrderStatus;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT); // foi criada uma enumeracao no orderstatus e a order é
        System.out.println(order);


        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
