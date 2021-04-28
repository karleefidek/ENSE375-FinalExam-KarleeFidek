package com.uregina.app;

import static org.junit.Assert.*;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class TicketTest 
{

    //checkTicket( ArrayList<Flight> ticket, int maxFlightsCount, int maxFlightTime, int maxLayoverTime, boolean hasSchengenVisa)
    @Test
    public void subtract_date1IsDayAfterDate2_1440()
    {
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        ticket.add(new Flight("YYY", "KLL", 
            new DateTime(new Date(12, 20, 2000), new Time12(1, 0, AmPm.pm)), 
            new DateTime(new Date(12, 21, 2000), new Time12(11, 0, AmPm.pm))));
        ticket.add(new Flight("KLL", "WEE", 
            new DateTime(new Date(12, 21, 2000), new Time12(11, 30, AmPm.pm)), 
            new DateTime(new Date(12, 22, 2000), new Time12(12, 0, AmPm.pm))));
        assertFalse(Ticket.checkTicket(ticket, 1, 9000, 9000, true));
    }

}