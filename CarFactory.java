public class CarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
        case AUTOMATIC:
            car = new Automatic();
            break;
 
        case MANUAL:
            car = new Manual();
            break;
 
        case TESLA:
            car = new Tesla();
            break;
 
        default:
            // throw some exception
            break;
        }
        return car;
    }
}