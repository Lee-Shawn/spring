package com.laughing.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author : laughing
 * @create : 2021-10-17 13:19
 * @description : spring security 配置
 */
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
        //web.ignoring().antMatchers("/css/**", "/js/**", "/image/**"); // 放行静态资源
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin() // 开启表单认证
                .loginPage("/login") // 指定登录页面
                .loginProcessingUrl("/login") // 表单提交的路径
                .usernameParameter("username").passwordParameter("password") // 自定义 input 的 name 值
                .successForwardUrl("/") // 登录成功后跳转的路径
                .and()
                .authorizeRequests().antMatchers("/login", "/register", "/css/**", "/js/**", "/image/**").permitAll() // 放行页面
                .anyRequest().authenticated();// 所有请求都要在认证之后访问

        // 关闭 csrf 防护
        http.csrf().disable();
        // 加载同源域名下 iframe 页面
        http.headers().frameOptions().sameOrigin();
    }
}
