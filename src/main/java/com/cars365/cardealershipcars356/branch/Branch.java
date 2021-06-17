package com.cars365.cardealershipcars356.branch;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Branch {
	
	@Id
	private long branchPhno;
	private String branchLocation;
	private String branchPassword;
	
	public Branch() {
	}

	public Branch(long branchPhno, String branchLocation, String branchPassword) {
		this.branchPhno = branchPhno;
		this.branchLocation = branchLocation;
		this.branchPassword = branchPassword;
	}

	public long getBranchPhno() {
		return branchPhno;
	}

	public void setBranchPhno(long branchPhno) {
		this.branchPhno = branchPhno;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}

	public String getBranchPassword() {
		return branchPassword;
	}

	public void setBranchPassword(String branchPassword) {
		this.branchPassword = branchPassword;
	}
}
