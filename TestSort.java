package collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	int rollno,age;
	String name;
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student st)
	{
		if(age==st.age)
			return 0;
		else if(age>st.age)
		return 1;
		else
			return -1;
	}
}
public class TestSort {
public static void main(String[] args){
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(new Student(111,"john",29));
	al.add(new Student(222,"sammy",21));
	al.add(new Student(333,"shep",26));
	Collections.sort(al);
	for(Student st:al){
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
}
}
