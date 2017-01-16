package com.vodden.math.parser.acceptance.pages;

import javax.inject.Inject;

public class Pages {
    private Home home;
    
    @Inject
    public Pages(Home home) {
        this.home = home;
    }
 
    public Home home(){
        return home;
    }
 
}
