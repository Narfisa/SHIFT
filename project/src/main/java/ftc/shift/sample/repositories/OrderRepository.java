package ftc.shift.sample.repositories;

import ftc.shift.sample.models.Order;

import java.util.Date;
import java.util.List;

public interface OrderRepository {

    Order getOne(Integer ID);

    Order create(String fromAddress,
                 String toAddress,
                 Integer price,
                 Date orderTime,
                 Date deliveryTime,
                 char Status,
                 String Note);

    List<Order> getAll();
}
