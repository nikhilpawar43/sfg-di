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
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.service.PrototypeBean;
import guru.springframework.sfgdi.service.SingletonBean;

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

        System.out.println("------------ Bean scopes ------------");
        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());
        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
        System.out.println(singletonBean2.getMyScope());

        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getMyScope());

        System.out.println("------------ Fake datasource ------------");
        FakeDataSource fakeDataSource = context.getBean("fakeDataSource", FakeDataSource.class);
        System.out.println(fakeDataSource);
    }

}
