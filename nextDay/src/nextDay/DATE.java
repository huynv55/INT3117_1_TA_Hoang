package nextDay;

public class DATE {
	int day;
	int month;
	int year;
	public DATE(){
		
	}
	public DATE(int d,int m,int y){
		if( m >= 1 && m <= 12){
			
			if(y>=0){
			if(m == 2){
				int t = y;
				while( t >= 4 ) t = t/4;
				if( t == 1){
					if(d >= 1 && d <= 29) day = d;
					month = m;
					year = y;
				}
				else{
					if(d >=1 && d <= 28) day = d;
					month = m;
					year = y;
				}
			}
			
			if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
				if(d >= 1 && d <= 31) day = d;
				month = m;
				year = y;
			}
			if( m==4 || m==6 || m==9 || m==11){
				if(d >= 1 && d <= 30) day = d;
				month = m;
				year = y;
			}
		 }
		}
		return;
	}
	public void setdate(int d,int m,int y){
		day = d;
		month = m;
		year = y;
	}
	public int getday(){
		return day;
	}
	public int getmonth(){
		return month;
	}
	public int getyear(){
		return year;
	}
	

}
