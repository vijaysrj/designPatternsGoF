package structural.proxy.pattern;

import java.io.File;

public class FileLoaderReal implements FileLoader {

	@Override
	public File loadFile(String fileName) {
		
		System.out.println("Loading file from actual path for the file: ");
		
		return new File(fileName);
	}

}
