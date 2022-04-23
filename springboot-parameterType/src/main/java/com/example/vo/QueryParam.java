package com.example.vo;

public class QueryParam {
    private Object param1;
    private Object param2;

    @Override
    public String toString() {
        return "QueryParam{" +
                "param1=" + param1 +
                ", param2=" + param2 +
                '}';
    }

    public Object getParam1() {
        return param1;
    }

    public void setParam1(Object param1) {
        this.param1 = param1;
    }

    public Object getParam2() {
        return param2;
    }

    public void setParam2(Object param2) {
        this.param2 = param2;
    }
}
