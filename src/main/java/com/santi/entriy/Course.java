package com.santi.entriy;

import java.io.Serializable;

public class Course implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4117132035046620604L;
	private String cno;
	private String cname;
	private int cgrade;
	private int ctime;
	private String type;

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCgrade() {
		return cgrade;
	}

	public void setCgrade(int cgrade) {
		this.cgrade = cgrade;
	}

	public int getCtime() {
		return ctime;
	}

	public void setCtime(int ctime) {
		this.ctime = ctime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Course [cno=" + cno + ", cname=" + cname + ", cgrade=" + cgrade + ", ctime=" + ctime + ", type=" + type
				+ "]";
	}

}
