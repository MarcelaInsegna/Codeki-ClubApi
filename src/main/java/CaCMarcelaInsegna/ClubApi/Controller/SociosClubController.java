package CaCMarcelaInsegna.ClubApi.Controller;

import CaCMarcelaInsegna.ClubApi.Model.SociosClub;
import CaCMarcelaInsegna.ClubApi.Service.SociosClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/socios")

public class SociosClubController {

    @Autowired
    SociosClubService sociosClubService;

    @GetMapping ("")
    public List <SociosClub> totalSociosClub(){
        return sociosClubService.totalSocios();
    }

    @PostMapping("/crear")
    public void crearSocioNuevo(@RequestBody SociosClub sociosClub){
        sociosClubService.crearSocio(sociosClub);
    }

    @GetMapping("/{dni}")
    public SociosClub encontrarPorDni(@PathVariable Long dni){
        return sociosClubService.buscarSocioDni(dni);
    }

    @DeleteMapping("/eliminar/{dni}")
    public void eliminarSocio(@PathVariable Long dni){
        sociosClubService.eliminarSocio(dni);
    }

    @PutMapping("/guardarCambios")
    public SociosClub guardiaCambioSocio (@RequestBody SociosClub sociosClub){
        return sociosClubService.cambiosSocio(sociosClub);
    }


}
