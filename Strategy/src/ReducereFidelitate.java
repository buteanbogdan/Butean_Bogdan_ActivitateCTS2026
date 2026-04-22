public class ReducereFidelitate implements StrategieReducere {
    @Override
    public double calculeazaPretFinal(double pretInitial) {
        System.out.println("Status: Client VIP. Se aplica 15% reducere de fidelitate.");
        return pretInitial - (pretInitial * 0.15);
    }
}