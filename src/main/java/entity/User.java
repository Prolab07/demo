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
@Table(name = "users", schema = "travel_program")
@Component
@Scope("prototype")

public class User implements Serializable{
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            //@Column - колонки, якщо треба додаткова валидация
            private Long id;
            private String email;
            private String name;
            private String password;
            @ManyToMany
            @JoinTable(
                    name = "user_roles", schema = "travel_program",
                    joinColumns = {
                            @JoinColumn(
                                    name = "user_id",
                                    nullable = false
                            )
                    },
                    inverseJoinColumns = {
                            @JoinColumn(
                                    name = "role_id",
                                    nullable = false
                            )
                    }

            )
            @JsonIgnore
            private List<Role> roleList = new ArrayList<>();
//нужна ли эта связь? да, но она дожна быть в класе юзер - один юзер много маршрутов
            @ManyToOne(fetch = FetchType.LAZY)
            @JoinColumn(name = "route_id")
            private Route route;
        }
/* это для юзера сделать// поменять местами этот кусок кода
    @OneToMany(mappedBy = "department")
    private List<User> users = new ArrayList<>();

    это для роуте
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;
//СДЕСЬ СДЕЛАТЬ ван ТУ МЕНИ К ДРУГИМ ЕНТИТИ - фейорити и рекомендации
 */

