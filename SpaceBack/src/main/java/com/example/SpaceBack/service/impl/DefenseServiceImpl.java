package com.example.SpaceBack.service.impl;

import com.example.SpaceBack.dto.DefenseComponentDTO;
import com.example.SpaceBack.dto.DefenseDataDTO;
import com.example.SpaceBack.repository.DefenseRepository;
import com.example.SpaceBack.service.DefenseService;
import com.example.SpaceBack.service.mapper.DefenseMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DefenseServiceImpl implements DefenseService {

    private final DefenseRepository defenseRepository;

    public DefenseServiceImpl(DefenseRepository defenseRepository) {
        this.defenseRepository = defenseRepository;
    }

    @Override
    public DefenseComponentDTO getDefenseComponentDTOByPlanetCoordinates(int coordinateX, int coordinateY) {
        // bonus : pagination ? comment gérer une pagination qui n'est pas top level
        // but : renvoyer DefenseComponentDTO donc récupérer Set<DefensePlayerDTO> + Set<QueueItemDTO>
        // 1) récupérer Set<DefensePlayerDTO>
        // a) db renvoie set<planetdefense>
        // b) on map en dto
        return null;
    }

    @Override
    public Optional<DefenseDataDTO> getDefenseByName(String name) {
        // TODO refact for ExceptionDTO if empty ?
        return defenseRepository.findDefenseByName(name).map(DefenseMapper.INSTANCE_DEFENSE::defenseToDefenseDataDTO);
    }

    @Override
    public Page<DefenseDataDTO> getAllDefenses(Pageable pageable) {
        return defenseRepository.findAll(pageable).map(DefenseMapper.INSTANCE_DEFENSE::defenseToDefenseDataDTO);
    }
}
