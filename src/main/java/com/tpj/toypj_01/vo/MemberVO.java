package com.tpj.toypj_01.vo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MemberVO {
    public String name;
    public int win;
    public int lose;
    public String pw;

    public MemberVO(){}
    public MemberVO(String name, int win, int lose, String pw) {
        super();
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.pw = pw;
    }

    public String getName(){
        return name;
    }

    public int getWin(){
        return win;
    }

    public int getLose(){
        return lose;
    }

    public String getPw(){
        return pw;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setWin(int win){
        this.win = win;
    }

    public void setLose(int lose){
        this.lose = lose;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
