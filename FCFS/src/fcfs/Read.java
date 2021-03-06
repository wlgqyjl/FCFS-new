package fcfs;

import java.io.*;
import java.util.*;


public class Read {
	public List<task> read(String filePath){
		List<task> list = new ArrayList<task>();
		String line=" ";
		String [] array;
		int i=0;
		int taskID;
		int arrivalTime;
		int serviceTime;
		try{
			File file = new File(filePath);
			InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
			BufferedReader br = new BufferedReader(reader);
			String s=null;
			while((s=br.readLine())!=null){
				    Scanner scanner=new Scanner(s);
					taskID=Integer.parseInt(scanner.next());
					arrivalTime=Integer.parseInt(scanner.next());
					serviceTime=Integer.parseInt(scanner.next());
					task t = new task();
					t.setTaskID(taskID);
					t.setArrivalTime(arrivalTime);
					t.setServiceTime(serviceTime);
					list.add(i,t);
					i++;
				
			}
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
}
