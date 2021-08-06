package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

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

}
