package com.javah2example.demo.data;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bonus {
	
	@Id
	@Column(name = "WORKER_REF_ID")
	int workerRefId;
	
	@Column(name="BONUS_AMOUNT")
	int bonusAmount;
	
	@Column(name="BONUS_DATE")
	String bonusDate;

	public int getWorkerRefId() {
		return workerRefId;
	}

	public void setWorkerRefId(int workerRefId) {
		this.workerRefId = workerRefId;
	}

	public int getBonusAmount() {
		return bonusAmount;
	}

	public void setBonusAmount(int bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

	public String getBonusDate() {
		return bonusDate;
	}

	public void setBonusDate(String bonusDate) {
		this.bonusDate = bonusDate;
	}

	@Override
	public String toString() {
		return "Bonus [workerRefId=" + workerRefId + ", bonusAmount=" + bonusAmount + ", bonusDate=" + bonusDate + "]";
	}
	
}
