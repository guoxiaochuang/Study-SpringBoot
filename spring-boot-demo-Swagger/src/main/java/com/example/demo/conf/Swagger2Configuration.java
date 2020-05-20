package com.example.demo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置类
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    @Bean
    public Docket createDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.apiInfo())
                .select()
                // swagger 文件扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 定义文档信息--
     * title：接口文档的标题
     * description：接口文档的详细描述
     * termsOfServiceUrl：一般用于存放公司的地址
     * version：API 文档的版本号
     * contact：维护人、维护人 URL 以及 email
     * license：许可证
     * licenseUrl：许可证 URL
     *
     */
    public ApiInfo apiInfo() {
        Contact contact = new Contact("guoxiaoxiao", "http://localhost:8080", "guoxiaochuang@126.com");
        return new ApiInfoBuilder().title("测试接口列表")
                .description("Swagger2 接口文档")
                .termsOfServiceUrl("公司地址")
                .version("V1.0.0")
                .contact(contact)
                .build();
    }

}
