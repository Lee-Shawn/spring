package com.laughing.spring.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author : laughing
 * @create : 2021-04-11 18:18
 * @description :
 */
public class MyInterceptor2 implements HandlerInterceptor {
    /**
     * 此方法在处理器方法执行之前执行
     * 返回值为若为 true，则紧接着会执行处理器方法，且会将 afterCompletion()方法放入到一个专门的方法栈中等待执行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("21.执行preHandle()");
        return true;
    }

    /**
     * 此方法在处理器方法执行之后执行
     * 处理器方法若最终未被执行，则此方法不会执行
     * 由于此方法是在处理器方法执行完后执行，且此方法参数中包含 ModelAndView，所以此方法可以修改处理器方法的处理结果数据，且可以修改跳转方向
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("22.执行postHandle()");
    }

    /**
     * 当 preHandle()方法返回 true 时，会将此方法放到专门的方法栈中，等到对请求进行响应的所有工作完成之后才执行此方法
     * 此方法是在中央调度器渲染（数据填充）了响应页面之后执行的，此时对 ModelAndView 再操作也对响应无济于事
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("23.执行afterCompletion()");
        HttpSession session = request.getSession();
        Object attr = session.getAttribute("attr");
        System.out.println("attr删除之前---" + attr);
        session.removeAttribute("attr");
        System.out.println("attr删除之后---" + session.getAttribute("attr"));
    }
}
