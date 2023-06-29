package zhulin.campus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zhulin.campus.pojo.Grade;
import zhulin.campus.service.GradeService;
import zhulin.campus.mapper.GradeMapper;
import org.springframework.stereotype.Service;

/**
* @author 朱琳
* @description 针对表【tb_grade】的数据库操作Service实现
* @createDate 2023-05-15 17:22:37
*/
@Service
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade>
    implements GradeService{

}




