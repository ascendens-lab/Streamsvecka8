import java.util.List;

public class Exersicse9 {

    public void main(){



    }

    private List<Streams.Country> getCountries() {
        return List.of(
                new Streams.Country("Sverige", "Stockholm", 10.07, 450295),
                new Streams.Country("Norge", "Oslo", 5.27, 323802),
                new Streams.Country("Island", "Reykjavik", 0.33, 102775),
                new Streams.Country("Danmark", "Köpenhamn", 5.75, 42931),
                new Streams.Country("Finland", "Helsinki", 5.51, 338424),
                new Streams.Country("Belgien", "Bryssel", 11.30, 30528),
                new Streams.Country("Tyskland", "Berlin", 82.18, 357168),
                new Streams.Country("Frankrike", "Paris", 66.99, 640679),
                new Streams.Country("Storbritannien", "London", 60.80, 209331),
                new Streams.Country("Niue", "Alofi", 0.0016, 261),
                new Streams.Country("Mongoliet", "Ulan Batar", 3.08, 1566000),
                new Streams.Country("Polen", "Warszawa", 38.63, 312679),
                new Streams.Country("Spanien", "Madrid", 46.5, 505990),
                new Streams.Country("Portugal", "Lissabon", 10.31, 92212),
                new Streams.Country("Italien", "Rom", 60.59, 301338),
                new Streams.Country("Grekland", "Aten", 11.18, 131957),
                new Streams.Country("Luxemburg", "Luxemburg", 0.58, 2586),
                new Streams.Country("Liechtenstein", "Vaduz", 0.038, 160));
    }

    record Country (String countryName, String capital, double population, int area) {
    }
}

