package com.santi.entriy;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6718163411585372988L;
	private String Sno;
	private String Sname;
	private String Ssex;
	private int Sage;
	private String Sdept;
	private String Clno;
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSsex() {
		return Ssex;
	}
	public void setSsex(String ssex) {
		Ssex = ssex;
	}
	public int getSage() {
		return Sage;
	}
	public void setSage(int sage) {
		Sage = sage;
	}
	public String getSdept() {
		return Sdept;
	}
	public void setSdept(String sdept) {
		Sdept = sdept;
	}
	public String getClno() {
		return Clno;
	}
	public void setClno(String clno) {
		Clno = clno;
	}
	@Override
	public String toString() {
		return "s [Sno=" + Sno + ", Sname=" + Sname + ", Ssex=" + Ssex + ", Sage=" + Sage + ", Sdept=" + Sdept
				+ ", Clno=" + Clno + "]";
	}
	
	
}
