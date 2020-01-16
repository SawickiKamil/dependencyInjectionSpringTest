package com.kamil.depependency;

import com.kamil.depependency.controllers.ConstructorInjectedController;
import com.kamil.depependency.controllers.GetterInjectedController;
import com.kamil.depependency.controllers.MyController;
import com.kamil.depependency.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
