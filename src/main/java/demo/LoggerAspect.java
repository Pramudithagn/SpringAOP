package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint j){
        System.out.println("before logger called");
        System.out.println(j.getArgs()[0].toString());
    }

    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        System.out.println("after logger called");
    }

    @Pointcut("execution(* demo.ShoppingCart.count(..))")
    public void countPointcut(){ }

    @AfterReturning(pointcut = "countPointcut()", returning = "count")
    public void afterReturnLogger(int count){
        System.out.println("after log count: "+ count);
    }
}
