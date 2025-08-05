package com.example.bookstore.response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(force = true)
public class BaseBookStoreResponse {
  private final String status;
  private final String message;
}
