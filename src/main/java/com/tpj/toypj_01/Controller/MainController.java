package com.tpj.toypj_01.Controller;

import com.tpj.toypj_01.dao.MemberDAO;
import com.tpj.toypj_01.service.MemberService;
import com.tpj.toypj_01.vo.MemberVO;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MainController {

    @Autowired
    private MemberService service;


    @GetMapping("/home")
    public String home(){
        return "home";
    }


    @GetMapping("/sign")
    public String sign(MemberVO vo) throws Exception{
        System.out.println("SIGN IN is COMING");

        System.out.println("vo.id >> " + vo.name);

        String url;

        if(vo.getName() != null){
            service.signMember(vo);
            System.out.println("SIGN IN is SUCCESS!!");
            url="home";
        }
        else{
            url="sign";
        }

        return url;
    }
}
