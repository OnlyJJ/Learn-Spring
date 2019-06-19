package com.learn.test.seviceTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.learn.entity.SequenceEntity;
import com.learn.service.SequenceService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/spring-context.xml"})
public class DbTest {
	@Autowired
	private SequenceService sequenceService;
	
	@Test
	public void test() {
		SequenceEntity seq = sequenceService.find("service_type");
		if(seq != null) {
			System.err.println(seq.getCurrentValue());
		} else {
			System.err.println("null");
		}
	}
	
}
