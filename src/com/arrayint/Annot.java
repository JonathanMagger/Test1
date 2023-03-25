package com.arrayint;
import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone
{
	String model() default "samsung";
	String version () default "G-11";
	
}
@Smartphone(model="IPHONE",version="14-Pro")
class Mobile
{
	
}
public class Annot {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m =new Mobile();
		Class data =m.getClass();
		Annotation an = data.getAnnotation(Smartphone.class);
		Smartphone ss = (Smartphone) an;
		System.out.println(ss.model());
		System.out.println(ss.version());
	}

}
