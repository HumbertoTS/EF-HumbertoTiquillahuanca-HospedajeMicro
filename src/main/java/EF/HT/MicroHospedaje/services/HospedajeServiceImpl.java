package EF.HT.MicroHospedaje.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EF.HT.MicroHospedaje.DTO.HospedajeDTO;
import EF.HT.MicroHospedaje.models.Hospedaje;
import EF.HT.MicroHospedaje.repository.HospedajeRepository;



@Service
public class HospedajeServiceImpl implements HospedajeService {

  @Autowired
  private HospedajeRepository repository;
  

  @Override
  public List<HospedajeDTO> listar() {
    List<HospedajeDTO> lista = new ArrayList<>();
    HospedajeDTO dto = null;

    for (Hospedaje hospedaje : repository.findAll()) {
      dto = new HospedajeDTO();
      dto.setCodigo(hospedaje.getIdHospedaje());
      dto.setNombre(hospedaje.getNombre());
      lista.add(dto);
    }

    return lista;
  }

  @Override
  public void guardar(HospedajeDTO hospedaje) {
    Hospedaje obj = new Hospedaje();
    obj.setIdHospedaje(obj.getIdHospedaje());
    obj.setNombre(obj.getNombre());
    repository.save(obj);
    
  }
  
}
