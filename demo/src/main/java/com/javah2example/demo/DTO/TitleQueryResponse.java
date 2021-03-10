package com.javah2example.demo.DTO;


public class TitleQueryResponse {

	int workerRefId;
	String firstName;
	

	public int getWorkerRefId() {
		return workerRefId;
	}

	public void setWorkerRefId(int workerRefId) {
		this.workerRefId = workerRefId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public TitleQueryResponse(int workerRefId, String firstName) {
		super();
		this.workerRefId = workerRefId;
		this.firstName = firstName;
	}

	public TitleQueryResponse() {
		super();
	}

	@Override
	public String toString() {
		return "TitleQueryResponse [workerRefId=" + workerRefId + ", firstName=" + firstName + "]";
	}
	
}
