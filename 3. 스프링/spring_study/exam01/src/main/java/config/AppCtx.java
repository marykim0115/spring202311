package config;

import models.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //설정 클래스라고 알려줌. 스프링에게 관리할 객체를 알려주는것
public class AppCtx {
    @Bean
    public Greeter greeter() {

        return new Greeter();
    }
}
