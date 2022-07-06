package com.ydy._12自定义泛型接口;

public interface Data<E> {
    void add(E e);
    void delete(E e);
    void update(E e);
    E query(int id);
}
