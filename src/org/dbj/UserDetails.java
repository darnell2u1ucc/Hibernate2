package org.dbj;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name = "schedule")
public class UserDetails {
	@Id
	@GeneratedValue
	private int variable;
	private int month;
	private int day;
	private int year;
	private double hours;
	private String dayName;
	
	public int getMonth(){
		return this.month;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	
	public int getDay(){
		return this.day;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public String getDayName(){
		return this.dayName;
	}
	
	public void setDayName(String dayName){
		this.dayName = dayName;
	}
	
	public double getHours(){
		return this.hours;
		
	}
	
	public void setHours(double hours){
		this.hours = hours;
	}

}
