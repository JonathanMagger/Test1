package com.make;
@FunctionalInterface
interface Student{
	public String Exam(String a , String b);
}
public class Lambda0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ss = (Subject1,Subject2) -> {
			return "Subject are "+Subject1 + " and "+ Subject2;
					};
			System.out.println("Data is : "+ ss.Exam("Java", "Angular"));
			System.out.println("Data is : "+ ss.Exam("C++", "Borland"));
			
			Student ss1 = (String a,String b) -> {
				return "Subject are "+a + " and "+ b;
			};
			System.out.println("Data is : "+ ss1.Exam("Python", "React"));
			
			Student ss2 = (String a,String b) -> ("Subject are "+a + " and "+ b);
			
			System.out.println("Data is : "+ ss2.Exam("Python", "React"));
		}
	}


