package com.cospina.ingecaem.app.models.documents.general;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ic_g_status")
public class Status {
    @Id
    private String id;
    private String code;
    private String description;

    public Status(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public Status() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
