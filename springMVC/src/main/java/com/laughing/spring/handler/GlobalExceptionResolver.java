package com.laughing.spring.handler;

import com.laughing.spring.exception.AgeException;
import com.laughing.spring.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : laughing
 * @create : 2021-04-11 17:22
 * @description : 全局异常处理
 */
@ControllerAdvice // 控制器增强，处理器类发生异常，可以到当前类中找到@ExceptionHandler
public class GlobalExceptionResolver {
    /**
     * 定义处理异常方法
     * @param exception
     * @return
     */
    @ExceptionHandler(value = NameException.class)
    public ModelAndView nameException(Exception exception) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("tips", "@ControllerAdvice使用注解处理NameException");
        mv.addObject("ex", exception);
        mv.setViewName("nameError");
        return mv;
    }

    @ExceptionHandler(value = AgeException.class)
    public ModelAndView ageException(Exception exception) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("tips", "@ControllerAdvice使用注解处理AgeException");
        mv.addObject("ex", exception);
        mv.setViewName("ageError");
        return mv;
    }

    @ExceptionHandler
    public ModelAndView otherException(Exception exception) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("tips", "@ControllerAdvice使用注解处理OtherException");
        mv.addObject("ex", exception);
        mv.setViewName("defaultError");
        return mv;
    }
}
