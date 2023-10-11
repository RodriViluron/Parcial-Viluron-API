package com.utn.ParcialViluron.Services;

import com.utn.ParcialViluron.Entities.Localidad;
import com.utn.ParcialViluron.Repositories.BaseRepository;
import com.utn.ParcialViluron.Repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {

        super(baseRepository);
    }
}
