package com.enumber;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone2
{
	String model()default "Samsung";
	String version()default "G-11";
}

@SmartPhone2 (model ="iPhone",version="14-Pro")
class MobileSeries2
{
	String model;
	String version;
}

public class Anota2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileSeries2 ms = new MobileSeries2 ();
		Class data = ms.getClass();
		Annotation an = data.getAnnotation(SmartPhone2.class);
		SmartPhone2 ss = (SmartPhone2)an;
		System.out.println("Default Model is : "+ss.model());
		System.out.println("Default Model is : "+ss.version());
		
		
	}

}
