package org.openSourceLibrarySystem.controller;

import org.openSourceLibrarySystem.model.dto.BookDTO;
import org.openSourceLibrarySystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/sample")
    public String sampleAPI(){
        return "BookAPI";
    }
    @GetMapping("/getAll")
    public List<BookDTO> getAll(){
        return bookService.getAllDetails();
    }

    @PostMapping("/saveBook")
    public void saveBook(@RequestBody BookDTO bookDTO){
        bookService.saveBook(bookDTO);
    }

    @GetMapping("/search/{id}")
    public BookDTO searchById(@PathVariable String id){
        return bookService.searchById(id);
    }

    @PostMapping("/update")
    public void updateBook(@RequestBody BookDTO bookDTO){
        bookService.updateBook(bookDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String id){
        bookService.deleteByid(id);
    }
}
