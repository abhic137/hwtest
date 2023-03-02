package com.training.example.JacocoExample;

import static org.junit.Assert.*;

import org.junit.Test;



public class PalindromeTest{


	@Test
    public void testWordInString() {
        String sentence = "hello world";
        assertTrue(sentence.contains("hello"));
    }

    @Test
    public void testWordNotInString() {
        String sentence = "hello world";
        assertFalse(sentence.contains("cat"));
    }

    @Test
    public void testWordInEmptyString() {
        String sentence = "";
        assertFalse(sentence.contains("hello"));
    }

    @Test
    public void testNullString() {
        String sentence = null;
        assertFalse(sentence.contains("hello"));
    }

    @Test
    public void testWordInStringCaseInsensitive() {
        String sentence = "hello world";
        assertTrue(sentence.toLowerCase().contains("hello"));
    }
    
    @Test
    public void testWordWithSpecialCharacters() {
        String sentence = "hello world";
        assertTrue(sentence.contains("hello"));
    }
}
