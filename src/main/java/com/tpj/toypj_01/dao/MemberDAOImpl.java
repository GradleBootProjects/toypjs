package com.tpj.toypj_01.dao;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.tpj.toypj_01.vo.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {

    @Autowired
    private SqlSession sqlSession;

    private static final String Namespace = "com.tpj.ToyPJ_01.memberMapper";


    public void signMember(MemberVO member) throws Exception{

    }

}
