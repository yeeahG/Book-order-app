package dev.book.bookorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.book.bookorder.model.entity.Accommodation;

public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {
    Accommodation findByName(String name);
}
