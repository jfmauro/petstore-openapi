package be.petstoreapifirst.pet.api;



import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/demands")
@Slf4j
public class DemandController {

    private static Logger logger = LoggerFactory.getLogger(DemandController.class);

    @GetMapping
    public ResponseEntity<String> createRequest() {
        return new ResponseEntity("bonjour", HttpStatus.OK);
    }

}
