package DTO;

import lombok.*;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString

public class RouteDTO { // а может ДТО добавлять?
        private Long id;
        private String name;
        private String startPoint;
        private List<IntermediatePointDTO> routeList;
        private String endPoint;
        private String userDTO;
    }
