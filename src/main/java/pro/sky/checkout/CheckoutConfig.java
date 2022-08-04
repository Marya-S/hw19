package pro.sky.checkout;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CheckoutConfig {
    @Bean
    public Cart cart(){
        return new Cart();
    }
}
