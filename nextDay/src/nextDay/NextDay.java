package nextDay;

import java.util.*;
import java.io.*;
import java.lang.*;

public class NextDay {
	public static DATE nextday(DATE d){
		DATE kq = new DATE();
		int dd = d.getday();
		int md = d.getmonth();
		int yd = d.getyear();
		
		if(dd == 28){
			if( md == 2) 
				if(yd % 4 == 0) kq.setdate(dd + 1,md , yd);
				else kq.setdate(1, md+1, yd);
			else kq.setdate(dd + 1, md, yd);
			return kq;
		}
		if(dd==29) {
			kq.setdate(1, md +1, yd);
			return kq;
		}
		if(dd == 30){
			if( md==4 || md==6 || md==9 || md==11) kq.setdate(1, md + 1, yd);
			else kq.setdate(dd + 1, md, yd);
			return kq;
		}
		if(dd == 31){
			if( md==1 || md==3 || md==5 || md==7 || md==8 || md==10) kq.setdate(1, md + 1, yd);
			if( md == 12) kq.setdate(1, 1, yd + 1);
			return kq;
		}
		kq.setdate(dd + 1, md, yd);
		return kq;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
