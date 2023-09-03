package com.BloodBank.Management.Service.impl;

import com.BloodBank.Management.DTO.AddUserDTO;
import com.BloodBank.Management.Entity.ManagementEntity;
import com.BloodBank.Management.Repository.ManagementRepository;
import com.BloodBank.Management.Service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ManagementServiceImpl implements ManagementService {
    @Autowired
    ManagementRepository managementRepository;

    private static int ManagementID = 1;

    public ManagementEntity addUser(AddUserDTO adduser) {
        ManagementEntity userdetails = ManagementEntity.builder()
                .Id(ManagementID)
                .Date_Of_Birth(adduser.getDate_Of_Birth())
                .name(adduser.getName())
                .Occupation(adduser.getOccupation())
                .build();
        managementRepository.save(userdetails);
        ManagementID++;
        return ManagementEntity.builder()
                .Id(userdetails.getId())
                .name(userdetails.getName())
                .Date_Of_Birth(userdetails.getDate_Of_Birth())
                .Occupation(userdetails.getOccupation())
                .build();
    }
    public ManagementEntity ManageById(Integer ID)
    {
        return managementRepository.findById(ID).get();
    }
    public List<ManagementEntity> ManageDetails()
    {
        return managementRepository.findAll();
    }
}



