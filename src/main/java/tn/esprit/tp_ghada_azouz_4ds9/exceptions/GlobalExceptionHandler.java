package tn.esprit.tp_ghada_azouz_4ds9.exceptions;


import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Pour attraper les erreurs de désérialisation JSON
    @ExceptionHandler(InvalidFormatException.class)
    public ResponseEntity<String> handleInvalidFormat(InvalidFormatException ex) {
        String fieldName = ex.getPath().get(0).getFieldName();
        String targetType = ex.getTargetType().getSimpleName();
        String message = "Le champ '" + fieldName + "' a une valeur invalide. Attendu : " + targetType;
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message + "\n" + ex.getOriginalMessage());
    }

    // Pour toutes les autres exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAll(Exception ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}