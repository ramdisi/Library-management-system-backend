package org.openSourceLibrarySystem.controller;

import org.openSourceLibrarySystem.model.entity.BookEntity;
import org.openSourceLibrarySystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/sample")
    public String sampleAPI(){
        return "API";
    }
    @GetMapping("/getAll")
    public List<BookEntity> getAll(){
        return bookService.getAllDetails();
    }
    @GetMapping("/saveBook")
    public void saveBook(){
        bookService.saveBook();
    }
}
