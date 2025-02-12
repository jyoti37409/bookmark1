package com.jyotilabs.bookmarker.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.jyotilabs.bookmarker.domain.BookmarkRepository;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.CoreMatchers.equalTo; // Correct import


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@TestPropertySource(properties= {"spring.datasource.url=jdbc:tc:postgresql:14-alpine:///demo"})
public class BookmarkControllerTest {

    @Autowired
    private MockMvc mvc;
    
    @Autowired
    BookmarkRepository bookmarkRepository;
    
    @BeforeEach
    void setup() {
        bookmarkRepository.deleteAllInBatch(); // Ensure it's supported by your repository
    }

    @Test
    void shouldGetBookmarks() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/bookmarks"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.totalElements", equalTo(0))); // Use correct import
    }
}

