//package com.microservice.configuration;
//
//import org.springframework.context.annotation.Bean;
//
//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
//import io.swagger.v3.oas.annotations.info.Info;
//import io.swagger.v3.oas.models.Components;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.License;
//
//@OpenAPIDefinition(info = @Info(title = "book-service API", version = "V1", description = "Documentação para a API book service"))
//public class OpenApi {
//
//	@Bean
//	public OpenAPI customOpenAPI() {
//		return new OpenAPI().components(new Components())
//				.info(new io.swagger.v3.oas.models.info.Info().title("book-service API").version("V1")
//						.license(new License().name("Apache 2.0").url("http://springdoc.org")));
//	}
//
//}
