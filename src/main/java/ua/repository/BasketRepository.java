package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Basket;

public interface BasketRepository extends JpaRepository<Basket, Integer>{

}
