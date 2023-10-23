package DTO;
import lombok.*;
import java.util.List;

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Getter
    @Setter
    @ToString
    public class UserDTO {

        private Long id;
        private String email;
        private String name;
        private List<RoleDTO> roleList;
        private List<RouteDTO> routeList;
        private List<FavouritesDTO> favouritesList;
        private List<ReviewsDTO> reviewsDTOList;

        /*
        private RouteDTO route; //and here
        private FavouritesDTO favourites;// или лист. ведь их
        private ReviewsDTO reviews;// и тут лист?...
         */
    }
