
package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //наш контейнер
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        IndependentMessageRenderer renderer = context.getBean(IndependentMessageRenderer.class);

        renderer.print();
    }
}
