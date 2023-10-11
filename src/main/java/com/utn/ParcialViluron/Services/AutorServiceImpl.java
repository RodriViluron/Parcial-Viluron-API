package com.utn.ParcialViluron.Services;

import com.utn.ParcialViluron.Entities.Autor;
import com.utn.ParcialViluron.Repositories.AutorRepository;
import com.utn.ParcialViluron.Repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
