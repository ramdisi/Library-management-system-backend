package org.openSourceLibrarySystem.service;

import org.openSourceLibrarySystem.model.dto.UserDTO;
import org.openSourceLibrarySystem.model.entity.UserEntity;
import org.openSourceLibrarySystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void save(UserDTO userDTO){
        userRepository.save(new UserEntity(userDTO.getUserId(),
                userDTO.getName(),
                userDTO.getEmail(),
                userDTO.getPhone(),
                userDTO.getAddress(),
                userDTO.getMembershipDate()));
    }

    public UserDTO getDetails(String id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow();
        return new UserDTO(userEntity.getUserId(),
                userEntity.getName(),
                userEntity.getEmail(),
                userEntity.getPhone(),
                userEntity.getAddress(),
                userEntity.getMembershipDate());
    }
}
