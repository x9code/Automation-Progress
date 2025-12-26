package DataDrivenTesting;

import java.io.IOException;

import all_methods.ReadPropertyFiles;

public class Utilization {
	public static void main(String[] args) throws IOException {
		ReadPropertyFiles m = new ReadPropertyFiles();
		String url = m.readDataFromProperty("url");
		String un = m.readDataFromProperty("username");
		String pwd = m.readDataFromProperty("password");
		String br = m.readDataFromProperty("browser");
		System.out.println("url:"+url);
		System.out.println("username :"+un);
		System.out.println("password :"+pwd);
		System.out.println("browser :"+br);
	}
}
