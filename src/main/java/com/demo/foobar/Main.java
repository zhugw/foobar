package com.demo.foobar;

import com.demo.bar.SkinEntity;
import com.demo.foo.SkinServiceImpl;

/**
 * Created by duanmu on 12/28/16.
 */
public class Main {
    public static void main(String[] args) {
        SkinServiceImpl app = new SkinServiceImpl();
        SkinEntity entity = new SkinEntity();
        app.entityToSkin(entity);
    }
}
