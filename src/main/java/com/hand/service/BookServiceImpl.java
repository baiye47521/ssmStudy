package com.hand.service;

import com.hand.dao.BookMapper;
import com.hand.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/7 15:48
 * @Description
 */
public class BookServiceImpl implements BookService{

    //service调dao层： 组合dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    public int updateBook(Books books) {
        System.out.println("BookServiceImpl:updateBook=>"+books);
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
