package com.javah2example.demo.data;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TITLE")
public class Title {
	
	@Id
	@Column(name="WORKER_REF_ID")
	int workerRefId;
	
	@Column(name="WORKER_TITLE")
	String workerTitle;
	
	@Column(name="AFFECTED_FROM")
	String affectedFrom;

	/*
	 * @OneToMany(targetEntity = Worker.class) private List<Worker> workers;
	 */
	  @OneToMany(targetEntity = Worker.class)
	  @JoinColumn(name = "workerRefId_ref",referencedColumnName = "WORKER_REF_ID")
	  private List<Worker> Workers;
	 
	public int getWorkerRefId() {
		return workerRefId;
	}

	public void setWorkerRefId(int workerRefId) {
		this.workerRefId = workerRefId;
	}

	public String getWorkerTitle() {
		return workerTitle;
	}

	public void setWorkerTitle(String workerTitle) {
		this.workerTitle = workerTitle;
	}

	public String getAffectedFrom() {
		return affectedFrom;
	}

	public void setAffectedFrom(String affectedFrom) {
		this.affectedFrom = affectedFrom;
	}

	@Override
	public String toString() {
		return "Title [workerRefId=" + workerRefId + ", workerTitle=" + workerTitle + ", affectedFrom=" + affectedFrom
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Workers == null) ? 0 : Workers.hashCode());
		result = prime * result + ((affectedFrom == null) ? 0 : affectedFrom.hashCode());
		result = prime * result + workerRefId;
		result = prime * result + ((workerTitle == null) ? 0 : workerTitle.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Title other = (Title) obj;
		if (Workers == null) {
			if (other.Workers != null)
				return false;
		} else if (!Workers.equals(other.Workers))
			return false;
		if (affectedFrom == null) {
			if (other.affectedFrom != null)
				return false;
		} else if (!affectedFrom.equals(other.affectedFrom))
			return false;
		if (workerRefId != other.workerRefId)
			return false;
		if (workerTitle == null) {
			if (other.workerTitle != null)
				return false;
		} else if (!workerTitle.equals(other.workerTitle))
			return false;
		return true;
	}
	
	
}
