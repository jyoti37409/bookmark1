package com.jyotilabs.bookmarker.domain;

import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {
	public BookmarkDTO1 toDTO(Bookmark bookmark) {
		BookmarkDTO1 dto = new BookmarkDTO1();
		dto.setId(bookmark.getId());
		dto.setTitle(bookmark.getTitle());
		dto.setUrl(bookmark.getUrl());
		dto.setCreatedAt(bookmark.getCreatedAt());
		return dto;
	}

}
