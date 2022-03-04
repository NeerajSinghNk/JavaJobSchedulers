package com.cts.demo;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class CreateNotePad {
	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Qatar"));
		SimpleDateFormat format = new
		SimpleDateFormat("MM_dd_yyyy_hh_mm_ss");
		Date currentDate = new Date();
		String fileName = format.format(currentDate);
		 PrintWriter writer=null;
		 try {
			 writer = new PrintWriter("D:\\JavaEclips\\Cron_Job\\file_"+fileName+".txt","UTF-8");
			 format = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
			 String current_time = format.format(currentDate);
			 writer.println(current_time);
			 writer.close();
			 System.out.println("finished");
			 } 
		 catch (Exception e) {
			 e.printStackTrace();
			 }
	}
}
