package DTO;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class IntermediatePointDTO {
        private Long id;
        private String country;
        private String city;
        private RouteDTO route;
    //как-то по должно добавляться в табличку Маршрут, потому что их много
}
