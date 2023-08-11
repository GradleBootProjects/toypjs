package com.tpj.toypj_01.service;

import com.tpj.toypj_01.dao.MemberDAO;
import com.tpj.toypj_01.mapper.MemberMapper;
import com.tpj.toypj_01.vo.MemberVO;
import org.springframework.stereotype.Service;

@Service
public abstract class MemberServiceImpl implements MemberService {

    MemberMapper memberMapper;


    private MemberVO vo;
    private MemberDAO dao;

    @Override
    public void signMember(MemberVO member) throws Exception {
        dao.signMember(member);
    }

}
