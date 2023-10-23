package DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString

public class EndPointDTO {
        private Long id;//может здесь не нужно, но нужно в промежуточных остановках
        private String country;
        private String city;
        private RouteDTO route;
}
