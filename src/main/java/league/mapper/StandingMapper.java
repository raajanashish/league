package league.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import league.dtos.StandingDto;
import league.entity.Standing;
@Service
public class StandingMapper {
	public  static ModelMapper mapper = new ModelMapper();

	public StandingDto convertToDto(Standing entity) {
		return mapper.map(entity, StandingDto.class);
	}
}
