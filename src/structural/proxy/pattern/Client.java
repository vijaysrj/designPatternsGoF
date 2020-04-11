package structural.proxy.pattern;

import java.io.File;

public class Client {
	
	
	public static void main(String a[]) {
		
		FileLoaderProxy proxy = new FileLoaderProxy();
		
		File file = proxy.loadFile("designpatterns.pdf");
		
		System.out.println(file);
		
		File fileNew = proxy.loadFile("designpatterns.pdf");
		System.out.println(fileNew);
		
	}

}
