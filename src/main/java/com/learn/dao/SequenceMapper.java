package com.learn.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.learn.entity.SequenceEntity;

public interface SequenceMapper {
	SequenceEntity selectByName(String name);
}
