package pl.lublin.wsei.java.cwiczenia.mylib;

import pl.lublin.wsei.java.cwiczenia.mylib.account;

public class main_4 {
    public static void main(String[]args){
        account acc = new account();
        String txt = "українська слава";
        System.out.printf(account.translit(txt));
    }
}