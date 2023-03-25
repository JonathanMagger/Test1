package com.enumber;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention (RetentionPolicy.RUNTIME)
@interface MyAnnotation
{
	int cost ()default 2000;
}
class MyData
{
	@MyAnnotation(cost=3000)
	public void mobilerecords()
	{
		System.out.println("samsung - G11");
	}
}
public class Anota3 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub

			MyData md = new MyData();
			Method mm = md.getClass().getMethod("mobilerecords");
			
			MyAnnotation ma = mm.getAnnotation(MyAnnotation.class);
			System.out.println("result is : "+ma.cost());
	}

}
