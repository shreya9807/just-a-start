package com.example.bookstore.controller;

import com.example.bookstore.response.BooksStoreResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class BookStoreController implements BookStoreApi {
  @Override
  public ResponseEntity<BooksStoreResponse> getBooks() {
    return null;
  }
}
