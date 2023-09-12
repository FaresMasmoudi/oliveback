package com.crns.huileolive.mapper;

import java.util.List;
import java.util.Optional;

import com.crns.huileolive.dto.*;
import com.crns.huileolive.entities.*;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AppMapper {

	private ModelMapper mapper = new ModelMapper();

	public MoulinageDto mapMoulinage(Moulinage entity) {
		MoulinageDto dto = mapper.map(entity, MoulinageDto.class);
		dto.setMoulin(mapMoulin(entity.getMoulin()));
		dto.setLotOlives(mapLotOlive(entity.getLotolives()));
		Optional<Variete> lotolives = entity.getLotolives().stream().map(o -> o.getVariete()).findAny();
		if (lotolives.isPresent())
			dto.setVariete(lotolives.get().name());
		return dto;
	}

	public List<MoulinageDto> mapMoulinages(List<Moulinage> entities) {
		return entities.stream().map(o -> mapMoulinage(o)).toList();
	}

	public Lotolive mapLotolive(LotoliveDto dto) {
		Lotolive entity = mapper.map(dto, Lotolive.class);
		return entity;
	}

	public List<LotoliveDto> mapLotOlive(List<Lotolive> entities) {
		return entities.stream().map(o -> mapLotOlive(o)).toList();
	}

	public LotoliveDto mapLotOlive(Lotolive entity) {
		LotoliveDto dto = mapper.map(entity, LotoliveDto.class);
		return dto;
	}

	public MoulinDto mapMoulin(Moulin entity) {
		MoulinDto dto = mapper.map(entity, MoulinDto.class);
		return dto;
	}

	public Moulin mapMoulin(MoulinDto dto) {
		Moulin entity = mapper.map(dto, Moulin.class);
		return entity;
	}

	public List<MoulinDto> mapMoulin(List<Moulin> entities) {
		return entities.stream().map(o -> mapMoulin(o)).toList();
	}

	//////////////////////////////////////////////////////////////////////////////////////

	public BergerDto mapBerger(Berger entity) {
		BergerDto dto = mapper.map(entity, BergerDto.class);
		return dto;
	}

	public Berger mapBerger(BergerDto dto) {
		Berger entity = mapper.map(dto, Berger.class);
		return entity;
	}
	public List<BergerDto> mapBerger(List<Berger> entities) {
		return entities.stream().map(o -> mapBerger(o)).toList();
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public CiterneDto mapCiterne(Citerne entity) {
		CiterneDto dto = mapper.map(entity, CiterneDto.class);
		return dto;
	}

	public Citerne mapCiterne(CiterneDto dto) {
		Citerne entity = mapper.map(dto, Citerne.class);
		return entity;
	}
	public List<CiterneDto> mapCiterne(List<Citerne> entities) {
		return entities.stream().map(o -> mapCiterne(o)).toList();
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public LothuileDto mapLothuile(Lothuile entity) {
		LothuileDto dto = mapper.map(entity, LothuileDto.class);
		return dto;
	}

	public Lothuile mapLothuile(LothuileDto dto) {
		Lothuile entity = mapper.map(dto, Lothuile.class);
		return entity;
	}
	public List<LothuileDto> mapLothuile(List<Lothuile> entities) {
		return entities.stream().map(o -> mapLothuile(o)).toList();
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public RecipientDto mapRecipient(Recipient entity) {
		RecipientDto dto = mapper.map(entity, RecipientDto.class);
		return dto;
	}

	public Recipient mapRecipient(RecipientDto dto) {
		Recipient entity = mapper.map(dto, Recipient.class);
		return entity;
	}
	public List<RecipientDto> mapRecipient(List<Recipient> entities) {
		return entities.stream().map(o -> mapRecipient(o)).toList();
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public SolvantDto mapSolvant(Solvant entity) {
		SolvantDto dto = mapper.map(entity, SolvantDto.class);
		return dto;
	}

	public Solvant mapSolvant(SolvantDto dto) {
		Solvant entity = mapper.map(dto, Solvant.class);
		return entity;
	}
	public List<SolvantDto> mapSolvant(List<Solvant> entities) {
		return entities.stream().map(o -> mapSolvant(o)).toList();
	}
}
