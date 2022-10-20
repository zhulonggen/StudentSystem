package com.santi.entriy;

import java.io.Serializable;

public class TeacherCourse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5719510935896027436L;
	private String Stno;
	private String Cno;
	private int Clno;

	public String getStno() {
		return Stno;
	}

	public void setStno(String stno) {
		Stno = stno;
	}

	public String getCno() {
		return Cno;
	}

	public void setCno(String cno) {
		Cno = cno;
	}

	public int getClno() {
		return Clno;
	}

	public void setClno(int clno) {
		Clno = clno;
	}

	@Override
	public String toString() {
		return "TeacherCourse [Stno=" + Stno + ", Cno=" + Cno + ", Clno=" + Clno + "]";
	}

}
