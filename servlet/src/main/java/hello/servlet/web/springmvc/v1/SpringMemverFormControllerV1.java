package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * @Controller
 *  - Component Scan 의 대상
 *  - RequestMappingHandlerMapping 매핑 정보로 인식하여 사용
 *  - @Component + @RequestMapping 과 동일
 *
 *
 * @RequestMapping
 *  - 요청정보 매핑
 */
@Controller
public class SpringMemverFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
