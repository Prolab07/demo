package entity;

import java.util.Objects;

public class IntermediatePoint { // наверное здесь нужно было использовать бины... пересмотреть в старт поинт по другому написано
    private Long id;
    private String country;
    private String city;

    public IntermediatePoint(Long id, String country, String city) {
        this.id = id;
        this.country = country;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

        IntermediatePoint that = (IntermediatePoint) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(country, that.country)) return false;
        return Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "IntermediatePoint{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
