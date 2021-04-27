package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class Time12Test 
{
    private Time12 time;

    @Before
    public void setup() {
        try {
            time = new Time12(12, 0, AmPm.am);
        } catch (Exception e) {
            
        }
    }

    @Test
    public void subtract_equalTimes_0pass()
    {
        try {
            Time12 t1 = new Time12(1, 14, AmPm.pm);
            Time12 t2 = new Time12(12, 0, AmPm.am);
            assertEquals( 74, time.subtract(t1, t2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    // @Test
    // public void toTime24_245pm_1445pass()
    // {
    //     Time24 convertedTime = time.toTime24(2, 45, AmPm.pm);
    //     assertEquals( 14, convertedTime.getHours());
    //     assertEquals( 45, convertedTime.getMinutes());
    // }

    // @Test
    // public void toTime24_1045am_1045pass()
    // {
    //     Time24 convertedTime = time.toTime24(10, 45, AmPm.am);
    //     assertEquals( 10, convertedTime.getHours());
    //     assertEquals( 45, convertedTime.getMinutes());
    // }

    // @Test
    // public void toTime24_1245pm_1245pass()
    // {
    //     Time24 convertedTime = time.toTime24(12, 45, AmPm.pm);
    //     assertEquals( 12, convertedTime.getHours());
    //     assertEquals( 45, convertedTime.getMinutes());
    // }
}