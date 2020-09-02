package com.haunt.gaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haunt.gaming.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {


}
