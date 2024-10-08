package com.crud.card.ms_card.model;

import lombok.Data;

@Data
public class ServiceResponse {

    Boolean success;
    String message;

    public ServiceResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ServiceResponse() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
