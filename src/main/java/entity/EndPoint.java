package entity;

import java.util.Objects;

public class EndPoint {
    /* endpoint id нужен? и где? тут или в роут. тобишь, есть колекция endpointов и храниться и доставаться они должны
   по индексу или id. или должен ложить в колекцию в класе роут по id?
     */
    private String country;
    private String city;

    public EndPoint(String country, String city) {
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

        EndPoint that = (EndPoint) o;

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
        return "EndPoint{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
    //нужна колекция? может в классе маршрут?
}
