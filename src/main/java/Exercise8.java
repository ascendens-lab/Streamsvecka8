import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Exercise8 {
    public void main(){

       String countrysLargerThan10000 = getCountries()
               .stream()
               .filter(land->land.area()>10000)
               .map(Streams.Country::countryName)
               .collect(Collectors.joining(", "));;

        String countrysLargerThan100000 = getCountries()
                .stream()
                .filter(land->land.area()>100000)
                .map(Streams.Country::countryName)
                .collect(Collectors.joining(", "));;

        String countrysLargerThan1000000 = getCountries()
                .stream()
                .filter(land->land.area()>1000000)
                .map(Streams.Country::countryName)
                .collect(Collectors.joining(", "));;

        IO.println("De här länderna har en area på mer än " + 10000  +" kvadratkilometer: " + countrysLargerThan10000);
        IO.println("De här länderna har en area på mer än " + 100000  +" kvadratkilometer: " + countrysLargerThan100000);
        IO.println("De här länderna har en area på mer än " + 1000000  +" kvadratkilometer: " + countrysLargerThan1000000);

       List<Streams.Country>  listaTioTusen= new ArrayList<>();
       List<Streams.Country>  listaHundraTusen = new ArrayList<>();
       List<Streams.Country>   listaEnMiljon = new ArrayList<>();

        for (int i = 0; i < getCountries().size(); i++){

           if (getCountries().get(i).area()> 10000){
            listaTioTusen.add(getCountries().get(i));
           }

           if (getCountries().get(i).area()> 100000){
               listaHundraTusen.add(getCountries().get(i));
           }
           if (getCountries().get(i).area()> 1000000){
               listaEnMiljon.add(getCountries().get(i));
           }

       }

        IO.println("****************************************");
        for (int i = 0; i < listaTioTusen.size(); i++)
        IO.print(listaTioTusen.get(i).countryName() + ", ");
        IO.println();

      for (int i = 0; i < listaHundraTusen.size(); i++)
          IO.print(listaHundraTusen.get(i).countryName() + ", ");
       IO.println();

       for (int i = 0; i < listaEnMiljon.size(); i++)
            IO.print(listaEnMiljon.get(i).countryName() + ", ");




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
