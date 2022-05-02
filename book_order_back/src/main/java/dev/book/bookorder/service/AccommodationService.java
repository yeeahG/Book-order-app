package dev.book.bookorder.service;

import java.util.List;

import dev.book.bookorder.model.dto.AccommodationDTO;

public interface AccommodationService {
    List<AccommodationDTO> findAllAccommodations();
}
