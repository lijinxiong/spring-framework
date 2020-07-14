package com.demo.property.editor;

public class Job {

	private boolean completed;

	private Content content;

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Job{" +
				"completed=" + completed +
				", content=" + content +
				'}';
	}
}
