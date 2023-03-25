package com.enumber;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Country.class)
@interface City
{
	String name();
	String day();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Country
{
	City[] value();
}
@City (name="Jakarta",day="Sunday")
@City (name="Boston",day="Monday")
@City (name="Hyderabad",day="Tuesday")
public class Anota4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City[] cc = Anota4.class.getAnnotationsByType(City.class);
		for(City data : cc)
		{
			System.out.println("Show in : "+data.name() + " -- "+"Day is: "+data.day());
		}
	}

}
