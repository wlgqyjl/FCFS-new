package fcfs;

import java.util.*;

public class main {

	public static void main(String[] args) {
		int answer=0;
		int reset=0;
		List<task> list = new ArrayList<task>();
		String FilePath="D:\\input.txt";
		System.out.println("��������̵�������:\n"
						+  "1.������\n"
						+  "2.˫����\n");
		System.out.print("��ѡ��:");
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
