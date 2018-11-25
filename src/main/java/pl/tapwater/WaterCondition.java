package pl.tapwater;


import lombok.Data;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class WaterCondition {
    private @NonNull
    @Id
    @GeneratedValue
    Long id;
    private @NonNull
    String cityName;
    private @NonNull
    boolean isWaterSafeToDrink;

    private WaterCondition() {
    }

    public WaterCondition(String cityName, boolean isWaterSafeToDrink) {
        this.cityName = cityName;
        this.isWaterSafeToDrink = isWaterSafeToDrink;
    }
}
