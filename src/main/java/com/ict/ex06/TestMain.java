package com.ict.ex06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		// DI는 Spring Container 에서 객체(Bean) 생성하고 관리한다.
		// Spring Container 에게 필요한 정보를 제공해야 한다. => 설정정보(Configuration Metadata)
		// 설정정보(Configuration Metadata) => 기본적으로 XML 파일 형태이다. 추가적으로 Annotation을 이용한다.
		// 추가적으로 Annotation을 이용한다. (Spring boot 에서는 무조건 Annotation 사용) 
		
		// Spring Container => BeanFactory => ApplicationContext
		//								=> WebApplicationContext (web)
		
		// ApplicationContext context = 
		//		new GenericXmlApplicationContext("설정정보위치");

		ApplicationContext context = 
				new GenericXmlApplicationContext("com/ict/ex06/config.xml");
		
	
		Service service = (Service) context.getBean("service");
		service.biz();
		
		
	}
}
