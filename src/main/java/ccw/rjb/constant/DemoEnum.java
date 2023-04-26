package ccw.rjb.constant;

/**
 * @author 陈翔
 */
public enum DemoEnum {
    /**
     * 老师
     */
    TEACHER(1),

    /**
     * 学生
     */
    STUDENT(2),
    ;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    private Integer code;

    DemoEnum(Integer code) {
        this.code = code;
    }

    public static DemoEnum get(Integer code) {
        for (DemoEnum ele : values()) {
            if (ele.getCode().equals(code)) {
                return ele;
            }
        }
        return null;
    }
}
