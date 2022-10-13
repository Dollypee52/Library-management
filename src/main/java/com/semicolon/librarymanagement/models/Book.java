package com.semicolon.librarymanagement.models;

import com.semicolon.librarymanagement.models.enums.BookType;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private Long bookId;
    private String title;
    private String Author;
    private LocalDateTime dateBorrowed;
    private LocalDateTime dateReturn;
    private BookType bookType;
    @ManyToMany
    private List<Student> borrowers;

}
