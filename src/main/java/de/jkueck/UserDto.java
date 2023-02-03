package de.jkueck;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private long id;

    private String firstname;

    private String lastname;

    private String email;

    private List<UserSettingDto> userSettings = new ArrayList<>();

    private RoleDto role;

}
