package com.yourapp.service;

import com.yourapp.model.Book;
import com.yourapp.model.CD;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {
    public List<Book> searchBooks(String query) {
        // Implement search logic for books (possibly using a repository)
        return null;
    }

    public List<CD> searchCDs(String query) {
        // Implement search logic for CDs
        return null;
    }
}
