public class FaraReducere implements StrategieReducere {
    @Override
    public double calculeazaPretFinal(double pretInitial) {
        System.out.println("Status: Client standard. Nu se aplica nicio reducere.");
        return pretInitial;
    }
}