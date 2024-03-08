package CaCMarcelaInsegna.ClubApi.Service;

import CaCMarcelaInsegna.ClubApi.Model.SociosClub;
import CaCMarcelaInsegna.ClubApi.Repository.SociosClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SociosClubService {

    @Autowired
    SociosClubRepository sociosClubRepository;

    //Metodo para mostrar la lista de todos los socios
    public List<SociosClub> totalSocios(){
        return sociosClubRepository.findAll();
    }

    //Metodo para crear un socio nuevo
    public void crearSocio(SociosClub sociosClub){
        sociosClubRepository.save(sociosClub);
    }

    //Metodo para buscar un socio por DNI (PK)
    public SociosClub buscarSocioDni(Long dni){
        return sociosClubRepository.findById(dni).orElse(null);
    }

    //Metodo para eliminar un socio

    public void eliminarSocio(Long dni){
        sociosClubRepository.deleteById(dni);
    }

    //Metodo para guardar cambios en los datos de los socios

    public SociosClub cambiosSocio (SociosClub sociosClub){
        sociosClubRepository.save(sociosClub);
        return sociosClubRepository.findById(sociosClub.getDni()).orElse(null);
    }

}
