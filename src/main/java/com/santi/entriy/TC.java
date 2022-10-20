package com.santi.entriy;

import java.io.Serializable;

public class TC implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 925379168800644250L;
	private String Stno;
	private String Stname;
	private String Cno;
	private String Cname;
	private String Clno;

	public String getStno() {
		return Stno;
	}

	public void setStno(String stno) {
		Stno = stno;
	}

	public String getStname() {
		return Stname;
	}

	public void setStname(String stname) {
		Stname = stname;
	}

	public String getCno() {
		return Cno;
	}

	public void setCno(String cno) {
		Cno = cno;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getClno() {
		return Clno;
	}

	public void setClno(String clno) {
		Clno = clno;
	}

	@Override
	public String toString() {
		return "TC [Stno=" + Stno + ", Stname=" + Stname + ", Cno=" + Cno + ", Cname=" + Cname + ", Clno=" + Clno + "]";
	}

}
