package cn.hziee.myh.mapper;

import cn.hziee.myh.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectUser() {

        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        System.out.println(users);
        return null;
    }
}
