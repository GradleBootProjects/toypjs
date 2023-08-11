package com.tpj.toypj_01.dao;

import com.tpj.toypj_01.vo.MemberVO;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDAO {
    public void signMember(MemberVO member) throws Exception;

}
