package com.specbee.cloudflare.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "cloudflare_result")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CloudflareResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public CloudflareResult() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
