package com.stefan.dataconsumer;

import com.stefan.dataconsumer.proxy.DataConsumerFeignProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(clients = {DataConsumerFeignProxy.class})
public class DataConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataConsumerApplication.class, args);
	}

}
