package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {


    @Test
    public void shouldCalcCashbackRemain() {

        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(100);

        int expected = 900;

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void shouldCalcCashbackEqualBoundary() {

        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(0);

        int expected = 0;


        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcCashbackOverBoundary() {

        CashbackHackService cashback = new CashbackHackService();


        int actual = cashback.remain(1_100);

        int expected = 900;


        Assert.assertEquals(actual, expected);
    }
}