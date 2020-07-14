package com.demo.property.editor;

import org.springframework.beans.PropertyEditorRegistrySupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext classPathXmlApplicationContext =
				new ClassPathXmlApplicationContext("property.editor/coderLi.xml");

		classPathXmlApplicationContext.getBeanFactory().addPropertyEditorRegistrar(registry -> {
			if (registry instanceof PropertyEditorRegistrySupport) {
				((PropertyEditorRegistrySupport) registry).overrideDefaultEditor(Content.class, new ContentPropertyEditor());
				System.out.println("PropertyEditorRegistrySupport");
			} else {
				registry.registerCustomEditor(Content.class, new ContentPropertyEditor());
			}
		});


		Object job = classPathXmlApplicationContext.getBean("job");
		System.out.println(job);

	}
}
