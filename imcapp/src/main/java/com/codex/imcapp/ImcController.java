package com.codex.imcapp;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@AllArgsConstructor
@RestController
@RequestMapping(path = "imc" , consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class ImcController {

    private ImcService imcService;


    @PostMapping("/calculate")
    public @ResponseBody Map<String , String> calculate (@RequestBody ImcDTO data) {
        return imcService.calculate(data);
    }
    @GetMapping("")
    public ResponseEntity<String> home (){
        String homeText = "Bienvenue à au calcul de l'indice de masse corporelle";
        return ResponseEntity.ok(homeText);
    }

}
