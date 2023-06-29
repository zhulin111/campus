package zhulin.campus.service;

import zhulin.campus.pojo.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 朱琳
* @description 针对表【tb_teacher】的数据库操作Service
* @createDate 2023-05-15 17:22:55
*/
public interface TeacherService extends IService<Teacher> {
    Teacher selectTeacherByNameAndPassword(String username, String password);
    Teacher selectAdminById(Long userId);

}
