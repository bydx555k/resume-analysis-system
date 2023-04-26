package ccw.rjb.service.impl;

import ccw.rjb.data.entity.Student;
import ccw.rjb.mapper.DemoMapper;
import ccw.rjb.service.DemoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 陈翔
 */
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Student> implements DemoService {

    @Autowired
    DemoMapper demoMapper;

    @Override
    public Student get() {
        return demoMapper.selectOne(null);
    }
}
