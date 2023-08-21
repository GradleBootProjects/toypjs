package com.tpj.toypj_01.service;

import com.tpj.toypj_01.dao.MemberDAO;
import com.tpj.toypj_01.dao.MemberDAOImpl;
import com.tpj.toypj_01.mapper.MemberMapper;
import com.tpj.toypj_01.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    MemberMapper memberMapper;


    @Autowired
    private MemberDAOImpl dao;


    @Override
    public void signMember(MemberVO member) throws Exception {
        System.out.println("service member >> " + member.name);
        dao.signMember(member);
    }

}
