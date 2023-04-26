package ccw.rjb;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * @author 陈翔
 */
@SpringBootApplication(scanBasePackages={"ccw.rjb"})
@MapperScan(basePackages = "com.cx.springboot02.mapper")
public class Application {

    public static ConfigurableApplicationContext container;
    public static void main(String[] args) {
        Application.container = SpringApplication.run(Application.class, args);
    }
    /**
     * 获取Spring bean对象
     * 这里重写了bean方法
     * @param name
     * @return Object 一个以所给名字注册的Spring bean的实例
     * @throws BeansException
     */
    public static Object getBean(String name) throws BeansException {
        return container.getBean(name);
    }

}
