package zhulin.campus.service;

import zhulin.campus.pojo.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 朱琳
* @description 针对表【tb_student】的数据库操作Service
* @createDate 2023-05-15 17:22:46
*/
public interface StudentService extends IService<Student> {
    Student selectStudentByNameAndPassword(String username, String password);

    Student selectAdminById(Long userId);

}
