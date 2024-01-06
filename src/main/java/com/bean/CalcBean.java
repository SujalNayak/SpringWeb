package com.bean;

import jakarta.validation.constraints.NotNull;

public class CalcBean {
	
	@NotNull
	private Integer no;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}
	
}
