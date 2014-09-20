package triangle;
import java.util.*;
import java.io.*;
import java.lang.*;

public class triangle {
	
	public static int Istriangle(int a, int b, int c){
		//result :
		//kq = 0 : is not triangle - ko la tam giac
		//kq = 1 : triangle - la tam giaac thuong
		//kq = 2 : isosceless triangle - tam giac can
		//kq = 3 : equilateral triangle - tam giac deu
		//kq = 4 : right triangle - tam giac vuong
		//kq = 5 : right-isosceless triangle - tam giac vuong can
		
		boolean t1 = ( a + b > c) && ( a + c > b) && (b + c > a);
		boolean t2 = (a == b) || (a == c) || (b == c);
		boolean t3 = (a == b) && (a == c) && (b == c);
		boolean t4 = (a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a);
		if(t1){
			if(t2) {
				if(t4) return 5;
				if(t3) return 3;
				return 2;
					}
			if(t4) return 4;
			return 1;
		}
		else{
			return 0;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
