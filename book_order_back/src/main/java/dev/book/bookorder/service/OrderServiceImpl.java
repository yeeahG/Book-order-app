package dev.book.bookorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.book.bookorder.model.dto.OrderDTO;
import dev.book.bookorder.model.entity.Book;
import dev.book.bookorder.model.entity.Order;
import dev.book.bookorder.repository.BookRepository;
import dev.book.bookorder.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    BookRepository bookRepository;
    
    @Override
    public void insertOrder(OrderDTO orderDTO) {
        //bookRepository.findByName()으로 booktitle을 찾을것
        //커스터마이징
        Book book = bookRepository.findByName(orderDTO.getBookTitle());
       
        //Order Entity 생성
        //이걸 자동으로 생성시켜주는 modellibrary도 있고 buildpattern도 있다
        Order order = new Order();
        order.setUserName(orderDTO.getUserName());
        order.setAddress(orderDTO.getAddress());
        order.setTotalPrice(orderDTO.getTotalPrice());

        //mapping
        order.setBook(book);

        //저장
        orderRepository.save(order);
    }
    
}
