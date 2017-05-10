
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zdzibson on 2017-05-10.
 */
public class FleetManager {
    //adding single cars

    Car FirstCar = new Car("Mazda", 15000, 122000, "Matthew", "KR1234", 99.00, 99.00);
    Bus FirstBus = new Bus("Volvo", 30000, 250000, "Tommy", "KR3345", 50.00, 60.00);
    Lorry FirstLorry = new Lorry("Man", 50000, 300000, "Gerard", "KR8963", 143.00, 155.00);
    Lorry SecondLorry = new Lorry("Man", 55000, 290000, "Gary", "KR7654", 100.00, 60.00);

    List<GettersAndSetters> vehiclesList = new ArrayList<>();                                 // makes a list of all vehicles
    vehiclesList.add(FirstCar)

}
