package pro.sky.checkout;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CheckoutConfig {
    @Bean
    public Cart cart(){
        return new Cart();
    }
}
