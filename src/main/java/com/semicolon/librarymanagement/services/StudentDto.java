package com.semicolon.librarymanagement.services;

import com.semicolon.librarymanagement.models.Book;
import com.semicolon.librarymanagement.models.enums.BorrowStatus;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class StudentDto {
    private Long studentId;

    private String firstName;

    private String lastName;
    private String address;
    private BorrowStatus bookStatus;

    private List<Book> booksBorrowed;
    private Boolean isSuccess;

}
