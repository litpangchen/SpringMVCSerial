package com.example.service;

import com.example.domain.Book;
import com.example.domain.Category;

import java.util.List;

public interface BookService {
    List<Category> getAllCategories();

    Category getCategory(int id);

    List<Book> getAllBooks();

    Book save(Book book);

    Book update(Book book);

    Book get(long id);

    int getNextId();
}
