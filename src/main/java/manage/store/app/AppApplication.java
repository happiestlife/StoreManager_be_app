package manage.store.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"manage.store"})
public class AppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(AppApplication.class, args);
		for (String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
	}

}
