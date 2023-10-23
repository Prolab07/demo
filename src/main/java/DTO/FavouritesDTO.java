package DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString

public class FavouritesDTO {
    private Long id;
    private UserDTO userDTO;
    private RouteDTO routeDTO; // или ентити?
}
