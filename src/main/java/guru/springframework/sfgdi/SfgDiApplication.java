package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.I18NController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        I18NController i18NController = context.getBean("i18NController", I18NController.class);
        System.out.println(i18NController.sayHello());

        System.out.println("------------ Primary bean");
        MyController myController = context.getBean("myController", MyController.class);
        System.out.println(myController.sayHello());

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
