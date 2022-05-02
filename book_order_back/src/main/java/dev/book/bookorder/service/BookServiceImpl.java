package dev.book.bookorder.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.book.bookorder.model.dto.BookDTO;
import dev.book.bookorder.model.entity.Book;
import dev.book.bookorder.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookDTO> findAllBooks() {
        //builder path쓰거나 하기
        
        List<Book> list = bookRepository.findAll(); //em.find() 랑 같음
        //bookRepository.~~ 여기 기능 많음
        //책 이름으로 찾고싶다면 만들수도있음
        List<BookDTO> result = list.stream().map(r -> new BookDTO(r)).collect(Collectors.toList());

        return result;
    }
    
}
