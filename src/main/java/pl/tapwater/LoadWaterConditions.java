package pl.tapwater;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadWaterConditions {
    @Bean
    CommandLineRunner initDatabase(WaterConditionRepository waterConditionRepository){
        return args -> {
            log.info("Preloading" + waterConditionRepository.save(new WaterCondition("Gdańsk", 0, 0, 350, 190, 40, 0.4f, 30, false)));
            log.info("Preloading" + waterConditionRepository.save(new WaterCondition("Warszawa", 4, 5, 350, 500, 60, 0.55f, 100, false)));
            log.info("Preloading" + waterConditionRepository.save(new WaterCondition("Kraków", 1, 1, 350, 190, 55, 0.4f, 60, false)));
        };
    }
}