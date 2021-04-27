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
    public void subtract_moreThan1DayApart_exception()
    {
        try {
            DateTime d1 = new DateTime(new Date(12, 20, 2000), new Time12(1, 0, AmPm.pm));
            DateTime d2 = new DateTime(new Date(12, 25, 2000), new Time12(1, 0, AmPm.pm));
            dt1.subtract(d1, d2);
            
            fail("Should have thrown an exception");
        } catch (Exception e) {
            assertEquals("Date difference is more than 1", e.getMessage());
        }
    }

    @Test
    public void subtract_equalDates_neg75()
    {
        try {
            DateTime d1 = new DateTime(new Date(12, 20, 2000), new Time12(1, 0, AmPm.pm));
            DateTime d2 = new DateTime(new Date(12, 20, 2000), new Time12(2, 15, AmPm.pm));
            assertEquals(-75, dt1.subtract(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void subtract_date1IsDayAfterDate2_1440()
    {
        try {
            DateTime d1 = new DateTime(new Date(12, 21, 2000), new Time12(1, 0, AmPm.pm));
            DateTime d2 = new DateTime(new Date(12, 20, 2000), new Time12(1, 0, AmPm.pm));
            assertEquals(1440, dt1.subtract(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void subtract_date2IsDayAfterDate1_neg1440()
    {
        try {
            DateTime d1 = new DateTime(new Date(12, 20, 2000), new Time12(1, 0, AmPm.pm));
            DateTime d2 = new DateTime(new Date(12, 21, 2000), new Time12(1, 0, AmPm.pm));
            assertEquals(-1440, dt1.subtract(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

}