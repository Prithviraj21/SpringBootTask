package com.jspider.productproject.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jspider.productproject.dto.User;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4658966233802494059L;
	private boolean error;
	private String msg;
	private User user;
	
	
	public UserResponse(boolean error, String msg, User user) {
		super();
		this.error = error;
		this.msg = msg;
		this.user = user;
	}


	public UserResponse(boolean error, String msg) {
		super();
		this.error = error;
		this.msg = msg;
	}
	
	
	

}
