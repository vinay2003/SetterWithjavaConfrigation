package spring.setterwithjavaconfrigation.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.setterwithjavaconfrigation.Address;
import spring.setterwithjavaconfrigation.Student;

@Configuration
public class ConfrigationSetter {

    @Bean
    public Address Addressinfo() {
        Address address = new Address();
        address.setStreet("Hindalco colony");
        address.setCity("Renukoot");
        address.setState("Uttar pardesh");
        address.setZip("231217");

        return address;
    }

    @Bean
    public Student Studentinfo() {
        Student student = new Student();
        student.setFirstName("Abhay");
        student.setLastName("Sharma");
        student.setAge(14);
        student.setGender("Male");
        student.setAddress(Addressinfo());
        return student;
    }
}
