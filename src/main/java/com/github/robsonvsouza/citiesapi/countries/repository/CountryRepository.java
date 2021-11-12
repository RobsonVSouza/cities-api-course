package com.github.robsonvsouza.citiesapi.countries.repository;

import com.github.robsonvsouza.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
