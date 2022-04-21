package com.archi.hexa.config;

import com.archi.hexa.service.in.ICarServiceIn;
import com.archi.hexa.service.in.impl.CarServiceIn;
import com.archi.hexa.service.out.ICarServiceOut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfiguration {

    @Bean
    public ICarServiceIn carServiceOut(ICarServiceOut carServiceIn){
        return new CarServiceIn(carServiceIn);
    }
}
