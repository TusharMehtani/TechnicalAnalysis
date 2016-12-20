package crawler;

import java.util.Scanner;

public class TotalRevenue {
	test t1 = new test();
	int i=7;
	public long getTotRev2016(String[] arr) throws NumberFormatException{
		long val;
		try{
			val = Long.parseLong(arr[i]);
		}catch(NumberFormatException nfe){
			i++;
			val = Long.parseLong(arr[i]);
		}
		return val;
	}
	public long getTotRev2015(String[] arr){
		long val = Long.parseLong(arr[i+1]);
		return val;
	}
	public long getTotRev2014(String[] arr){
		long val = Long.parseLong(arr[i+2]);
		return val;
	}
	public static void main(String[] args){
		TotalRevenue t = new TotalRevenue();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter tickr:");
		t.t1.tickr=in.next();
		System.out.println(t.getTotRev2016(t.t1.getValue(t.t1.getRow1(t.t1.parseHTML()))));
		System.out.println(t.getTotRev2015(t.t1.getValue(t.t1.getRow1(t.t1.parseHTML()))));
		System.out.println(t.getTotRev2014(t.t1.getValue(t.t1.getRow1(t.t1.parseHTML()))));
	}
}
