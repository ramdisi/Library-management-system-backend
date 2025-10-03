package org.openSourceLibrarySystem.service;

import org.openSourceLibrarySystem.model.entity.BookEntity;
import org.openSourceLibrarySystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public List<BookEntity> getAllDetails(){
        List<BookEntity> all = bookRepository.findAll();
        return all;
    }
    public void saveBook(){
        bookRepository.save(new BookEntity("E001",120.00));
    }
}
