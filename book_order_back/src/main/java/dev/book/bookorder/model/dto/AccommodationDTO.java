package dev.book.bookorder.model.dto;

import dev.book.bookorder.model.entity.Accommodation;

public class AccommodationDTO {
    private Long id;
    private String name;
    private String location;
    private String address;
    private int price;

    public AccommodationDTO(Accommodation accommodation) {
        this.id=accommodation.getId();
        this.location=accommodation.getLocation();
        this.name=accommodation.getName();
        this.address=accommodation.getAddress();
        this.price=accommodation.getPrice();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
