package com.tpj.toypj_01.dao;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.tpj.toypj_01.vo.MemberVO;
import lombok.Getter;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {

    @Autowired
    private SqlSessionTemplate sqlSession;

    // private static final String Namespace = "com.tpj.toypj_01.mapper.memberMapper";


    @Override
    public void signMember(MemberVO member) throws Exception{
        System.out.println("memberDAO result >> " + member.name);
        sqlSession.insert("member_mapper.signMember", member);
    }

}
