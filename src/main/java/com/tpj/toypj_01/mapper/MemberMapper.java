package com.tpj.toypj_01.mapper;


import com.tpj.toypj_01.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;


@Mapper
public class MemberMapper {

    @Autowired
    MemberMapper memberMapper;

    public void signMember(MemberVO member) throws Exception {
        memberMapper.signMember(member);
    }

}
