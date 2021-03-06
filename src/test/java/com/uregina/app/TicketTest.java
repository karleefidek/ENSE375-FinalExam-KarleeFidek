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
        assertFalse(Ticket.checkTicket(ticket, 4, 9000, 9000, false));
    }

    @Test
    public void checkTicket_invalidDatesForFlightTime_false()
    {
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        try {
            ticket.add(new Flight("YYY", "KLL", 
                new DateTime(new Date(12, 21, 2000), new Time12(1, 0, AmPm.pm)), 
                new DateTime(new Date(12, 20, 2000), new Time12(11, 0, AmPm.pm))));
            ticket.add(new Flight("KLL", "WEE", 
                new DateTime(new Date(12, 21, 2000), new Time12(11, 30, AmPm.pm)), 
                new DateTime(new Date(12, 22, 2000), new Time12(12, 0, AmPm.pm))));
        } catch (Exception e) {
            //TODO: handle exception
        }
        assertFalse(Ticket.checkTicket(ticket, 4, 9000, 9000, true));
    }

    @Test
    public void checkTicket_invalidDatesForLayoverTime_false()
    {
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        try {
            ticket.add(new Flight("YYY", "KLL", 
                new DateTime(new Date(12, 20, 2000), new Time12(1, 0, AmPm.pm)), 
                new DateTime(new Date(12, 21, 2000), new Time12(11, 0, AmPm.pm))));
            ticket.add(new Flight("KLL", "WEE", 
                new DateTime(new Date(12, 23, 2000), new Time12(11, 30, AmPm.pm)), 
                new DateTime(new Date(12, 24, 2000), new Time12(12, 0, AmPm.pm))));
        } catch (Exception e) {
            //TODO: handle exception
        }
        assertFalse(Ticket.checkTicket(ticket, 4, 9000, 9000, true));
    }

    @Test
    public void checkTicket_arrivalNotTheSameAsDeparture_false()
    {
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        try {
            ticket.add(new Flight("YYY", "KLL", 
                new DateTime(new Date(12, 20, 2000), new Time12(1, 0, AmPm.pm)), 
                new DateTime(new Date(12, 21, 2000), new Time12(11, 0, AmPm.pm))));
            ticket.add(new Flight("III", "WEE", 
                new DateTime(new Date(12, 21, 2000), new Time12(11, 30, AmPm.pm)), 
                new DateTime(new Date(12, 22, 2000), new Time12(12, 0, AmPm.pm))));
        } catch (Exception e) {
            //TODO: handle exception
        }
        assertFalse(Ticket.checkTicket(ticket, 4, 9000, 9000, true));
    }

    @Test
    public void checkTicket_maxflightTime_false()
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
        assertFalse(Ticket.checkTicket(ticket, 4, 1, 9000, true));
    }

    @Test
    public void checkTicket_maxLayoverTime_false()
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
        assertFalse(Ticket.checkTicket(ticket, 4, 9000, 1, true));
    }

    @Test
    public void checkTicket_validTicket_true()
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
        assertTrue(Ticket.checkTicket(ticket, 4, 9000, 9000, true));
    }
}