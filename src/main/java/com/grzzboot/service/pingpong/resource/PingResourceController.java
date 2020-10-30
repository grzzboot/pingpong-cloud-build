package com.grzzboot.service.pingpong.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grzzboot.service.pingpong.resource.model.PingResource;
import com.grzzboot.service.pingpong.resource.service.PingPongService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(produces = { "application/json" })
@Slf4j
public class PingResourceController {

	private final PingPongService pingPongService;

	@Autowired
	public PingResourceController(PingPongService pingPongService) {
		this.pingPongService = pingPongService;
	}

	@GetMapping(path = "/ping")
	public PingResource ping(@RequestParam(required = false) String name) {
		long startTime = System.currentTimeMillis();
		PingResource pingResource = new PingResource(pingPongService.ping(name).getMessage());
		long duration = System.currentTimeMillis() - startTime;
		log.debug("Ping complete: {}, duration: {} ms.", pingResource, duration);
		return pingResource;
	}

}
