package test.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy()
public class AudienceConfig {
	@Bean
	public Audience audience(){
		return new Audience();
	}
	
	@Bean
	public Performance performance(){
		return new PerformanceModel();
	}

}
