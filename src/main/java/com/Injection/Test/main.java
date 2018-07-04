package com.Injection.Test;

import com.services.UserServiceI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContextAnnotation =
                new ClassPathXmlApplicationContext("spring-app-annotation.xml");
        ClassPathXmlApplicationContext applicationContextBean =
                new ClassPathXmlApplicationContext("spring-app-bean.xml");

        UserServiceI userService1 = applicationContextAnnotation.getBean( "userService1",
                com.Injection.UsingAnnotationToInject.UserServiceImpl1.FirstUserServiceImpl.class);
        UserServiceI userService2 = applicationContextAnnotation.getBean( "userService2",
                com.Injection.UsingAnnotationToInject.UserServiceImpl1.SecondUserServiceImpl.class);

        System.out.println("Using @Autowired...");
        System.out.println(userService1.getUserList());
        System.out.println(userService2.getUserList());
        System.out.println();

        UserServiceI userService3 = applicationContextAnnotation.getBean("userService3",
                com.Injection.UsingAnnotationToInject.UserServiceImpl2.FirstUserServiceImpl.class);
        UserServiceI userService4 = applicationContextAnnotation.getBean("userService4",
                com.Injection.UsingAnnotationToInject.UserServiceImpl2.SecondUserServiceImpl.class);

        System.out.println("Using @Resource...");

        System.out.println(userService3.getUserList());
        System.out.println(userService4.getUserList());
        System.out.println();

        UserServiceI userService5 = applicationContextAnnotation.getBean("userService5",
                com.Injection.UsingAnnotationToInject.UserServiceImpl3.FirstUserServiceImpl.class);
        UserServiceI userService6 = applicationContextAnnotation.getBean("userService6",
                com.Injection.UsingAnnotationToInject.UserServiceImpl3.SecondUserServiceImpl.class);

        System.out.println("Using @Resource & @Qualifier...");

        System.out.println(userService5.getUserList());
        System.out.println(userService6.getUserList());
        System.out.println();

        UserServiceI userService = applicationContextBean.getBean("userService",
                com.Injection.UsingBeanToInject.UserServiceImpl.class);
        System.out.println("----------------------");
        System.out.println("Using xml...");
        System.out.println(userService.getUserList());




    }
}
