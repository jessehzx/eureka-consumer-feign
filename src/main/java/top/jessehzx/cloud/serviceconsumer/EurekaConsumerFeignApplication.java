package top.jessehzx.cloud.serviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jessehzx
 * @Date 2018/4/10
 */
@EnableFeignClients       // 用于启动Feign功能
@EnableDiscoveryClient    // 用于启动服务发现功能
@SpringBootApplication
public class EurekaConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerFeignApplication.class, args);
	}
}
