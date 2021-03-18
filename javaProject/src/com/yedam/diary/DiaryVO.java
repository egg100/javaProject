package com.yedam.diary;

import java.io.Serializable;

public class DiaryVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String wdate;
	private String cotents;
	
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getCotents() {
		return cotents;
	}
	public void setCotents(String cotents) {
		this.cotents = cotents;
	}
	@Override
	public String toString() {
		return "DiaryVO [wdate=" + wdate + ", cotents=" + cotents + "]";
	}
	
	
}
