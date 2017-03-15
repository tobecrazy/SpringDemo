package com.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Login {
	private final String name;

	@JsonCreator
	public Login(@JsonProperty("name") String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("login{");
		sb.append("name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}

}
