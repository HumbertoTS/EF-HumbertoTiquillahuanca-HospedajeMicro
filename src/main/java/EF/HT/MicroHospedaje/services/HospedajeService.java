package EF.HT.MicroHospedaje.services;

import java.util.List;

import EF.HT.MicroHospedaje.DTO.HospedajeDTO;



public interface HospedajeService {
  List<HospedajeDTO> listar();
  void guardar(HospedajeDTO hospedaje);
}
