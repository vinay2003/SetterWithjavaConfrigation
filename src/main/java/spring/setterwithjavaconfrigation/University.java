package spring.setterwithjavaconfrigation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.setterwithjavaconfrigation.resources.ConfrigationSetter;

public class University {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfrigationSetter.class);

        Student student = context.getBean(Student.class);
        student.displayInfo();
    }
}

