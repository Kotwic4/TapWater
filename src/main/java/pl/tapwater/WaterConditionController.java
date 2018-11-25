package pl.tapwater;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/water-condition")
public class WaterConditionController {
    @Autowired
    WaterConditionRepository waterConditionRepository;

    @GetMapping
    public List<WaterCondition> getAllWaterConditions() {
        return waterConditionRepository.findAll();
    }

    @GetMapping("/cityName/{cityName}")
    public WaterCondition getWaterConditionByCityName(@PathVariable("cityName") String cityName) {
        return waterConditionRepository.findOneByCityName(cityName).orElseThrow(WaterConditionNotFindException::new);
    }

    @GetMapping("/id/{id}")
    public WaterCondition getWaterConditionById(@PathVariable("id") Long id) {
        return waterConditionRepository.findById(id).orElseThrow(WaterConditionNotFindException::new);
    }

    @PostMapping
    public WaterCondition saveWaterCondition(@RequestBody WaterCondition waterCondition) {
        return  waterConditionRepository.save(waterCondition);
    }

    @PutMapping ("/id")
    public WaterCondition updateWaterCondition(@PathVariable("id") Long id, WaterCondition waterCondition) {
        waterCondition.setId(id);
        return waterConditionRepository.save(waterCondition);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        waterConditionRepository.deleteById(id);
    }
}
