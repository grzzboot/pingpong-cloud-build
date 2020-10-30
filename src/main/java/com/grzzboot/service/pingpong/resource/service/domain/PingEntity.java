package com.grzzboot.service.pingpong.resource.service.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PingEntity {

	@JsonCreator
	public PingEntity(@JsonProperty(value = "message") String message) {
		this.message = message;
	}
	
	private final String message;
	
}
