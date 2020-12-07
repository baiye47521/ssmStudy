package com.hand.service;

import com.hand.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/7 15:47
 * @Description
 */
public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBook(int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(int id);
    //查询全部的书
    List<Books> queryAllBook();
}
