package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = context.getBean("myController", MyController.class);
        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("------------ Property");
        PropertyInjectedController propertyInjectedControllerBean = context.getBean("propertyInjectedController", PropertyInjectedController.class);
        System.out.println(propertyInjectedControllerBean.getGreeting());

        System.out.println("------------ Setter");
        SetterInjectedController setterInjectedControllerBean = context.getBean("setterInjectedController", SetterInjectedController.class);
        System.out.println(setterInjectedControllerBean.getGreeting());

        System.out.println("------------ Constructor");
        ConstructorInjectedController constructorInjectedControllerBean = context.getBean("constructorInjectedController", ConstructorInjectedController.class);
        System.out.println(constructorInjectedControllerBean.getGreeting());
    }

}
