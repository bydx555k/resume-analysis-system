package ccw.rjb.service;

import ccw.rjb.data.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 陈翔
 */
public interface DemoService extends IService<Student> {
    /**
     * 获取学生信息
     * @return
     */
    Student get();
}
