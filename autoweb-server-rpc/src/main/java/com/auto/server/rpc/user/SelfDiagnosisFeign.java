package com.auto.server.rpc.user;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "auto-self-diagnosis", fallbackFactory = SelfDiagnosisFallbackFactory.class)
public interface SelfDiagnosisFeign {



}
