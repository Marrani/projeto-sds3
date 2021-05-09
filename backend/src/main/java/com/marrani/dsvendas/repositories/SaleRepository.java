package com.marrani.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marrani.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
