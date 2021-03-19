package com.example.demo.PersistanceTest;

import com.example.demo.model.persistence.Item;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    @Test
    public void testNotEquals() {
        Item item = com.example.demo.ControllerTest.UtilsTest.getItem0();
        assertNotEquals(item, null);
        String str = "john";
        assertNotEquals(str, item);
        Item item2 = com.example.demo.ControllerTest.UtilsTest.getItem1();
        assertNotEquals(item, item2);
        item.setId(null);
        assertNotEquals(item, item2);
    }

    @Test
    public void testEquals_Symmetric() {
        Item item1 = new Item();  // equals and hashCode check id field value
        item1.setId(0L);
        Item item2 = new Item();
        item2.setId(0L);
        assertTrue(item1.equals(item2) && item2.equals(item1));
        assertEquals(item2.hashCode(), item1.hashCode());
    }
}
