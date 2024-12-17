package com.rajdeep.book_library.service;

import com.rajdeep.book_library.model.BookModel;
import com.rajdeep.book_library.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl {
    @Autowired
    private BookRepo bookRepo;

    public BookModel add(BookModel bookModel) {
        return bookRepo.save(bookModel);
    }

    public List<BookModel> getAllBooks() {
        return bookRepo.findAll();
    }

    public Optional<BookModel> getBookById(Long id) {
        return bookRepo.findById(id);
    }

    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
}
