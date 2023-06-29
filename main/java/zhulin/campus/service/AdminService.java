package zhulin.campus.service;

import zhulin.campus.pojo.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 朱琳
* @description 针对表【tb_admin】的数据库操作Service
* @createDate 2023-05-15 17:21:26
*/
public interface AdminService extends IService<Admin> {
    Admin selectAdminByNameAndPassword(String username, String password);

    Admin selectAdminById(Long userId);

}
