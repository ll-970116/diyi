package com.example.wanapplication.utils;

public interface INewWorkInterface {
    <T> void getBan(String url, INetCallBack<T> callBack);

    <T> void getList(String url, INetCallBack<T> callBack);

    <T> void getStudent(String url, INetCallBack<T> callBack);
}
