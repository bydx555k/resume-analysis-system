package ccw.rjb.constant;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author 陈翔
 */
public class DemoConstant {
    /**
     * http port
     */
    static String PORT;
    @Value("${server.port}")
    public void setPort(String port) {
        DemoConstant.PORT = port;
    }
}
