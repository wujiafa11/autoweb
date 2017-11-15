package com.auto.commons.core.mapper;

import java.util.Map;

import com.auto.commons.core.pojo.SysSequence;
import org.apache.ibatis.annotations.Param;

public interface SysSequenceMapper {

	SysSequence getSequence(@Param("sequenceKey") String sequenceKey);

	int updateCurrentValue(Map<String, Object> map);


}
