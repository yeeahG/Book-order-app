package dev.book.bookorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.book.bookorder.model.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    //책 이름으로 찾고싶다면
    //public Book findByName(); //find by name -> Book에서의 name을 찾는다
    Book findByName(String name);
}
