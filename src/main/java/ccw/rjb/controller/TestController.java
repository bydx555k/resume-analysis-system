package ccw.rjb.controller;



import ccw.rjb.common.ApiResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


/**
 * @author 陈翔
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {
    /**
     * 演示接口
     * @return
     * @throws Exception
     */
    @GetMapping("/value")
    public ApiResp<String> value(String name) throws Exception{
        log.info("enter");
        return ApiResp.success("123");
    }
}
