package com.santi.entriy;

import java.io.Serializable;

public class StudentCourse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3590156995162360037L;
	private String Sno;
	private String Sname;
	private String Cno;
	private String Cname;

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

	@Override
	public String toString() {
		return "StudentCourse [Sno=" + Sno + ", Sname=" + Sname + ", Cno=" + Cno + ", Cname=" + Cname + "]";
	}

}
