package com.ygzc.web.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author yanl.fu
 *
 */
@Configuration
@EnableSwagger2//重要！
@EnableWebMvc
@ComponentScan(basePackages = "com.ygzc.web.control")//扫描control所在的package请修改为你control所在package
public class SwaggerConfig {

	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("ygzc-basis项目接口文档")
                .description("RPC项目接口测试")
                .version("1.0.0").contact(new Contact("", "", "yanl.fu@outlook.com"))
                .termsOfServiceUrl("")
                .license("MIT License")
                .licenseUrl("https://mit-license.org/")
                .build();
    }
}
