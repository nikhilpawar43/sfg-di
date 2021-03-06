package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.I18NController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PetController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SetterInjectedController;

@ComponentScan(basePackages = {"guru.springframework.sfgdi", "guru.springframework.pets"})
@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        PetController petController = context.getBean("petController", PetController.class);
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest());

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
