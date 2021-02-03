package com.sjms.decorator;

/**
 * @author yc
 * @date 2021-02-03 11:01
 */
public class MusicPhone extends PhoneDecorate{
    public MusicPhone(Phone phone) {
        super(phone);
    }

    private void listenMusic(){
        System.out.println("≤ ¡Â...dididi....");
    }
    @Override
    public void call(){
        super.call();
        listenMusic();
    }
}
