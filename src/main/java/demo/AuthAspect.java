package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthAspect {

    @Pointcut("within(demo.ShoppingCart)")
    public void authPointcut1(){ }

    @Pointcut("within(demo.*)")
    public void authPointcut2(){ }


    @Before("authPointcut1() && authPointcut2()")
    public void authentication(){
        System.out.println("authentication");
    }

//    @After("authPointcut2()")
//    public void authorization(){
//        System.out.println("authorization");
//    }
}
