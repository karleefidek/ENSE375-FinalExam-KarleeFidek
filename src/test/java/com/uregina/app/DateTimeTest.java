package com.uregina.app;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class DateTimeTest 
{
    private DateTime dt1;

    @Before
    public void setup() {
        try {
            dt1 = new DateTime(new Date(12, 24, 2000), new Time12(12, 0, AmPm.am));
        } catch (Exception e) {
            
        }
    }

    @Test
    public void test()
    {
        try {
            DateTime dt3 = new DateTime(new Date(12, 24, 2000), new Time12(12, 0, AmPm.am));
            DateTime dt2 = new DateTime(new Date(12, 25, 2000), new Time12(11, 50, AmPm.pm));
            assertEquals(2870, dt1.subtract(dt2, dt3));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

}