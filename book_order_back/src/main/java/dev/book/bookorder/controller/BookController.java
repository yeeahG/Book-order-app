package dev.book.bookorder.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.book.bookorder.model.dto.BookDTO;
import dev.book.bookorder.service.BookService;

@CrossOrigin(origins ="*") //모든 요청을 허용해
@RestController
@RequestMapping("/api/v1/books") //localhost:8090/api/v1/book~요청은 다여기로 옴
public class BookController {

    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping() //GET요청으로 /api/v1/books이면 여기로 들어옴
    public List<BookDTO> findAllBooks() {
        //System.out.println();
        //여기서 service로 가고 ->repository->DB
        //전체 책 데이터 조회
        return bookService.findAllBooks();
    }
}
