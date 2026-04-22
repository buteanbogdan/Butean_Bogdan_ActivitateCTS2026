public class ReducereBlackFriday implements StrategieReducere {
    @Override
    public double calculeazaPretFinal(double pretInitial) {
        System.out.println("Status: Promotie Black Friday! Se aplica 30% reducere.");
        return pretInitial - (pretInitial * 0.30);
    }
}