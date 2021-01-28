package com.example.cwgl.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
* description: TODO
* @author zhangsihai
* @date 2020/3/24 15:23
*/
@Configuration
public class SessionConfiguration implements WebMvcConfigurer {
    //添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册session拦截器
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**");
        //注册logger拦截器
        registry.addInterceptor(new LoggerInterceptor()).addPathPatterns("/**");
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
    }
}
