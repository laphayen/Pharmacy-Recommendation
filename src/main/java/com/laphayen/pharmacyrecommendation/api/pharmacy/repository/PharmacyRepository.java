package com.laphayen.pharmacyrecommendation.api.pharmacy.repository;

import com.laphayen.pharmacyrecommendation.api.pharmacy.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {

}
