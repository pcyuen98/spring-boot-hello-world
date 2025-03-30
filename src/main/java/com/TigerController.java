package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.StrengthAbility;

@RestController
public class TigerController {

	@Autowired
	private StrengthAbility strengthAbility;
	
    @GetMapping("/tiger")
    public String greet() {
        return strengthAbility.getAbility();
    }
}
