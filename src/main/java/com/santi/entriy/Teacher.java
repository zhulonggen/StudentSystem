package com.santi.entriy;

import java.io.Serializable;

public class Teacher implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6100716398557906035L;
	private String Stno;
	private String Stname;
	private String Stsex;
	private int Stage;
	private String Sto;

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

	public String getStsex() {
		return Stsex;
	}

	public void setStsex(String stsex) {
		Stsex = stsex;
	}

	public int getStage() {
		return Stage;
	}

	public void setStage(int stage) {
		Stage = stage;
	}

	public String getSto() {
		return Sto;
	}

	public void setSto(String sto) {
		Sto = sto;
	}

	@Override
	public String toString() {
		return "Teacher [Stno=" + Stno + ", Stname=" + Stname + ", Stsex=" + Stsex + ", Stage=" + Stage + ", Sto=" + Sto
				+ "]";
	}

}
