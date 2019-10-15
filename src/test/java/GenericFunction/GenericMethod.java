package GenericFunction;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenericMethod {
	
	public static String GetLoctorFromTextFile(String FilePath, String key) {
		try {
			BufferedReader reader= new BufferedReader(new FileReader(FilePath));
			String str;
			
			Map<String,String> data= new HashMap<String,String>();
			while((str=reader.readLine())!=null) {
				List<String> res= new ArrayList<String>();
				for(int i=0;i<str.split("=").length;i++) {
					res.add(str.split("=")[i]);
				}
			data.put(str.split("=")[0],res.stream().skip(1).collect(Collectors.joining("=")));
			}	
		
			String value=data.get(key);
			return value;
			}
		catch(IOException e) {e.printStackTrace();return "";}	
	}
}
