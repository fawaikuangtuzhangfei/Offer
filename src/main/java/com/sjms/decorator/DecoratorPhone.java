package com.sjms.decorator;

/**
 * @author yc
 * @date 2021-02-03 11:06
 */
public class DecoratorPhone {

    public static void main(String[] args) {
        Phone myPhone = new TimePhone(new MusicPhone(new IPhoneXS()));
        myPhone.call();
    }
}
