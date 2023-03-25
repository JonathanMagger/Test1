package com.arrayint;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Target(ElementType.METHOD)
@Retention (RetentionPolicy.RUNTIME)
@interface Anone{
	int cost() default 2000;
}
class MyData
{
	@Anone (cost = 3000)
	public void mobile()
	{
		System.out.println("samsung - G11");
	}
}

public class Anno {
	

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
MyData md =new MyData();
Method mm = md.getClass().getMethod("mobile");
Anone a = mm.getAnnotation(Anone.class);
System.out.println("Result is "+a.cost());
	}

}
