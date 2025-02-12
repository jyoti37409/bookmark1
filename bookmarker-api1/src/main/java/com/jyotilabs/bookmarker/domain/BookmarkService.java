package com.jyotilabs.bookmarker.domain;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; // Correct import
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository repository;
    private final BookmarkMapper bookmarkmapper;

    @Transactional(readOnly = true) // Now it works correctly
    public BookmarkDTO getBookmarks(Integer page) {
    	int pageNo = page < 1 ? 0:page - 1;
    	Pageable pageable = PageRequest.of(pageNo, 10, Sort.Direction.DESC,"CreatedAt");
    	Page<BookmarkDTO1> bookmarkpage = repository.findAll(pageable).map(bookmarkmapper::toDTO);
        return new BookmarkDTO(bookmarkpage);
    }
}
