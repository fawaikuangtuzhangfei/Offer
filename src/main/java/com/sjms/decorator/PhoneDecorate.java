package com.sjms.decorator;

/**
 * @author yc
 * @date 2021-02-03 11:00
 */
public abstract class PhoneDecorate implements Phone{
    // ����ϵķ�ʽ����ȡĬ��ʵ����
    private Phone phone;

    public PhoneDecorate(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        phone.call();
    }

}
