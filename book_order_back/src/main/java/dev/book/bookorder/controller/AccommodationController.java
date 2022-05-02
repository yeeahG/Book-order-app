package dev.book.bookorder.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.book.bookorder.service.AccommodationService;
import dev.book.bookorder.model.dto.AccommodationDTO;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1/acccomm")
public class AccommodationController {
    
    private final AccommodationService accommodationService;
    public AccommodationController(AccommodationService accommodationService) {
        this.accommodationService=accommodationService;
    }

    @GetMapping()
    public List<AccommodationDTO> findAllAccommodations() {
        return accommodationService.findAllAccommodations();
    }
}
