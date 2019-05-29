package com.douzone.df.payload;

import java.util.ArrayList;

public class YearRankRequest {
	private ArrayList<Long> taskIds;
	private String year;
	
	public YearRankRequest() { }
	public YearRankRequest(ArrayList<Long> taskIds, String year) {
		this.taskIds = taskIds;
		this.year = year;
	}
	public ArrayList<Long> getTaskIds() {
		return taskIds;
	}
	public void setTaskIds(ArrayList<Long> taskIds) {
		this.taskIds = taskIds;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "YearRankRequest [taskIds=" + taskIds + ", year=" + year + "]";
	};
	

}
