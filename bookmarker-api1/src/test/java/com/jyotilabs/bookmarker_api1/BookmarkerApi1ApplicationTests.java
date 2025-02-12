package com.jyotilabs.bookmarker_api1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.testcontainers.utility.TestcontainersConfiguration;

import com.jyotilabs.bookmarker.BookmarkerApi1Application;

@Import(TestcontainersConfiguration.class)
@SpringBootTest(classes= BookmarkerApi1Application.class)
class BookmarkerApi1ApplicationTests {

	@Test
	void contextLoads() {
	}

}
