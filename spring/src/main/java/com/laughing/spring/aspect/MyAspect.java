package com.laughing.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
        System.out.println("切面功能前置通知beforeAdvice：" + new Date());
    }

    @Before(value = "execution(* *..*ServiceImpl.getInfo(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("连接点方法定义：" + joinPoint.getSignature());
        System.out.println("连接点方法参数个数：" + joinPoint.getArgs().length);
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
        System.out.println("切面功能前置通知before：" + new Date());
    }

    /**
     * 方法是实现切面功能
     * 切面方法要求：
     *     1. 方法是 public
     *     2. 方法没有返回值
     *     3. 方法有参数，推荐是Object类型
     * @param res
     *
     * @AfterReturning 后置通知
     *     1. value 切入点表达式
     *     2. returning 自定义变量，表示目标方法的返回值，自定义变量名必须和通知方法的形参名一样
     *     3. 在目标方法之后执行
     *     4. 能够获取到目标方法的返回值，可以根据这个返回值做不同的处理功能
     *     5. 可以修改这个返回值
     */
    @AfterReturning(value = "execution(* *..*ServiceImpl.*(..))", returning = "res")
    public void afterReturning(Object res) {
        if (res !=  null) {
            String s = (String) res;
            res = s.toUpperCase();
        }
        System.out.println("后置通知：" + res);
    }
}
