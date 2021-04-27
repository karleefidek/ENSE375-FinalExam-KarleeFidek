package com.uregina.app;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class DateTest 
{
    private Date date;

    @Before
    public void setup() {
        try {
            date = new Date(12, 1, 200);
        } catch (Exception e) {
            
        }
    }

    @Test
    public void lessThan_year2000year2000_false()
    {
        try {
            Date d1 = new Date(12, 24, 2000);
            Date d2 = new Date(12, 24, 2000);
            assertFalse( date.lessThan(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void lessThan_year2000year2015_true()
    {
        try {
            Date d1 = new Date(12, 24, 2000);
            Date d2 = new Date(12, 24, 2015);
            assertTrue( date.lessThan(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void lessThan_year2015year2015_false()
    {
        try {
            Date d1 = new Date(12, 24, 2015);
            Date d2 = new Date(12, 24, 2015);
            assertFalse( date.lessThan(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }    

    @Test
    public void lessThan_year2015year2000_false()
    {
        try {
            Date d1 = new Date(12, 24, 2015);
            Date d2 = new Date(12, 24, 2000);
            assertFalse( date.lessThan(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void lessThan_month2month2_false()
    {
        try {
            Date d1 = new Date(2, 24, 2000);
            Date d2 = new Date(2, 24, 2000);
            assertFalse( date.lessThan(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void lessThan_month2month12_true()
    {
        try {
            Date d1 = new Date(2, 24, 2000);
            Date d2 = new Date(12, 24, 2000);
            assertTrue( date.lessThan(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void lessThan_month12month12_false()
    {
        try {
            Date d1 = new Date(12, 24, 2000);
            Date d2 = new Date(12, 24, 2000);
            assertFalse( date.lessThan(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void lessThan_month12month2_false()
    {
        try {
            Date d1 = new Date(12, 24, 2000);
            Date d2 = new Date(2, 24, 2000);
            assertFalse( date.lessThan(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void lessThan_day24day24_false()
    {
        try {
            Date d1 = new Date(12, 24, 2000);
            Date d2 = new Date(12, 24, 2000);
            assertFalse( date.lessThan(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void lessThan_day24day3_false()
    {
        try {
            Date d1 = new Date(12, 24, 2000);
            Date d2 = new Date(12, 3, 2000);
            assertFalse( date.lessThan(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void lessThan_day3day3_false()
    {
        try {
            Date d1 = new Date(12, 3, 2000);
            Date d2 = new Date(12, 3, 2000);
            assertFalse( date.lessThan(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void lessThan_day3day24_true()
    {
        try {
            Date d1 = new Date(12, 3, 2000);
            Date d2 = new Date(12, 24, 2000);
            assertTrue( date.lessThan(d1, d2));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}