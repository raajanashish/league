package league.mapper;

import org.modelmapper.ModelMapper;

import league.dtos.StandingDto;
import league.entity.Standing;

public class StandingMapper {
	private static ModelMapper mapper = new ModelMapper();

	public StandingDto convertToDto(Standing entity) {
		return mapper.map(entity, StandingDto.class);
	}
}
