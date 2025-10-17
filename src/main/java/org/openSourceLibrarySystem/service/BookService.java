package org.openSourceLibrarySystem.service;

import org.openSourceLibrarySystem.model.dto.BookDTO;
import org.openSourceLibrarySystem.model.entity.BookEntity;
import org.openSourceLibrarySystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public List<BookDTO> getAllDetails(){
        List<BookEntity> bookEntityList = bookRepository.findAll();
        List<BookDTO> bookDTOList = new ArrayList<>();
        for(BookEntity bookEntity : bookEntityList){
            bookDTOList.add(new BookDTO(bookEntity.getId(),
                    bookEntity.getTitle(),
                    bookEntity.getAuthor(),
                    bookEntity.getPublisher(),
                    bookEntity.getIsbn(),
                    bookEntity.getCategory(),
                    bookEntity.getAvailableCopies()));
        }
        return bookDTOList;
    }
    public void saveBook(BookDTO bookDTO){
        bookRepository.save(new BookEntity(
                bookDTO.getId(),
                bookDTO.getTitle(),
                bookDTO.getAuthor(),
                bookDTO.getPublisher(),
                bookDTO.getIsbn(),
                bookDTO.getCategory(),
                bookDTO.getAvailableCopies()
        ));
    }

    public BookDTO searchById(String id) {
        BookEntity bookEntity = bookRepository.findById(Long.parseLong(id)).orElseThrow();
        return new BookDTO(bookEntity.getId(),
                bookEntity.getTitle(),
                bookEntity.getAuthor(),
                bookEntity.getPublisher(),
                bookEntity.getIsbn(),
                bookEntity.getCategory(),
                bookEntity.getAvailableCopies());
    }

    public void updateBook(BookDTO bookDTO) {
        BookEntity bookEntity = new BookEntity(bookDTO.getId(),
                bookDTO.getTitle(),
                bookDTO.getAuthor(),
                bookDTO.getPublisher(),
                bookDTO.getIsbn(),
                bookDTO.getCategory(),
                bookDTO.getAvailableCopies());
        bookRepository.save(bookEntity);
    }

    public void deleteByid(String id) {
        bookRepository.deleteById(Long.parseLong(id));
    }
}
