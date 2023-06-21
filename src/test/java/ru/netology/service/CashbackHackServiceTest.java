package ru.netology.service;

import ru.netology.CashbackHackService;

import static org.junit.Assert.assertEquals;



class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldRemainTheAmount(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }
    @org.junit.Test
    public void shouldCalculateWith900(){
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual,expected);
    }
    @org.junit.Test
    public void shouldCalculateLessThen1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual,expected);
    }

}