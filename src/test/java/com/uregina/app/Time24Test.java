package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class Time24Test 
{
    private Time24 time;
    @BeforeAll
    public setup {
        time = new Time24(0, 0);
    }

    @Test
    public void toTime24_1245am_045pass()
    {
        Time24 convertedTime = time.toTime24(12, 45, AmPm.am);
        assertEquals( 0, convertedTime.getHours());
        assertEquals( 45, convertedTime.getMinutes());
    }

    @Test
    public void toTime24_245pm_1445pass()
    {
        Time24 convertedTime = time.toTime24(2, 45, AmPm.pm);
        assertEquals( 14, convertedTime.getHours());
        assertEquals( 45, convertedTime.getMinutes());
    }

    @Test
    public void toTime24_1045am_1045pass()
    {
        Time24 convertedTime = time.toTime24(10, 45, AmPm.am);
        assertEquals( 10, convertedTime.getHours());
        assertEquals( 45, convertedTime.getMinutes());
    }

    @Test
    public void toTime24_1245pm_1245pass()
    {
        Time24 convertedTime = time.toTime24(12, 45, AmPm.pm);
        assertEquals( 12, convertedTime.getHours());
        assertEquals( 45, convertedTime.getMinutes());
    }
}