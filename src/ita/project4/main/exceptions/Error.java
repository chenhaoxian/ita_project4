package ita.project4.main.exceptions;

public enum Error {

    REQUIRED_VALUE(1000, "%s is a required value."),
    INVALID_VALUE(1001, "%s value is invalid");

    private int code;
    private String errorMessageTemplate;

    private Error(int code, String errorMessageTemplate) {
        this.code = code;
        this.errorMessageTemplate = errorMessageTemplate;
    }

    public int getCode() {
        return code;
    }

    public String getErrorMessageTemplate() {
        return this.errorMessageTemplate;
    }
}