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
    public void checkTicket_maxflights_false()
    {
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        try {
            ticket.add(new Flight("YYY", "KLL", 
                new DateTime(new Date(12, 20, 2000), new Time12(1, 0, AmPm.pm)), 
                new DateTime(new Date(12, 21, 2000), new Time12(11, 0, AmPm.pm))));
            ticket.add(new Flight("KLL", "WEE", 
                new DateTime(new Date(12, 21, 2000), new Time12(11, 30, AmPm.pm)), 
                new DateTime(new Date(12, 22, 2000), new Time12(12, 0, AmPm.pm))));
        } catch (Exception e) {
            //TODO: handle exception
        }
        assertFalse(Ticket.checkTicket(ticket, 1, 9000, 9000, true));
    }

    @Test
    public void checkTicket_IncorrectAirportCode_false()
    {
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        try {
            ticket.add(new Flight("YY", "KL", 
                new DateTime(new Date(12, 20, 2000), new Time12(1, 0, AmPm.pm)), 
                new DateTime(new Date(12, 21, 2000), new Time12(11, 0, AmPm.pm))));
            ticket.add(new Flight("KL", "WEE", 
                new DateTime(new Date(12, 21, 2000), new Time12(11, 30, AmPm.pm)), 
                new DateTime(new Date(12, 22, 2000), new Time12(12, 0, AmPm.pm))));
        } catch (Exception e) {
            //TODO: handle exception
        }
        assertFalse(Ticket.checkTicket(ticket, 4, 9000, 9000, true));
    }

    @Test
    public void checkTicket_2SchengenAirports_false()
    {
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        try {
            ticket.add(new Flight("BRU", "VIE", 
                new DateTime(new Date(12, 20, 2000), new Time12(1, 0, AmPm.pm)), 
                new DateTime(new Date(12, 21, 2000), new Time12(11, 0, AmPm.pm))));
            ticket.add(new Flight("VIE", "WEE", 
                new DateTime(new Date(12, 21, 2000), new Time12(11, 30, AmPm.pm)), 
                new DateTime(new Date(12, 22, 2000), new Time12(12, 0, AmPm.pm))));
        } catch (Exception e) {
            //TODO: handle exception
        }
        assertFalse(Ticket.checkTicket(ticket, 4, 9000, 9000, true));
    }

}