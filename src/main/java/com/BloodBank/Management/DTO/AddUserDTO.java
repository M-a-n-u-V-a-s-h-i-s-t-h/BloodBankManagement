package com.BloodBank.Management.DTO;
import com.BloodBank.Management.Entity.ManagementEntity;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class AddUserDTO {

        String Name;
        String Date_Of_Birth;
        String Occupation;
    }

