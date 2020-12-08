package cn.hziee.myh.mapper;

import cn.hziee.myh.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapper2Impl extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> selectUser() {
        // 也可以写成一行
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
