package com.tpj.toypj_01.Controller;

import com.tpj.toypj_01.dao.MemberDAO;
import com.tpj.toypj_01.service.MemberService;
import com.tpj.toypj_01.vo.MemberVO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static MemberService service;

    @GetMapping("/home")
    public String home(){
        return "/home";
    }

    @GetMapping("/sign")
    public String sign(HttpServletRequest request, MemberVO vo) throws Exception{




        if(vo.getName() != null){
            System.out.println("SIGN IN is SUCCESS!!");
            service.signMember(vo);
        }

        return "home";
    }
}
