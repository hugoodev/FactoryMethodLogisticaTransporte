package com.demo.FactoryMethodLogisticaTransporte.repository;

import com.demo.FactoryMethodLogisticaTransporte.models.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Long> {
}
