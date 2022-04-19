package com.archi.hexa.config;

import com.archi.hexa.service.in.ICarServiceIn;
import com.archi.hexa.service.out.ICarServiceOut;
import com.archi.hexa.service.out.impl.CarServiceOut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfiguration {

    @Bean
    public ICarServiceOut carServiceOut(ICarServiceIn carServiceIn){
        return new CarServiceOut(carServiceIn);
    }
}
