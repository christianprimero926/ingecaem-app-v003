package com.cospina.ingecaem.app.models.documents.general;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Document(collection = "ic_g_task")
public class Task {
    @Id
    private String id;
    private String id_ind_plant;
    private String code_type_work;
    private String id_project_manager;
    private String id_status;
    private List<String> operators_assigned;
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date start_date;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date end_date;

    public Task(String id_ind_plant, String code_type_work, String id_project_manager, String id_status, List<String> operators_assigned, String description) {
        this.id_ind_plant = id_ind_plant;
        this.code_type_work = code_type_work;
        this.id_project_manager = id_project_manager;
        this.id_status = id_status;
        this.operators_assigned = operators_assigned;
        this.description = description;
    }

    public Task() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_ind_plant() {
        return id_ind_plant;
    }

    public void setId_ind_plant(String id_ind_plant) {
        this.id_ind_plant = id_ind_plant;
    }

    public String getCode_type_work() {
        return code_type_work;
    }

    public void setCode_type_work(String code_type_work) {
        this.code_type_work = code_type_work;
    }

    public String getId_project_manager() {
        return id_project_manager;
    }

    public void setId_project_manager(String id_project_manager) {
        this.id_project_manager = id_project_manager;
    }

    public String getId_status() {
        return id_status;
    }

    public void setId_status(String id_status) {
        this.id_status = id_status;
    }

    public List<String> getOperators_assigned() {
        return operators_assigned;
    }

    public void setOperators_assigned(List<String> operators_assigned) {
        this.operators_assigned = operators_assigned;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}
