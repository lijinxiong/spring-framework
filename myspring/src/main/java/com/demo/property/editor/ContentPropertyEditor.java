package com.demo.property.editor;

import java.beans.PropertyEditorSupport;

public class ContentPropertyEditor extends PropertyEditorSupport {

	@Override
	public String getAsText() {
		// just for test
		Content value = (Content) getValue();
		return value.getDetails() + ":" + value.getType() + ":" + value.getPriority();
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		// just for test
		Content content = new Content();
		String[] values = text.split(":");
		content.setDetails(values[0]);
		content.setType(values[1]);
		content.setPriority(Integer.valueOf(values[2]));
		setValue(content);
	}
}
