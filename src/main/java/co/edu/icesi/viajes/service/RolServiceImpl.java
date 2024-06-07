package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Rol;
import co.edu.icesi.viajes.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class RolServiceImpl implements RolService{
    @Autowired
    private RolRepository rolRepository;


    @Override
    public List<Rol> findAll() {
        List<Rol> lstRol = rolRepository.findAll();
        return lstRol;
    }

    @Override
    public Optional<Rol> findById(Integer integer) {
return rolRepository.findById(integer);    }

    @Override
    public Rol save(Rol entity) throws Exception {
return rolRepository.save(entity);    }

    @Override
    public Rol update(Rol entity) throws Exception {
return rolRepository.save(entity);    }

    @Override
    public void delete(Rol entiry) throws Exception {
         rolRepository.delete(entiry);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
rolRepository.deleteById(integer);
    }

    @Override
    public void validate(Rol entity) throws Exception {

    }

    @Override
    public Long count() {
        return rolRepository.count();
    }

    @Override
    public String findNombreById(Integer id) {
        return rolRepository.findNombreById(id);
    }
}
