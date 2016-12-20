package crawler;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.*;

public class GetData{
		Document doc;
		String tickr;
		Scanner in = new Scanner(System.in);
		public Document parseHTML(){
			try{
				doc = Jsoup.connect("https://in.finance.yahoo.com/q/is?s="+tickr+"&annual").get();
			}catch(IOException e){
				System.out.println("Error in parseHTML method");
			}
			return doc;
		}
}