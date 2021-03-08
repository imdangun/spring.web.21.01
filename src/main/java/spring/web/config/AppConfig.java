package spring.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import spring.web.ch05.ex02.ConsoleInterceptor;
import spring.web.ch05.ex02.LoginInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan("spring.web")
@ImportResource("classpath:spring/web/config/app.xml")
public class AppConfig implements WebMvcConfigurer {
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}	

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/view/", ".jsp");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/ch03/ex03").setViewName("ch03/ex03/surveyIn");
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(consoleInterceptor()).addPathPatterns("/ch05/ex02/**");
		registry.addInterceptor(loginInterceptor())
			.addPathPatterns("/ch05/ex02/**")			
			.excludePathPatterns("/ch05/ex02/login*");
	}
	
	@Bean
	public ConsoleInterceptor consoleInterceptor() {
		return new ConsoleInterceptor();
	}
	
	@Bean
	public LoginInterceptor loginInterceptor() {
		return new LoginInterceptor();
	}
}
