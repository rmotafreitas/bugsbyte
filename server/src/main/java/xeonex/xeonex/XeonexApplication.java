package xeonex.xeonex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import xeonex.xeonex.service.IndicatorService;



@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
public class XeonexApplication {


	public static void main(String[] args) {

		SpringApplication.run(XeonexApplication.class, args);
	}

}
