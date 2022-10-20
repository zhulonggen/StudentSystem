package com.santi.entriy;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5895896187629222146L;
	private String susername;
	private String spassword;
	private String sno;
	private String sID;

	public String getSusername() {
		return susername;
	}

	public void setSusername(String susername) {
		this.susername = susername;
	}

	public String getSpassword() {
		return spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getsID() {
		return sID;
	}

	public void setsID(String sID) {
		this.sID = sID;
	}

	@Override
	public String toString() {
		return "User [susername=" + susername + ", spassword=" + spassword + ", sno=" + sno + ", sID=" + sID + "]";
	}

}
