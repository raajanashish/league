package com.league.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.league.dtos.StandingDto;
import com.league.entity.Standing;
@Service
public class StandingMapper {
	public  static ModelMapper mapper = new ModelMapper();

	public StandingDto convertToDto(Standing entity) {
		return mapper.map(entity, StandingDto.class);
	}
}
