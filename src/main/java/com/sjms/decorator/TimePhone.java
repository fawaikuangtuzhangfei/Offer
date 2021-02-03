package com.sjms.decorator;

import java.util.Date;

/**
 * @author yc
 * @date 2021-02-03 11:04
 */
public class TimePhone extends PhoneDecorate{
    public TimePhone(Phone phone) {
        super(phone);
    }

    private void getTime(){
        System.out.println("œ÷‘⁄ «" + new Date());
    }
    @Override
    public void call() {
        getTime();
        super.call();
    }
}
