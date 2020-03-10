package com.jiayaxing.autocofig.autoConfigure;

import com.jiayaxing.autocofig.bean.CustomAccessDeineHandler;
import com.jiayaxing.autocofig.bean.CustomAuthenticationEntryPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomAuthenticationAutoConfigure {


    @Bean(name = "customAccessDeineHandler")
    public CustomAccessDeineHandler customAccessDeineHandler(){
        CustomAccessDeineHandler customAccessDeineHandler = new CustomAccessDeineHandler();
        return customAccessDeineHandler;
    }

    @Bean(name = "customAuthenticationEntryPoint")
    public CustomAuthenticationEntryPoint customAuthenticationEntryPoint(){
        CustomAuthenticationEntryPoint customAuthenticationEntryPoint = new CustomAuthenticationEntryPoint();
        return customAuthenticationEntryPoint;
    }

}
