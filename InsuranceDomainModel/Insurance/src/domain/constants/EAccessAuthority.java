package domain.constants;


/**
 * 특정 리스트를 열람하거나 수정하기 위해서 필요한 권한 키
 *
 */
public enum EAccessAuthority {
    INSURANCE_LIST,
    USER_LIST,
    SUBSCRIPTION_LIST,
    INSURANCE_ACCIDENT_LIST,
    INSURANCE_DESIGN_LIST,
    STAFF,//직원 기본권한
    CUSTOMER;

    private static final String staffVerifyCode = "staff0";
    public static boolean verifyStaff(String code){
        return code.equals(staffVerifyCode);
    }

}
