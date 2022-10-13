package com.semicolon.librarymanagement.models;

import com.semicolon.librarymanagement.models.enums.BorrowStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    private String address;
    private BorrowStatus bookStatus;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "students_books",
            joinColumns = @JoinColumn(
                    name = "student_id", referencedColumnName = "studentId"),
            inverseJoinColumns = @JoinColumn(
                    name =  "book_id",referencedColumnName = "bookId"
            )
    )
    private List<Book> booksBorrowed;



}
