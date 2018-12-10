package com.softwarelma.ewd.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "editorBean")
public class EwdMainBean {

    private String value = "from bean";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
