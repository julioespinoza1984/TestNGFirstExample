package edu.jespinoza.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class McdCalculatorTest {
    @Test
    public void testGetMcd(){
        McdCalculator calc = new McdCalculator();
        Assert.assertEquals(calc.getMcd(0, 0), 0);
        Assert.assertEquals(calc.getMcd(0, 30), 30);
        Assert.assertEquals(calc.getMcd(15, 0), 15);
        Assert.assertEquals(calc.getMcd(15, 30), 15);
        Assert.assertEquals(calc.getMcd(8, 12), 4);
        Assert.assertEquals(calc.getMcd(9, 18), 9);
        Assert.assertEquals(calc.getMcd(20, 16), 4);
        Assert.assertEquals(calc.getMcd(18, 24), 6);
        Assert.assertEquals(calc.getMcd(21, 28), 7);
        Assert.assertEquals(calc.getMcd(24, 32), 8);
        Assert.assertEquals(calc.getMcd(137, 2603), 137);
        Assert.assertEquals(calc.getMcd(1189, 123656), 1189);
        Assert.assertEquals(calc.getMcd(144, 520), 8);
        Assert.assertEquals(calc.getMcd(51, 187), 17);
        Assert.assertEquals(calc.getMcd(76, 1710), 38);
        Assert.assertEquals(calc.getMcd(93, 2387), 31);
        Assert.assertEquals(calc.getMcd(111, 518), 37);
        Assert.assertEquals(calc.getMcd(212, 1431), 53);
        Assert.assertEquals(calc.getMcd(948, 1975), 79);
        Assert.assertEquals(calc.getMcd(1164, 3686), 194);
        Assert.assertEquals(calc.getMcd(303, 1313), 101);
        Assert.assertEquals(calc.getMcd(19578, 47190), 78);
        Assert.assertEquals(calc.getMcd(19367, 33277), 107);
        Assert.assertEquals(calc.getMcd(207207, 479205), 207);
        Assert.assertEquals(calc.getMcd(9879, 333555), 111);
        Assert.assertEquals(calc.getMcd(35211, 198803), 121);
        Assert.assertEquals(calc.getMcd(77615, 108661), 15523);
        Assert.assertEquals(calc.getMcd(65880, 92415), 915);
        Assert.assertEquals(calc.getMcd(1002001, 2136134), 11011);
        Assert.assertEquals(calc.getMcd(4008004, 4280276), 4004);
    }
}
