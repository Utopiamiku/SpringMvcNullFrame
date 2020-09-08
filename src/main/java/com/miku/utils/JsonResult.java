package com.miku.utils;

public class JsonResult<T> {
    private T obj;
    private String msg;
    private int stateCode;

    public JsonResult() {
    }

    public JsonResult(T obj, String msg, int stateCode) {
        this.obj = obj;
        this.msg = msg;
        this.stateCode = stateCode;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }
}
