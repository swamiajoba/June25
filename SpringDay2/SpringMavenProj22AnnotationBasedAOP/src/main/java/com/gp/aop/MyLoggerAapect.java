package com.gp.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import com.gp.service.CalculatorServiceImpl;

@Component
@Aspect
public class MyLoggerAapect {
    private static final Logger logger = Logger.getLogger(MyLoggerAapect.class);

    // PointCuts
    @Pointcut("execution(* com.gp.service.*.*(..))")   // method signeture pattern
    public void selectAll() {}  // name of the pointcut

    @Pointcut("execution(* com.gp.service.*.m*(..))")
    public void selectAllm() {}

    @Pointcut("execution(* com.gp.service.ValidatorService.validate(..)) ||execution(* com.gp.service.CalculatorService.cal*(..))" )
    public void selectAllvs() {}

    @Pointcut("execution(* com.gp.service.CalculatorService.cal*(..))")
    public void selectAllcs() {}


//    @Before("selectAll()")
//    public void myadvice_before(JoinPoint jp)//it is advice (before advice)
//    {
//        logger.info("----------------------------");
//        logger.info("=>before additional concern");
//        logger.info("Method Signature: "  + jp.getSignature());
//        logger.info("Method Arguments: "  );
//        Object arg[]=jp.getArgs();
//        for(Object o:arg)
//        {
//            logger.info(o);
//        }
//        logger.info("=>end of before advice...");
//    }

//    @After("selectAllm()")
//    public void myadvice_after(JoinPoint jp)//it is advice (
//    {
//        logger.info("=>after additional concern");
//        logger.info("Method Signature: "  + jp.getSignature());
//        logger.info("=>end of after  advice...");
//        logger.info("----------------------------");
//    }


//    @AfterReturning(pointcut = "selectAllvs()",returning = "result")
//    public void myadvice_afterReturning(JoinPoint jp,Object result)//it is advice (after returning advice)
//    {
//        logger.info("=>after returning additional concern");
//        logger.info("Method Signature: "  + jp.getSignature());
//        logger.info("Result in advice: "+result);
//        logger.info("=>end of after returning advice...");
//    }

    @AfterThrowing(pointcut = "selectAllcs()",throwing = "error")
    public void myadvice_afterthrowing(JoinPoint jp,Throwable error)//it is advice
    {
        logger.info("after throwing concern");
        logger.error("Method Signature: "  + jp.getSignature());
        logger.error("Exception is: "+error);
        logger.info("=>end of after throwing advice...");
    }

    @Around("selectAllvs()")
    public Object myadvice1_around(ProceedingJoinPoint pjp) throws Throwable
    {
        logger.info("=> Aournd concern");
        logger.info("Around Concern Before calling actual method "+pjp.getSignature());
        Object obj=pjp.proceed();  // execute the actual method
        logger.info("Around Concern After calling actual method "+pjp.getSignature());
        logger.info("=>end of around advice...");
        return obj;
    }
}
