package fju.edu;

import java.sql.SQLOutput;

public class Student {
    String code;
    int spend;
    int count;
    int money;

    public Student(String code,int spend,int count,int money){
        this.code = code;
        this.spend = spend;
        this.count = count;
        this.money = money;
    }
    public void print(){
        System.out.println(code + "\t" +spend + "\t" + count + "\t" + money);
    }

}
