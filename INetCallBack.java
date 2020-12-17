package com.example.wanapplication.utils;

public interface INetCallBack<T> {
    void onSuccess(T t);

    void onFail(String string);
}
