package pl.tapwater;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WaterConditionRepository extends JpaRepository<WaterCondition,Long> {
    Optional<WaterCondition> findOneByCityName(String cityName);
}
