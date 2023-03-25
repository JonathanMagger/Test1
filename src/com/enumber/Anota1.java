package com.enumber;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone
{
	String model()default "Samsung";
	String version()default "G-11";
}

@SmartPhone()
class MobileSeries
{
	
}

public class Anota1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MobileSeries ms = new MobileSeries();
		Class data = ms.getClass();
				Annotation an = data.getAnnotation(SmartPhone.class);
				SmartPhone ss =(SmartPhone) an;
				System.out.println("Default Model is : "+ss.model());
				System.out.println("Default Version is : "+ss.version());
	}

}
