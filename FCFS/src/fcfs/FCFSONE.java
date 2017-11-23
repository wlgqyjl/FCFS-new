package fcfs;

import java.util.*;

public class FCFSONE {
	public List<task> fcfs(List<task> list){
		float weightTurnAroundTime=0;  
		float turnAroundTime=0;        
		float finishingTime=0;		 
		int startingTime=0;			
		float serviceTime=0;			
		float arrivalTime=0;			
		int taskID=0;				 
		task t = new task();		
		int i=0;					 
		int j=0;					 
		float s=0;					
		System.out.println("时间\t到达任务\t开始任务\t完成任务");
		for(int time=0;j<list.size();time++){
			if (taskID==0){          
				t=new task();  
				t=list.get(j);       
				taskID=t.getTaskID();
				arrivalTime=t.getArrivalTime();
				serviceTime=t.getServiceTime();
				startingTime=time;
				s=serviceTime;
				if (i<list.size()){
					System.out.println(time+"\t"+list.get(i).getTaskID()+"\t"+taskID);  
				}
				else{
					System.out.println(time+"\t"+"\t"+taskID);
				}
			}
			else if (s==0){         
				if (i<list.size()){
					System.out.println(time+"\t"+list.get(i).getTaskID()+"\t\t"+taskID);
				}
				else{
					System.out.println(time+"\t"+"\t\t"+taskID);
				}
				finishingTime=time;			
				turnAroundTime=finishingTime-arrivalTime;
				weightTurnAroundTime=turnAroundTime/serviceTime;
				t.setStartingTime(startingTime);
				t.setFinishingTime(finishingTime);
				t.setTurnAroundTime(turnAroundTime);
				t.setWeightTurnAroundTime(weightTurnAroundTime);
				list.set(taskID-1,t);
				taskID=0;		
				j++;		
			}
			else{				
				if (i<list.size()){
					System.out.println(time+"\t"+list.get(i).getTaskID());
				}
				else{
					System.out.println(time);
				}
			}
			if (i<list.size()){			
				i++;
			}
			s--;		
		}
		return list;
	}
	public void printList(List<task> list){		
		task t=new task();
		System.out.println("任务编号\t到达时间\t服务时间\t开始时间\t完成时间\t周转时间\t带权周转时间");
		for(int i=0;i<list.size();i++){
			t=list.get(i);
			System.out.println(t.getTaskID()+"\t"+(int)t.getArrivalTime()+"\t"+(int)t.getServiceTime()+"\t"+
					(int)t.getStartingTime()+"\t"+(int)t.getFinishingTime()+"\t"+(int)t.getTurnAroundTime()+"\t"+t.getWeightTurnAroundTime());
		}
	}
}
