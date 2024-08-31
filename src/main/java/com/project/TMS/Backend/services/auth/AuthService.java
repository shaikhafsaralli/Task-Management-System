package com.project.TMS.Backend.services.auth;

import com.project.TMS.Backend.dto.SignupRequest;
import com.project.TMS.Backend.dto.UserDto;

public interface AuthService {

    UserDto signupUser(SignupRequest signupRequest);

    boolean hasUserWithEmail(String email);

}
