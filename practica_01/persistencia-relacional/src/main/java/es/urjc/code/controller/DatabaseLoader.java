package es.urjc.code.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import es.urjc.code.entity.Aeropuerto;
import es.urjc.code.repository.AeropuertoRepository;
import es.urjc.code.repository.AvionRepository;
import es.urjc.code.repository.MecanicoRepository;
import es.urjc.code.repository.RevisionRepository;
import es.urjc.code.repository.TripulanteRepository;
import es.urjc.code.repository.VueloRepository;

public class DatabaseLoader implements CommandLineRunner{

	private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseLoader.class);
	
	@Autowired
	private AeropuertoRepository aeropuertoRepository;
	@Autowired
	private AvionRepository avionRepository;
	@Autowired
	private MecanicoRepository mecanicoRepository;
	@Autowired
	private RevisionRepository revisionRepository;
	@Autowired
	private TripulanteRepository tripulanteRepository;
	@Autowired
	private VueloRepository vueloRepository;
	
	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("---  Database loadr START");
		
		// Aeropuertos
		
		Aeropuerto aeropuertoAdolfoSuarez = new Aeropuerto("MAD", "Aeropuerto Adolfo Suárez Madrid-Barajas", "Madrid", "España");
		Aeropuerto aeropuertoSanPablo = new Aeropuerto("SVQ", "Aeropuerto San Pablo", "Sevilla", "España");
		Aeropuerto aeropuertoCuatroVientos = new Aeropuerto("MCV", "Cuatro Vientos", "Madrid", "España");
		Aeropuerto aeropuertoElPrat = new Aeropuerto("BCN", "Josep Tarradellas Barcelona-El Prat", "El Prat	", "España");
		
		aeropuertoRepository.save(aeropuertoAdolfoSuarez);
		aeropuertoRepository.save(aeropuertoSanPablo);
		aeropuertoRepository.save(aeropuertoCuatroVientos);
		aeropuertoRepository.save(aeropuertoElPrat);

	}

}
