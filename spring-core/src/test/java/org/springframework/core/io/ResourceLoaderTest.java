package org.springframework.core.io;

import org.junit.jupiter.api.Test;

public class ResourceLoaderTest {


	@Test
	public void getResourceTest(){

		ResourceLoader resourceLoader = new DefaultResourceLoader();

		Resource fileResource1 = resourceLoader.getResource(
				"D:/idea/spring-framework/spring-core/src/main/java/org/springframework/core/io/DefaultResourceLoader.java");
		System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));

		Resource fileResource2 = resourceLoader.getResource("/Users/igola/Documents1/desktop.ini");
		System.out.println("fileResource2 is ClassPathResource:" + (fileResource2 instanceof ClassPathResource));

		Resource urlResource1 = resourceLoader.getResource("file:/Users/igola/Documents1/desktop.ini");
		System.out.println("urlResource1 is UrlResource:" + (urlResource1 instanceof UrlResource));

		Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
		System.out.println("urlResource1 is urlResource:" + (urlResource2 instanceof  UrlResource));


	}

}
