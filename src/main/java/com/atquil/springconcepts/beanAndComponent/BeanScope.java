package com.atquil.springconcepts.beanAndComponent;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
@RequiredArgsConstructor
public class BeanScope {
   private final ObjectProvider<MySingletonBean> mySingletonBean;
   private final ObjectProvider<MyPrototypeBean> myPrototypeBean;



    @PostConstruct
    public void doSomething() {
        System.out.println("----------SCOPE-----------------------");
        MySingletonBean mySingletonBean1 = mySingletonBean.getObject();
        System.out.println(mySingletonBean1.hashCode());
        MySingletonBean mySingletonBean2 = mySingletonBean.getObject();
        System.out.println(mySingletonBean2.hashCode());


        MyPrototypeBean myPrototypeBean1 = myPrototypeBean.getObject();
        System.out.println(myPrototypeBean1.hashCode());
        MyPrototypeBean myPrototypeBean2 = myPrototypeBean.getObject();
        System.out.println(myPrototypeBean2.hashCode());

        System.out.println("----------End SCOPE-----------------------");
    }
}

@Component
@Scope("singleton")
class MySingletonBean{

    public MySingletonBean(){
        System.out.println("Singleton bean created");
    }
}
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class MyPrototypeBean {


    public MyPrototypeBean() {
        System.out.println("Prototype bean created");

    }
}


