package com.example.restservice;

public class MyName {

	private final long id;
	private final String content;

	public MyName(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}