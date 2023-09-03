package com.BloodBank.Management.Service;

import com.BloodBank.Management.DTO.AddUserDTO;
import com.BloodBank.Management.Entity.ManagementEntity;
import com.BloodBank.Management.Repository.ManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface ManagementService {


    public ManagementEntity addUser(AddUserDTO adduser);

    public ManagementEntity ManageById(Integer ID);

    public List<ManagementEntity> ManageDetails();

}



