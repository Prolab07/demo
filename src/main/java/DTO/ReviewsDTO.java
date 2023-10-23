package DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString

public class ReviewsDTO {
    private Long id;
    private UserDTO userDTO;
    private RouteDTO routeDTO;
    private String text; // как это реализовать, обьект? соут, введите текст как делали что-то подобное в джавакоре?? посмотреть код jpa dto
}
