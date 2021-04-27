package com.uregina.app;

import static org.junit.Assert.*;

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
    public void subtract_10am10am_0pass()
    {
        try {
            Time12 t1 = new Time12(10, 0, AmPm.am);
            Time12 t2 = new Time12(10, 0, AmPm.am);
            assertEquals( 0, time.subtract(t1, t2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void subtract_10am115pm_neg195pass()
    {
        try {
            Time12 t1 = new Time12(10, 0, AmPm.am);
            Time12 t2 = new Time12(1, 15, AmPm.pm);
            assertEquals( -195, time.subtract(t1, t2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void subtract_10am13am_invalidpass()
    {
        try {
            Time12 t1 = new Time12(10, 0, AmPm.am);
            Time12 t2 = new Time12(13, 0, AmPm.am);
        } catch (Exception e) {
            //TODO: handle exception
            assertEquals(InvalidTimeException.class, e.class);
        }
    }

    @Test
    public void subtract_115pm115pm_0pass()
    {
        try {
            Time12 t1 = new Time12(1, 15, AmPm.pm);
            Time12 t2 = new Time12(1, 15, AmPm.pm);
            assertEquals( 0, time.subtract(t1, t2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void subtract_115pm13am_invalidpass()
    {
        try {
            Time12 t1 = new Time12(1, 15, AmPm.pm);
            Time12 t2 = new Time12(13, 0, AmPm.am);
        } catch (Exception e) {
            //TODO: handle exception
            assertEquals(InvalidTimeException.class, e.class);
        }
    }

    @Test
    public void subtract_115pm10am_195pass()
    {
        try {
            Time12 t1 = new Time12(1, 15, AmPm.pm);
            Time12 t2 = new Time12(10, 0, AmPm.am);
            assertEquals( 195, time.subtract(t1, t2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
    @Test
    public void subtract_13pm13pm_invalidpass()
    {
        try {
            Time12 t1 = new Time12(13, 0, AmPm.pm);
            Time12 t2 = new Time12(13, 0, AmPm.pm);
        } catch (Exception e) {
            //TODO: handle exception
            assertEquals(InvalidTimeException.class, e.class);
        }
    }

    @Test
    public void subtract_13pm10am_invalidpass()
    {
        try {
            Time12 t1 = new Time12(13, 0, AmPm.pm);
            Time12 t2 = new Time12(10, 0, AmPm.am);
        } catch (Exception e) {
            //TODO: handle exception
            assertEquals(InvalidTimeException.class, e.class);
        }
    }

    @Test
    public void subtract_13pm115pm_invalidpass()
    {
        try {
            Time12 t1 = new Time12(13, 0, AmPm.pm);
            Time12 t2 = new Time12(1, 15, AmPm.pm);
        } catch (Exception e) {
            //TODO: handle exception
            assertEquals(InvalidTimeException.class, e.class);
        }
    }
}