package com.project.TMS.Backend.dto;

import com.project.TMS.Backend.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {

    private String jwt;

    private Long userId;

    private UserRole userRole;

}
