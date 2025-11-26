package all_methods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Methods1 {
	public String readDataFromProperty(String key) throws IOException {
		FileInputStream f = new FileInputStream("D:\\eclipse\\Automation\\testdata\\commondataDDT.property");
		Properties p = new Properties();
		p.load(f);
		return p.getProperty(key);
	}
}
