package com.BloodBank.Management.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectResponse
{
    private Integer code;
    private String message;
    private Object data;
    private Object CustomerID ;
}