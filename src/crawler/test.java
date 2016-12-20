package crawler;
import org.jsoup.nodes.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.jsoup.*;

public class test {
	Document doc;
	String tickr;
	public Document parseHTML(){
		try{
			doc = Jsoup.connect("https://in.finance.yahoo.com/q/is?s="+tickr+"&annual").get();
		}catch(IOException e){
			System.out.println("Error in parseHTML method");
		}
		return doc;
	}
	public String getRow1(Document doc){
		Element ele = doc.select("table.yfnc_tabledata1").first();
		String str = ele.text();
		return str;
	}
	public String[] getValue(String str){
		StringTokenizer tkz = new StringTokenizer(getRow1(parseHTML()));
		String[] arr = new String[tkz.countTokens()];
		int i=0;
		while(tkz.hasMoreTokens()){
			arr[i]=tkz.nextToken().replaceAll(",", "").replaceAll("\u00A0", "");
			i++;
		}
		return arr;
	}
	/*
	public static void main(String[] args){
		test t = new test();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the tickr: ");
		t.tickr=in.next();
		String[] s =t.getValue(t.getRow1(t.parseHTML()));
		for(String str:s){
			System.out.println(str);
		}
	}*/
}
