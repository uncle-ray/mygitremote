package com.uncle.springmvc.controller;

import com.uncle.springmvc.pojo.Books;
import com.uncle.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: uncle-ray
 * @description:
 * @author: lei pei
 * @create: 2020-11-22 22:28
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String queryAllBook(Model model) {
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("books", books);
        return "allBook";
    }
}
