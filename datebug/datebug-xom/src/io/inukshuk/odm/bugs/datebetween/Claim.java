package io.inukshuk.odm.bugs.datebetween;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Claim {

	private static final String pattern = "yyyy-MM-dd";
	private Date date = null;
	private String message = null;

	
	public Claim() {
		super();
	}

	public Claim(String date) {
		setDateString(date);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDateString(String dateString)
	{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		try {
			date = simpleDateFormat.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Claim [date=" + date + ", message=" + message + "]";
	}
	

	
	
}
