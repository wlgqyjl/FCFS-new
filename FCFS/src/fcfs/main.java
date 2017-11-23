package fcfs;

import java.util.*;

public class main {

	public static void main(String[] args) {
		int answer=0;
		int reset=0;
		List<task> list = new ArrayList<task>();
		String FilePath="D:\\input.txt";
		System.out.println("请输入进程调度类型:\n"
						+  "1.单队列\n"
						+  "2.双队列\n");
		System.out.print("请选择:");
		Scanner scanner = new Scanner(System.in);
		answer=scanner.nextInt();
		Read rd = new Read();
		list=rd.read(FilePath);
		if (answer==1){
			FCFSONE f=new FCFSONE();
			f.fcfs(list);
			f.printList(list);
		}
		if (answer==2){
			FCFSTWO f=new FCFSTWO();
			f.fcfs(list);
			f.printList(list);
		}
		
	}
}
