package demo.sealed;

public class Demo {

    public static void main(final String[] args) {

        final CarEngine engine = new ElectricEngine();

        final String emissions = switch (engine) {
            case InternalCombustionEngine i && i.co2Emissions() < 110 -> "Low CO\u2082 Emissions";
            case InternalCombustionEngine ignored -> "High CO\u2082 Emissions";
            case ElectricEngine ignored -> "No CO\u2082 Emissions";
        };

        System.out.println(emissions);
        
    }
}
