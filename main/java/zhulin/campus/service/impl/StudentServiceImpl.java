package zhulin.campus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zhulin.campus.pojo.Student;
import zhulin.campus.service.StudentService;
import zhulin.campus.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author 朱琳
* @description 针对表【tb_student】的数据库操作Service实现
* @createDate 2023-05-15 17:22:46
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService{
    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student selectStudentByNameAndPassword(String username, String password) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name",username).eq("password",password);
        return studentMapper.selectOne(queryWrapper);
    }

    @Override
    public Student selectAdminById(Long userId) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",userId);
        return studentMapper.selectOne(queryWrapper);
    }

}




