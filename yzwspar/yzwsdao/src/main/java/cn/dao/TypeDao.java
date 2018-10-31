package cn.dao;

import cn.pojo.Type;

import java.util.List;

public interface TypeDao {
    List<Type> sel();
    Type sel1();
    int insert();
    int ins();
    int upda();

    String select();
    String Select(int a);
    String updaall();
}
