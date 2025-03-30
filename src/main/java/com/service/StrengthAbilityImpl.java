package com.service;

import org.springframework.stereotype.Service;

@Service
public class StrengthAbilityImpl implements StrengthAbility{

	@Override
	public String getAbility() {
		return "Strength";
		
	}

}
