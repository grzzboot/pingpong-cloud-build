package com.grzzboot.service.pingpong.resource.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.grzzboot.service.pingpong.resource.service.domain.PingEntity;

@Service
public class PingPongService {

	private static final String MESSAGE_BASE = "The best talk are held at";
	
	public PingEntity ping(String name) {
		StringBuilder sb = new StringBuilder(MESSAGE_BASE);
		if (!StringUtils.isEmpty(name)) {
			sb.append(" " + name);
		}
		return new PingEntity(sb.toString());
	}

}
