package com.demo.FactoryMethodLogisticaTransporte.services;

import com.demo.FactoryMethodLogisticaTransporte.models.TipoInventario;
import com.demo.FactoryMethodLogisticaTransporte.repositories.TipoInventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoInventarioServiceImpl implements TipoInventarioService{
    @Autowired
    private TipoInventarioRepository tipoInventarioRepository;

    @Override
    public List<TipoInventario> obtenerTipoInventario() {
        return tipoInventarioRepository.findAll();
    }

    @Override
    public TipoInventario GuardarTipoInventario(TipoInventario ti) {
        return tipoInventarioRepository.save(ti);
    }
}
