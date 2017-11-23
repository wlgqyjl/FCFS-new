package fcfs;

public class task {
	private int taskID;
	private float arrivalTime;
	private float serviceTime;
	private int startingTime;
	private float finishingTime;
	private float turnAroundTime;
	private float weightTurnAroundTime;
	public int getTaskID() {
		return taskID;
	}
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}
	public float getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(float arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public float getServiceTime() {
		return serviceTime;
	}
	public void setServiceTime(float serviceTime) {
		this.serviceTime = serviceTime;
	}
	public int getStartingTime() {
		return startingTime;
	}
	public void setStartingTime(int startingTime) {
		this.startingTime = startingTime;
	}
	public float getFinishingTime() {
		return finishingTime;
	}
	public void setFinishingTime(float finishingTime) {
		this.finishingTime = finishingTime;
	}
	public float getTurnAroundTime() {
		return turnAroundTime;
	}
	public void setTurnAroundTime(float turnAroundTime) {
		this.turnAroundTime = turnAroundTime;
	}
	public float getWeightTurnAroundTime() {
		return weightTurnAroundTime;
	}
	public void setWeightTurnAroundTime(float weightTurnAroundTime) {
		this.weightTurnAroundTime = weightTurnAroundTime;
	}
}
