package com.enumber;


import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Repeatable(Array.class)
@interface IT1
{
	int a();
	int b(); 
}
@Retention(RetentionPolicy.RUNTIME)
@interface Array
{
	IT1[] value();
}
@IT1(a=9,b=7)
@IT1(a=6,b=4)
@IT1(a=3,b=5)
@IT1(a=1,b=2)
public class Anotates {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IT1[] ii = Anotates.class.getAnnotationsByType(IT1.class);
		for (IT1 aa:ii)
		{
			System.out.println("Value a : "+ aa.a() + " Value b : "+aa.b() );
		}
		
		
		
	}

}
