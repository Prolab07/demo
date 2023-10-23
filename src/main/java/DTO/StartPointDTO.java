package DTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class StartPointDTO {
    private Long id;
    private String country;
    private String city;
    private RouteDTO route;


    //если сделать ентити стити и каунтри. то сдесь будут листы
}