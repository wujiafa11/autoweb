package com.auto.commons.web;

import com.auto.commons.exception.CommonException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice(basePackages={"com.auto.user.controller"})
public class ControllerEnhancerment {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@ExceptionHandler({CommonException.class})
	@ResponseStatus(HttpStatus.OK)
	public ResponseMessage processException(CommonException ex) {
		logger.error(ex.getMessage());
		return WebUtils.buildResponseMessage(com.auto.commons.web.ResponseStatus.EXCEPTION, ex.getMessage());
	}
	

}
