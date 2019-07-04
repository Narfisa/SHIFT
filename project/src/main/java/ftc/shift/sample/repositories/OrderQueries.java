package ftc.shift.sample.repositories;

import ftc.shift.sample.exception.NotFoundException;
import ftc.shift.sample.models.Order;
import ftc.shift.sample.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class OrderQueries implements OrderRepository{
    private Integer count = -1;
    private  List<Order> Orders = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");

    @Autowired
    public OrderQueries(){
        String srtdate = "03-07-2019 16:15:00";
        Date date = sdf.
        Orders.add(++count, "from", "to", 200, sdf.parse("03-07-2019 16:15:00"));
    }
}
