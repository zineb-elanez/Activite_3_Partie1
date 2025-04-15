package ma.zineb.hospital;

import ma.zineb.hospital.entities.Patient;
import ma.zineb.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository; // avec minuscule
    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    /*    Patient patient = new Patient();
        patient.setId(null);
        patient.setNom("anas");
        patient.setDateNaissance(new Date());
        patient.setScore(23);

        Patient patient2=new Patient(null,"zineb", new Date(), false, 123);

        Patient patient3=Patient.builder().nom("alaa")
                .dateNaissance(new Date())
                .score(56)
                .malade(true).build();

*/

        patientRepository.save(new Patient(null,"anas",new Date(),false,34));
        patientRepository.save(new Patient(null,"zineb",new Date(),false,4321));
        patientRepository.save(new Patient(null,"imane",new Date(),true,34));


    }
}