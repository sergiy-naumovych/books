package com.apress.books.dao;

import com.apress.books.model.Book;
import com.apress.books.model.Category;

import java.util.List;

/**
 * Created by SERGE on 30.08.2014.
 */
public interface BookDAO {
    public List<Book> findAllBooks();

    public List<Book> searchBooksByKeyword(String keyword);

    public List<Category> findAllCategories();

    public void insert(Book book);

    public void update(Book book);

    public void delete(Book book);
}
