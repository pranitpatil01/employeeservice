package com.secure.be;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * http://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select() //
				.apis(RequestHandlerSelectors.any()) //
				.paths(PathSelectors.any()) //
				.build() //
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		final String version = EmployeeBootApplication.class.getPackage().getImplementationVersion();
		ApiInfo apiInfo = new ApiInfo("EmployeeBoot Backend REST API", 
				"Operations for BackEnd .", // description
				version == null ? "version not available" : version, // version
				"Terms of service", // TOS
				new Contact("EmployeeBoot Dev Team", "http://EmployeeBoot.com", "devteam@EmployeeBoot.com"), // Contact
				"Apache 2.0 License", // License
				"http://www.EmployeeBoot.org/licenses/LICENSE-2.0"); // License URL
		return apiInfo;
	}
}
