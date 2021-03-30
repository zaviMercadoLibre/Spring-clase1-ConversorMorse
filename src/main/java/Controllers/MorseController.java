package Controllers;

import MorseConverter.MorseConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MorseController {

    @GetMapping("/converter/{word}")
    public String morseTraductor(@PathVariable() String word){
        return MorseConverter.morseConverter(word);
    }
}
