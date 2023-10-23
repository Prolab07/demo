package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder(toBuilder=true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "route", schema = "travel_program")
@Component
@Scope("prototype")

public class Route implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        // может юзера из класа юзера
        // и класи роинт - они класи или колонки . а может они филды для роут без класов или с класами.
        // и сити и каунтри это класы или просто колонки для ручного ввода

        @ManyToMany
        @JoinTable(
                name = "start_point", schema = "travel_program",
                joinColumns = {
                        @JoinColumn(
                                name = "country_id",
                                nullable = false
                        )
                },
                inverseJoinColumns = {
                        @JoinColumn(
                                name = "city_id",
                                nullable = false
                        )
                }

        )
        @JsonIgnore
        private List<StartPoint> startPoints = new ArrayList<>();

        @ManyToMany
        @JoinTable(
                name = "intermediate_point", schema = "travel_program",
                joinColumns = {
                        @JoinColumn(
                                name = "country_id",
                                nullable = false
                        )
                },
                inverseJoinColumns = {
                        @JoinColumn(
                                name = "city_id",
                                nullable = false
                        )
                }

        )
        @JsonIgnore
        private List<IntermediatePoint> intermediatePoints = new ArrayList<>();

        @ManyToMany
        @JoinTable(
                name = "end_point", schema = "travel_program",
                joinColumns = {
                        @JoinColumn(
                                name = "country_id",
                                nullable = false
                        )
                },
                inverseJoinColumns = {
                        @JoinColumn(
                                name = "city_id",
                                nullable = false
                        )
                }

        )
        @JsonIgnore
        private List<EndPoint> endPoints = new ArrayList<>();
        //доработать
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "route_id")
        private Route route;

        @OneToMany(mappedBy = "route")
        private List<User> users = new ArrayList<>();
    }

