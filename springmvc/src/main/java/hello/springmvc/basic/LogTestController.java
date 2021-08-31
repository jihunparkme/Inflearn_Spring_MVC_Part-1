package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller : 반환값이 String이면 View 이름으로 인식 -> View를 찾고 View가 렌더링
 * @RestController : HTTP 메시지 바디에 바로 입력
 */
@Slf4j
@RestController
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace(" trace log = {}", name);
        log.debug(" debug log = {}", name); // 개발 서버 log
        log.info("   info log = {}", name); // 비즈니스 정보, 운영 시스템 정보
        // 2021-08-31 22:11:10.267  INFO 6688 --- [nio-8080-exec-6] hello.springmvc.basic.LogTestController  :  info log = Spring
        //                                pid           thread                              ControllerName          Message
        log.warn("   warn log = {}", name);
        log.error(" error log = {}", name);


        return "ok";
    }
}