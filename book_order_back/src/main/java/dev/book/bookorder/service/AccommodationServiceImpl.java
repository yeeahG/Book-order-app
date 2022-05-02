package dev.book.bookorder.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.book.bookorder.model.dto.AccommodationDTO;
import dev.book.bookorder.model.entity.Accommodation;
import dev.book.bookorder.repository.AccommodationRepository;

@Service
public class AccommodationServiceImpl implements AccommodationService{
    @Autowired
    private AccommodationRepository accommodationRepository;

    @Override
    public List<AccommodationDTO> findAllAccommodations() {
        List<Accommodation> list = accommodationRepository.findAll();
        List<AccommodationDTO> result = list.stream().map(r -> new AccommodationDTO(r)).collect(Collectors.toList());
        return result;
    }
}
