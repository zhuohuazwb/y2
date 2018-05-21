package com.zhkj.zwb;

import com.opensymphony.xwork2.Action;

/**
 * Created by Administrator on 2018/3/1/001.
 */
public class HelloWorldAction implements Action {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String name;
    private String message;
    @Override
    public String execute() throws Exception {
        return "success";
    }
}
