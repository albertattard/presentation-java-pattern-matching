package demo.sealed;

public sealed interface CarEngine permits InternalCombustionEngine, ElectricEngine {
}
