package com.laphayen.pharmacyrecommendation.pharmacy.repository;

import com.laphayen.pharmacyrecommendation.pharmacy.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {

}
