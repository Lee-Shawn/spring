package com.laughing.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @author : laughing
 * @create : 2021-07-04 21:11
 * @description : 切面
 *
 * @Aspect ：当前类是切面类
 */
@Aspect
public class MyAspect {
    /**
     * 方法是实现切面功能
     * 切面方法要求：
     *     1. 方法是 public
     *     2. 方法没有返回值
     * execution(public void com.laughing.spring.service.impl.AspectJServiceImpl.getInfo(String, Integer))
     * execution(* *..service.impl.AspectJServiceImpl.getInfo(String, Integer))
     * execution(* *..getInfo(..))
     */
    @Before(value = "execution(* *..service.impl.AspectJServiceImpl.getInfo(String, Integer))")
    public void beforeAdvice() {
        System.out.println("切面功能前置通知：" + new Date());
    }
}
