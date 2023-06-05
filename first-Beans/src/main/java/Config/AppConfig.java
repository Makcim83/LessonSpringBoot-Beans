package Config;

import model.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    @Qualifier(value = "car")
    public Car getCarBean() {
        return new Car("BMW");
    }

    @Bean
    @Qualifier(value = "bus")
    public Bus getBusBean() {
        return new Bus("PAZ");
    }

    @Bean
    @Qualifier(value = "truck")
    public Truck getTruckBean() {
        return new Truck("ZIL");
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Вася", getCarBean());
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Петя", getBusBean());
    }

    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Егор", getTruckBean());
    }
}