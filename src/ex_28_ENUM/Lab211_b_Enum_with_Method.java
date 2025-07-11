package ex_28_ENUM;

public class Lab211_b_Enum_with_Method {
    public static void main(String[] args) {
        Status status = Status.SUCCESS;
        System.out.println(status);
        System.out.println(Status.SUCCESS.getCode()); // 200

        Status status_E = Status.ERROR;
        System.out.println(status_E);
        System.out.println(Status.ERROR.getCode()); // 500
    }
}

enum Status {
    SUCCESS(200), ERROR(500);

    private final int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}