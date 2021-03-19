package com.example.demo.PersistanceTest;

import com.example.demo.model.persistence.UserOrder;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserOrderTest {

    @Test
    public void testGetId() {
        UserOrder userOrder = new UserOrder();
        userOrder.setId(10L);
        assertEquals(10L, userOrder.getId());
    }

    @Test void testGetTotal() {
        UserOrder userOrder= new UserOrder();
        BigDecimal total = new BigDecimal("10.99");
        userOrder.setTotal(total);
        assertEquals(total, userOrder.getTotal());
    }
}
