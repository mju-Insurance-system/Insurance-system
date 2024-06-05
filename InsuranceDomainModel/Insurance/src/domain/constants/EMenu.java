package domain.constants;

public enum EMenu {
    LOG_IN("�α���"),
    LOG_OUT("�α׾ƿ�"),
    SIGN_UP("ȸ������"),
    SHOW_INSURANCE_LIST("��ü ������ ����"),
    SHOW_APPLICATION_LIST("���谡�� ��û��� ����"),
    EXAMINE_APPLICATION("���谡�� �ɻ��ϱ�"),
    SHOW_MEMBERSHIP_INFO("ȸ������ ����")
    ;


    private final String menuName;

    EMenu(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuName() {
        return menuName;
    }
}