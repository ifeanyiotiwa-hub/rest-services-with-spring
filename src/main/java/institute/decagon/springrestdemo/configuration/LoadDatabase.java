package institute.decagon.springrestdemo.configuration;


import institute.decagon.springrestdemo.entity.Employee;
import institute.decagon.springrestdemo.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
        return args -> {
            log.info("Preloading......" + employeeRepository.save(new Employee("Bilboa baggins", "bugler")));
            log.info("Preloading......" + employeeRepository.save(new Employee("freddy baggins", "bugler")));
        };
    }
}
