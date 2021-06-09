package com.league.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ResponseDto {

	protected String errorMsg;

	

	public ResponseDto(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public ResponseDto() {
		super();
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}
