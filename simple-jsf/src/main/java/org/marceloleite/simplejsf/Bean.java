package org.marceloleite.simplejsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Bean {
	
	private String message = "This is a test";
	
	public String getMessage() {
		return message;
	}
}
