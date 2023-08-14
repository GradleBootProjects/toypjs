package com.tpj.toypj_01.vo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MemberVO {
    public String name;
    public int win;
    public int lose;

    public MemberVO(){}
    public MemberVO(String name, int win, int lose) {
        super();
        this.name = name;
        this.win = win;
        this.lose = lose;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getWin() {
        return win;
    }
    public void setWin(int win){
        this.win = win;
    }

    public int getLose() {
        return lose;
    }
    public void setLose(int lose){
        this.lose = lose;
    }
}
