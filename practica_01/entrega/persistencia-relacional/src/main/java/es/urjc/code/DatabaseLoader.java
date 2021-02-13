package es.urjc.code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import es.urjc.code.entity.Aeropuerto;
import es.urjc.code.entity.Avion;
import es.urjc.code.entity.Mecanico;
import es.urjc.code.entity.Revision;
import es.urjc.code.entity.Tripulante;
import es.urjc.code.entity.TripulanteVuelo;
import es.urjc.code.entity.Vuelo;
import es.urjc.code.repository.AeropuertoRepository;
import es.urjc.code.repository.AvionRepository;
import es.urjc.code.repository.MecanicoRepository;
import es.urjc.code.repository.RevisionRepository;
import es.urjc.code.repository.TripulanteRepository;
import es.urjc.code.repository.VueloRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

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

		System.out.println("INICIO CARGA DE DATOS");


		cargaDatosRepositorios();

		consultasBasicas();

		consultas();
	}

	private void cargaDatosRepositorios() throws ParseException {

		// Datos

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date fechaVuelo1 = sdf.parse("2000-01-01 10:00:00");
		Date fechaVuelo2 = sdf.parse("2000-01-01 12:00:00");
		Date fechaVuelo3 = sdf.parse("2000-01-01 14:00:00");
		Date fechaRevision1 = sdf.parse("2000-01-01 10:00:00");
		Date fechaRevision2 = sdf.parse("2000-01-02 10:00:00");
		Date fechaRevision3 = sdf.parse("2000-01-03 10:00:00");

		Aeropuerto aeropuertoAdolfoSuarez = new Aeropuerto("MAD", "Aeropuerto Adolfo Suárez Madrid-Barajas", "Madrid",
				"España");
		Aeropuerto aeropuertoSanPablo = new Aeropuerto("SVQ", "Aeropuerto San Pablo", "Sevilla", "España");
		Aeropuerto aeropuertoCuatroVientos = new Aeropuerto("MCV", "Cuatro Vientos", "Madrid", "España");
		Aeropuerto aeropuertoElPrat = new Aeropuerto("BCN", "Josep Tarradellas Barcelona-El Prat", "El Prat	",
				"España");

		aeropuertoRepository.save(aeropuertoAdolfoSuarez);
		aeropuertoRepository.save(aeropuertoSanPablo);
		aeropuertoRepository.save(aeropuertoCuatroVientos);
		aeropuertoRepository.save(aeropuertoElPrat);

		Avion boeing737 = new Avion("YA-KMJ", "BOEING", "B737", 1492.00);
		Avion boeing787 = new Avion("VH-ZNA", "BOEING", "B787", 1777.00);
		Avion boeing737Ng = new Avion("VH-VUQ", "BOEING", "B737NG", 1234.00);

		avionRepository.save(boeing737);
		avionRepository.save(boeing787);
		avionRepository.save(boeing737Ng);

		Tripulante tripulanteIberia = new Tripulante("TRIP01", "JESUS", "DEL TORO MATIAS", "COMANDANTE", "IBERIA");
		Tripulante tripulanteAirEuropa = new Tripulante("TRIP02", "JESUS", "DEL TORO MATIAS", "CO-PILOTO", "AIREUROPA");
		Tripulante tripulanteVueling = new Tripulante("TRIP03", "JESUS", "DEL TORO MATIAS", "SOBRECARGO", "VUELING");

		Vuelo vueloIberia = new Vuelo("IB01", "IBERIA", boeing737, aeropuertoAdolfoSuarez, aeropuertoSanPablo,
				fechaVuelo1, 2.0);
		Vuelo vueloAirEuropa = new Vuelo("AE01", "AIREUROPA", boeing787, aeropuertoCuatroVientos, aeropuertoElPrat,
				fechaVuelo2, 3.0);
		Vuelo vueloVueling = new Vuelo("VU01", "VUELING", boeing737Ng, aeropuertoSanPablo, aeropuertoElPrat,
				fechaVuelo3, 5.0);
		
		Mecanico mecanicoIberia = new Mecanico("MEC01", "JOSE", "MORILLAS DEL CAMPO", "IBERIA", 1999, "FP ELECTRONICA");
		Mecanico mecanicoAirEuropa = new Mecanico("MEC02", "AURORA", "CARO SAN JUAN", "AIREUROPA", 2000,
				"FP ELECTRONICA");
		Mecanico mecanicoVueling = new Mecanico("MEC03", "PAULA", "HOLGUIN CUERVO", "VUELING", 2001, "FP ELECTRONICA");

		mecanicoRepository.save(mecanicoIberia);
		mecanicoRepository.save(mecanicoAirEuropa);
		mecanicoRepository.save(mecanicoVueling);

		Revision revisionBoeing737 = new Revision(boeing737, fechaRevision1, fechaRevision2, 24, mecanicoIberia,
				"PERIODICA", "REVISION PERIODICA", aeropuertoAdolfoSuarez);
		Revision revisionBoeing787 = new Revision(boeing787, fechaRevision1, fechaRevision3, 48, mecanicoAirEuropa,
				"REPARACION", "REPARACION TROCOLA", aeropuertoCuatroVientos);
		Revision revisionBoeing737Ng = new Revision(boeing737Ng, fechaRevision2, fechaRevision3, 24, mecanicoVueling,
				"REPARACION", "REPARACION FILTROCIDIO", aeropuertoSanPablo);

		revisionRepository.save(revisionBoeing737);
		revisionRepository.save(revisionBoeing787);
		revisionRepository.save(revisionBoeing737Ng);

		TripulanteVuelo tripulanteVueloIberia = new TripulanteVuelo(tripulanteIberia, vueloIberia);
		TripulanteVuelo tripulanteVueloAirEuropa = new TripulanteVuelo(tripulanteAirEuropa, vueloAirEuropa);
		TripulanteVuelo tripulanteVueloVueling = new TripulanteVuelo(tripulanteVueling, vueloVueling);

		vueloIberia.setTripulacion(Arrays.asList(tripulanteVueloIberia));
		vueloAirEuropa.setTripulacion(Arrays.asList(tripulanteVueloAirEuropa));
		vueloVueling.setTripulacion(Arrays.asList(tripulanteVueloVueling));

		vueloRepository.save(vueloIberia);
		vueloRepository.save(vueloAirEuropa);
		vueloRepository.save(vueloVueling);

		System.out.println("FIN CARGA DE DATOS");
	}

	private void consultasBasicas() {
		List<Aeropuerto> aeropuertos = aeropuertoRepository.findAll();
		List<Mecanico> mecanicos = mecanicoRepository.findAll();
		List<Avion> aviones = avionRepository.findAll();
		List<Tripulante> tripulantes = tripulanteRepository.findAll();
		List<Revision> revisiones = revisionRepository.findAll();

		muestraDatos(aeropuertos);
		muestraDatos(mecanicos);
		muestraDatos(aviones);
		muestraDatos(tripulantes);
		muestraDatos(revisiones);
	}

	private void consultas() {
		/*
		 * • Para cada avión, mostrar el nombre y apellidos de los mecánicos
		 * responsables de sus revisiones. • Dado el nombre de una ciudad y una fecha,
		 * listado de los vuelos que han aterrizado (destino) en los aeropuertos de esa
		 * ciudad en esa fecha, ordenados por hora. • Dado el código de empleado de un
		 * tripulante, mostrar su nombre y apellidos y las ciudades desde las que ha
		 * despegado junto con la fecha en que despegó. • Para cada tripulante, mostrar
		 * su nombre y apellidos junto con su número total de vuelos y la suma de horas
		 * de estos.
		 */
	}

	private static void muestraDatos(@SuppressWarnings("rawtypes") List datos) {
		for (Object p : datos) {
			System.out.println(p);
		}
		System.out.println();
	}
}
