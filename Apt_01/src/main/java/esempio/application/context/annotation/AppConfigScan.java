package esempio.application.context.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "esempio.application.context.annotation.scan")
public class AppConfigScan {

}
