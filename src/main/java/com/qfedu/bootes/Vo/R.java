package com.qfedu.bootes.Vo;

/**
 * @Author Bingove
 * @Date 2018/8/8 0008 下午 20:38
 */
public class R {
    private int code;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static R ok(Object obj) {
        R r = new R();
        r.setCode(1);
        r.setData(obj);
        return r;
    }
    public static R error(Object obj) {
        R r = new R();
        r.setCode(0);
        r.setData(obj);
        return r;
    }

    public R() {
    }

    public R(int code, Object data) {
        this.code = code;
        this.data = data;
    }
}
