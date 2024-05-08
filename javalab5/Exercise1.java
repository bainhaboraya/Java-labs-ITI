import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();

        List<City> highestPopulatedCapitalCities = countryDao.findAllCountries()
                .stream()
                .map(Country::getCapital) // Map to capital cities
                .filter(city -> city != null)
                .collect(Collectors.groupingBy(
                        City::getCountryCode,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(City::getPopulation)),
                                Optional::get
                        )
                ))
                .values()
                .stream()
                .collect(Collectors.toList());

        highestPopulatedCapitalCities.forEach(System.out::println);
    }
}