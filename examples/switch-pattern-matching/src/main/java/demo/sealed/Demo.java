package demo.sealed;

public class Demo {

    public static void main(final String[] args) {
        final CarEngine engine = new ElectricEngine();

        final String emissions = switch (engine) {
            case InternalCombustionEngine i && i.co2Emissions() < 110 -> "Low CO2 Emissions";
            case InternalCombustionEngine ignored -> "High CO2 Emissions";
            case ElectricEngine ignored -> "No CO2 Emissions";
        };

        System.out.println(emissions);
    }
}
