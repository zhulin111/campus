package zhulin.campus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zhulin.campus.pojo.Admin;
import zhulin.campus.service.AdminService;
import zhulin.campus.mapper.AdminMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author 朱琳
* @description 针对表【tb_admin】的数据库操作Service实现
* @createDate 2023-05-15 17:21:26
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
    implements AdminService{
    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin selectAdminByNameAndPassword(String username, String password) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name",username).eq("password",password);
        return adminMapper.selectOne(queryWrapper);
    }

    @Override
    public Admin selectAdminById(Long userId) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",userId);
        return adminMapper.selectOne(queryWrapper);
    }

}




