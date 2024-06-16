package domain.constants;

public enum EVehicleType {
    소형차,
    중형차,
    이륜차,
    중장비,
    운전자;

    @Override
    public String toString() {
        return name();
    }
}
