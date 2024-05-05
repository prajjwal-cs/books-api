package io.github.prajjwal.books.repositories;

import io.github.prajjwal.books.domain.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<BookEntity, String> {
}
