package com.auto.server.rpc.user;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class SelfDiagnosisFallbackFactory implements FallbackFactory<SelfDiagnosisFeign>  {


	@Override
	public SelfDiagnosisFeign create(Throwable cause) {
		return null;
	}
}
