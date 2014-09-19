package phuongtrinhbac2;
import java.io.*;
import java.util.*;
import java.lang.*;

public class ptb2 {
	
	public static void giaiptb2(float a,float b,float c,double x1,double x2,boolean nghiem ){
		float delta = (b*b) - (4*a*c);
		System.out.println("delta = " + delta);
		if(delta < 0) {
			nghiem = false;
		}else{
			nghiem = true;
			x1 = (-b + Math.sqrt(delta))/(2*a);
			x2 = (-b - Math.sqrt(delta))/(2*a);
		}
		
	}

	
	public static void main(String[] args) {
				// TODO Auto-generated method stub

	}

}
