package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ServletComponentScan // 서블릿 자동 등록
/**
 * @ServletComponentScan
 * Spring 에서 Servlet 사용을 위한 annotation
 * 하위에 패키지에 있는 Servlet 들을 찾아서 등록
 */
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

	/* application.properties 에 spring.mvc.view.prefix, spring.mvc.view.suffix 를 등록하지 않을 경우
	@Bean
	ViewResolver internalResourceViewResolver() {
		return new InternalResourceViewResolver("/WEB-INF/views/",".jsp");
	}
	*/
}
