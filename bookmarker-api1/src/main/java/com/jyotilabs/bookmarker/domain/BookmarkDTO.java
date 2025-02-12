package com.jyotilabs.bookmarker.domain;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fasterxml.jackson.annotation.JsonProperty;

//import org.hibernate.query.Page;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class BookmarkDTO {
	
	private List<BookmarkDTO1> data;
	private Long totalElements;
	private int totalPages;
	private int currentPage;
	@JsonProperty("isFirst")
	private boolean isFirst;
	@JsonProperty("isLast")
	private boolean isLast;
	private boolean hasNext;
	private boolean hasPrevious;
	
	public BookmarkDTO(Page<BookmarkDTO1> bookmarkPage) {
		this.setData(bookmarkPage.getContent());
		this.setTotalElements(bookmarkPage.getTotalElements());
		this.setTotalPages(bookmarkPage.getTotalPages());
		this.setCurrentPage(bookmarkPage.getNumber()+1);
		this.setFirst(bookmarkPage.isFirst());
		this.setLast(bookmarkPage.isLast());
		this.setHasNext(bookmarkPage.hasNext());
		this.setHasPrevious(bookmarkPage.hasPrevious());
	}
	

}
