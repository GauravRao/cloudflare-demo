package com.specbee.cloudflare.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.stereotype.Component;

public class Cloudflare {

    private boolean purge_everything;

    public Cloudflare(boolean purge_everything) {
        this.purge_everything = purge_everything;
    }

    public boolean isPurge_everything() {
        return purge_everything;
    }

    public void setPurge_everything(boolean purge_everything) {
        this.purge_everything = purge_everything;
    }
}
