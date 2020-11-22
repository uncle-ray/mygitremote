package com.uncle.springmvc.service;

import com.uncle.springmvc.pojo.Books;

import java.util.List;

/**
 * @program: uncle-ray
 * @description:
 * @author: lei pei
 * @create: 2020-11-22 21:49
 */
public interface BookService {
    int addBook(Books books);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBook();
}
