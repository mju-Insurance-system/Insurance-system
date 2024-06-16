package domain.constants;

public enum EInsuranceType {
    DISEASE_INSURANCE("질병보험"),
    FIRE_INSURANCE("화재보험"),
    VEHICLE_INSURANCE("자동차보험"),
    INJURY_INSURANCE("상해보험");

    private final String name;

    EInsuranceType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
