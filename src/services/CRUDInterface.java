package services;

import java.util.List;

public interface CRUDInterface<T>{
    void add(T t);
    void edit(T t, int id);
    void delete(int id);
    List<T> getAll();
}
