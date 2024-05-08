import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();

        Map<String, City> highestPopulatedCitiesByContinent = countryDao.findAllCountries()
                .stream()
                .flatMap(country -> country.getCities().stream())
                .collect(Collectors.groupingBy(
                        city -> countryDao.findCountryByCode(city.getCountryCode()).getContinent(),
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(City::getPopulation)),
                                Optional::get
                        )
                ));

        highestPopulatedCitiesByContinent.values().forEach(System.out::println);
    }
}
