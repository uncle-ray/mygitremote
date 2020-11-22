package com.uncle.springmvc.service;

import com.uncle.springmvc.dao.BookMapper;
import com.uncle.springmvc.pojo.Books;

import java.util.List;

/**
 * @program: uncle-ray
 * @description:
 * @author: lei pei
 * @create: 2020-11-22 21:50
 */
public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return 0;
    }

    @Override
    public int updateBook(Books books) {
        return 0;
    }

    @Override
    public Books queryBookById(int id) {
        return null;
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
