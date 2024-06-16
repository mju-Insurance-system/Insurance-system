package domain.constants;

public enum EMenu implements Selectable{
    EXIT("프로그램 종료"),
    LOG_IN("로그인"),
    LOG_OUT("로그아웃"),
    SIGN_UP("회원가입"),
    SHOW_INSURANCE_LIST("보험 목록 보기"),
    SHOW_SUBSCRIPTION_LIST("계약목록 보기"),
    SHOW_USER_INFO("회원 정보 보기"),
    CUSTOMER_SIGN_UP("고객"),
    STAFF_SIGN_UP("직원"),
    DESIGN_INSURANCE("보험상품 설계"),
    SHOW_USER_INFO_LIST("사용자 목록 보기");


    private final String menuName;

    EMenu(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuName() {
        return menuName;
    }
}