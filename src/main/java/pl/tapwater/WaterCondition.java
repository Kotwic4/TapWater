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

    private int color;

    private int smell;

    private int hardness;

    private float iron;

    private float manganese;

    private float ammonia;

    private int bacteria;

    private boolean ecola;

    private WaterCondition() {
    }

    public WaterCondition(String cityName, int color, int smell, int hardness, float iron, float manganese, float ammonia, int bacteria, boolean ecola) {
        this.cityName = cityName;
        this.color = color;
        this.smell = smell;
        this.hardness = hardness;
        this.iron = iron;
        this.manganese = manganese;
        this.ammonia = ammonia;
        this.bacteria = bacteria;
        this.ecola = ecola;
    }
}
