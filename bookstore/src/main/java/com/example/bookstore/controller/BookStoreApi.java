package com.example.bookstore.controller;

import static com.example.bookstore.constants.BookStoreConstants.APPLICATION_JSON;
import static com.example.bookstore.constants.BookStoreConstants.BASE_URI;
import static com.example.bookstore.constants.BookStoreConstants.LOAD_BOOKS_URI;

import com.example.bookstore.response.BooksStoreResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(BASE_URI)
public interface BookStoreApi {
  // load all books, addBook
  @GetMapping(path = LOAD_BOOKS_URI, consumes = APPLICATION_JSON, produces = APPLICATION_JSON)
  ResponseEntity<BooksStoreResponse> getBooks();
}
