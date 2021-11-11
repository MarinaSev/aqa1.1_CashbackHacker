package ru.netology.servise;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void should900() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals("JUnit4", expected, actual);
    }

    @Test
    public void should1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 1000;

        assertEquals("JUnit4", expected, actual);
    }

    @Test
    public void should999() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        assertEquals("JUnit4", expected, actual);
    }

    @Test
    public void should1001() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals("JUnit4", expected, actual);
    }

    @Test
    public void should10500() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(10500);
        int expected = 500;

        assertEquals("JUnit4", expected, actual);
    }
}



