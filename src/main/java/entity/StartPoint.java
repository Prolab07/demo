package entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

public class StartPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // убрать здесь аиди или добавить всем поинтам?
    private String country;
    private String city;

    public StartPoint(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StartPoint that = (StartPoint) o;

        if (!Objects.equals(country, that.country)) return false;
        return Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        int result = country != null ? country.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StartPoint{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
    //нужна колекция? может в классе маршрут?
}



