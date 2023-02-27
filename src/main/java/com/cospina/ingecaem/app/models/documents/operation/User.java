package com.cospina.ingecaem.app.models.documents.operation;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document(collection = "ic_o_user")
public class User {
    @Id
    private String id;
    private String codeUser;
    private String codeArea;
    private String nitPlants;
    private String codeTypeContract;
    private String codeMunicipality;
    private String name;
    private String lastName;
    private String idType;
    private String idUser;
    private String phone;
    private String address;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateBirth;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateAdmission;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDeparture;
    private String username;
    private String password;
    private String arl;
    private String compensationOffice;

    public User(String codeUser, String codeArea, String nitPlants, String codeTypeContract, String codeMunicipality, String name, String lastName, String idType, String idUser, String phone, String address, String email, Date dateBirth, String username, String password, String arl, String compensationOffice) {
        this.codeUser = codeUser;
        this.codeArea = codeArea;
        this.nitPlants = nitPlants;
        this.codeTypeContract = codeTypeContract;
        this.codeMunicipality = codeMunicipality;
        this.name = name;
        this.lastName = lastName;
        this.idType = idType;
        this.idUser = idUser;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.dateBirth = dateBirth;
        this.username = username;
        this.password = password;
        this.arl = arl;
        this.compensationOffice = compensationOffice;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(String codeUser) {
        this.codeUser = codeUser;
    }

    public String getCodeArea() {
        return codeArea;
    }

    public void setCodeArea(String codeArea) {
        this.codeArea = codeArea;
    }

    public String getNitPlants() {
        return nitPlants;
    }

    public void setNitPlants(String nitPlants) {
        this.nitPlants = nitPlants;
    }

    public String getCodeTypeContract() {
        return codeTypeContract;
    }

    public void setCodeTypeContract(String codeTypeContract) {
        this.codeTypeContract = codeTypeContract;
    }

    public String getCodeMunicipality() {
        return codeMunicipality;
    }

    public void setCodeMunicipality(String codeMunicipality) {
        this.codeMunicipality = codeMunicipality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Date getDateAdmission() {
        return dateAdmission;
    }

    public void setDateAdmission(Date dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    public Date getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(Date dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getArl() {
        return arl;
    }

    public void setArl(String arl) {
        this.arl = arl;
    }

    public String getCompensationOffice() {
        return compensationOffice;
    }

    public void setCompensationOffice(String compensationOffice) {
        this.compensationOffice = compensationOffice;
    }
}
