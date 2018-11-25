package pl.tapwater;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "watercondition not found", value = HttpStatus.NOT_FOUND)
public class WaterConditionNotFindException extends RuntimeException {
}
