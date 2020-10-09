package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book(4, "ABC", 100, "Pushkin");

    @Test
    void shouldNotMatchAuthorOfBook() {
        String text = "Po";
        assertEquals(false, book.matches(text));
    }

    @Test
    void shouldMatchAuthorOfBook() {
        String text = "Pushkin";
        assertEquals(true, book.matches(text));

    }
}