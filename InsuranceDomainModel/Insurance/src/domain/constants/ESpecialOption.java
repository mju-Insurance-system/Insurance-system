package domain.constants;

public enum ESpecialOption {
    진단보험금,
    수술비,
    연금,
    형사합의금;

    @Override
    public String toString() {
        return name();
    }
}
