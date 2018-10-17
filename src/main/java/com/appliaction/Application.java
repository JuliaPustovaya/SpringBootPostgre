package com.appliaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//		System.setProperty("tomcat.util.http.parser.HttpParser.requestTargetAllow", "{} ~ ^ ");
	//	@Configuration
	//	public static class PathMatchingConfigurationAdapter extends WebMvcConfigurerAdapter {
	//
	//		@Override
	//		public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
	//			configurer.favorPathExtension(false);
	//		}
	//	}
}

