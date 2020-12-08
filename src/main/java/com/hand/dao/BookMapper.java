package com.hand.dao;

import com.hand.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/7 15:34
 * @Description
 */
public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBook(@Param("bookId") int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(@Param("bookId") int id);
    //查询全部的书
    List<Books> queryAllBook();
    //查询一本书
    Books queryBookByName(@Param("bookName") String bookName);
}
