package com.voya.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	private Integer capacity;
	private String type;
	public Integer getCapacity() {
		return capacity;
	}
	@Value("125")
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	@Value("petrol")
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + "]";
	}
	
	
}
