package com.rajdeep.book_library.repo;

import com.rajdeep.book_library.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<BookModel, Long> {
}
