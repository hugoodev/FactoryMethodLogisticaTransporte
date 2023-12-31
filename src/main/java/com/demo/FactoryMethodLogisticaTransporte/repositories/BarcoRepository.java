package com.demo.FactoryMethodLogisticaTransporte.repositories;

import com.demo.FactoryMethodLogisticaTransporte.transporte.Barco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarcoRepository extends JpaRepository<Barco, Long> {
}
