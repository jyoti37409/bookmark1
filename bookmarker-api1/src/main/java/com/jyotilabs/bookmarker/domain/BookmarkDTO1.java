package com.jyotilabs.bookmarker.domain;

import java.time.Instant;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
//@//AllArgsConstructor
public class BookmarkDTO1 {
	private Long id;
	private String title;
	private String url;
	@Column(nullable = false, updatable = false)
	private Instant createdAt;
	
	public BookmarkDTO1(Long id, String title, String url, Instant createdAt) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.createdAt = createdAt;

}
}