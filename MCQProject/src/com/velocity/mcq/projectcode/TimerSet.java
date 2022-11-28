package com.velocity.mcq.projectcode;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerSet {
	int min=600000;
	Timer timer;
	int countdown=min;
	int i=0;
	
	int secs;
	public static void main(String[] args) {
		
		TimerSet t=new TimerSet();
		t.timeDisplay();
		t.setTime(10, 00);
		String value=t.toSet();
		
		System.out.println("Time set is "+value);

	}
	public void timeDisplay()
	{
		
		Timer timer=new Timer();
		timer.scheduleAtFixedRate(new TimerTask()
				{

					@Override
					public void run() {
						
						for(i=countdown;i>=0;i--)
						{
							//System.out.println(i);
							if(i<4)
							{
								System.out.println("Warning only 3 seconds are left "+i);
							}
							if(i==0)
								
							{
								System.out.println("Time is over!..");
				
							}
							if(i<590000)
							{
								System.out.println("limit reached");
								System.exit(0);
							}
							try {
								Thread.sleep(10);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
						}
						if(i<0)
						{
							timer.cancel();
						}
						
						
					}
			
			
				}, 0, 1000);
		
	}
	public void setTime(int m, int s)
	{
		min=((m>=0 && m<=60)? m:0);
		
		secs=((s>=0 && s<=60)? s:0);
	}
	public String toSet()
	{
		return String.format("%02d:%02d", min, secs);
	}

}
