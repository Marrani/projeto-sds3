package com.marrani.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marrani.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
