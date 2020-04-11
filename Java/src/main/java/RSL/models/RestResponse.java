package RSL.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class RestResponse <T> {

    private HttpStatus status;

    private String message;

    private T body;

}
