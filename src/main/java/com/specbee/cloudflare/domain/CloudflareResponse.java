package com.specbee.cloudflare.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.stereotype.Component;

import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "cloudflare_response")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CloudflareResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private CloudflareResult result;

    private String success;

    private String[] errors;

    private String[] messages;

    public CloudflareResponse(CloudflareResult result, String success, String[] errors, String[] messages) {
        this.result = result;
        this.success = success;
        this.errors = errors;
        this.messages = messages;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public CloudflareResult getResult() {
        return result;
    }

    public void setResult(CloudflareResult result) {
        this.result = result;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String[] getErrors() {
        return errors;
    }

    public void setErrors(String[] errors) {
        this.errors = errors;
    }

    public String[] getMessages() {
        return messages;
    }

    public void setMessages(String[] messages) {
        this.messages = messages;
    }
}
