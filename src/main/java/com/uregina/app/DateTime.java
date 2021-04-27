package com.uregina.app;

import com.uregina.exceptions.*;

/**
 * DateTime class that consists of a Date object and a Time12 object
 *
 */
public class DateTime 
{
	Time12 time; // 12-hour time
	Date date; 	 // MM/DD/YYYY 
    /** 
	 * constructor to initial Time24 object
	 * @param time 		12-hour time object (hh:mm am/pm)
	 * @param date		date object (MM/DD/YYYY)
	*/
	public DateTime(Date date,Time12 time)
    {
		this.date=date;
		this.time=time;
    }
	/**
	* returns the 12-hour part (hh:mm am/pm) of the DateTime  
	*/
	public Time12 getTime()
	{
		return time;
	}
	/**
	* returns The date part (MM/DD/YYYY) of the DateTime  
	*/
	public Date getDate()
	{
		return date;
	}
	/**
	 * subtract two DateTimes
	 * @param  d1	a DateTime object (MM/DD/YYYY  hh:mm am/pm)
	 * @param  d2	a DateTime object (MM/DD/YYYY  hh:mm am/pm)
	 * @return 		the value of (d1-d2) in minutes
	 * 				it may be a negative value
	 *				Throws MoreThanOneDayException if d1,d2 are not at the same date or
	 * 						not a consequative days.
	 * usefeul functions that you may use
	 * 		(class: Date , method: equal)
	 * 		(class: Time12 , method: subtract)
	 * 		(class: Date , method: nextDate)
	 */
	public static int subtract(DateTime d1,DateTime d2) throws MoreThanOneDayException
	{
		int diff=0;

		//Todo: add your code here
		Date d1Next = d1.date.nextDate();
		Date d2Next = d2.date.nextDate();
		
		try {
			Time12 endDay = new Time12(11, 59, AmPm.pm);
			Time12 begDay = new Time12(12, 0, AmPm.am);

			if (!d1.date.equal(d1.date, d2.date) && 
				!d1.date.equal(d1Next, d2.date) &&
				!d1.date.equal(d1.date, d2Next)) {
					throw new MoreThanOneDayException();
			}

			if (d1.date.equal(d1.date, d2.date)) {
				diff = d1.time.subtract(d1.time, d2.time);
			}
			else if (d1.date.equal(d1.date, d2Next)) {
				diff += d1.time.subtract(d1.time, begDay);
				diff += d1.time.subtract(endDay, d2.time);
				diff += 1;
			}
			else {
				diff += d1.time.subtract(d1.time, endDay);
				diff += d1.time.subtract(begDay, d2.time);
				diff -= 1;
			}
		} catch (Exception e) {
			//TODO: handle exception
			throw new MoreThanOneDayException();
		}

		//end of your code
		return diff;
	}
	/**
	 * Convert a DateTime object to string
	 * @param  None
	 * @return a string in the fromat MM/DD/YYYY hh:mm am/pm
	*/
	public String toString()
	{
		return date.toString()+" "+time.toString();
	}
	/**
	 * checks if a DateTime is before another one
	 * @param 	d1 a DateTime object
	 * @param 	d2 a DateTime object
	 * @return	true if d1<d2, false otherwise
	*/
	public static boolean lessThan(DateTime d1, DateTime d2)
	{
		return Date.lessThan(d1.date,d2.date) || ( Date.equal(d1.date,d2.date) && Time12.lessThan(d1.time,d2.time)) ;
	}
}
