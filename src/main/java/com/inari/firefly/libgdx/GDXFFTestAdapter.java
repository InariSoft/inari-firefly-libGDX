package com.inari.firefly.libgdx;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.inari.firefly.system.FFContext;
import com.inari.firefly.system.FireFly;

public abstract class GDXFFTestAdapter extends ApplicationAdapter {
    
    private FireFly firefly;
    
    @Override
    public final void create () {
        Gdx.graphics.setTitle( getTitle() );
        firefly = new FireFly( GDXConfiguration.getInitMap() );
        FFContext context = firefly.getContext();
        initTest( context );
    }
    
    public abstract void initTest( FFContext context );

    @Override
    public final void render () {
        firefly.update();
        firefly.render();
    }
    
    public abstract String getTitle();


}