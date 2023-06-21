package ru.netology.service;

import org.junit.jupiter.api.Test;
import ru.netology.CashbackHackService;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CashbackHackServiceTest {

    @Test
    public void shouldRemainTheAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateWith900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateLessThen1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }
}
