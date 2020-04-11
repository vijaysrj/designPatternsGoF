package structural.proxy.pattern;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileLoaderProxy implements FileLoader {

	Map<String, File> fileCache = new HashMap<String, File>();

	@Override
	public File loadFile(String fileName) {
		

		if (fileCache.containsKey(fileName)) {

			File fileFromCache = fileCache.get(fileName);
			System.out.println("Loading file from cache");

			return fileFromCache;
		} else {

			FileLoaderReal fileLoader = new FileLoaderReal();
			File newFile = fileLoader.loadFile(fileName);

			fileCache.put(fileName, newFile);

			return newFile;

		}
	}

}
