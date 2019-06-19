package com.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.dao.SequenceMapper;
import com.learn.entity.SequenceEntity;

@Service
public class SequenceService {
	@Autowired
	private SequenceMapper sequenceMapper;
	
	public SequenceEntity find(String name) {
		SequenceEntity entity = sequenceMapper.selectByName(name);
		return entity;
	}
}
