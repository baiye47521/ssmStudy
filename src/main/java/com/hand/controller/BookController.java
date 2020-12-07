package com.hand.controller;

import com.hand.pojo.Books;
import com.hand.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/7 16:41
 * @Description
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调 service
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部书籍，并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    //跳转到书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(Model model){
        return "toAddBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook=>"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    //跳转到修改书籍页面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id, Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBooks",books);
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook=="+books);
        int i = bookService.updateBook(books);
        if (i>0) {
            System.out.println("修改成功"+books);
        }
        return "redirect:/book/allBook";
    }
}
