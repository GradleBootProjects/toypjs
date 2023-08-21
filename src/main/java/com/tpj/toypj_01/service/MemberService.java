package com.tpj.toypj_01.service;

import com.tpj.toypj_01.vo.MemberVO;
import org.springframework.stereotype.Service;


public interface MemberService {

    public void signMember(MemberVO member) throws Exception;   // sign
    // public <List>MemberVO showMember() throws Exception;    // total member view

}
