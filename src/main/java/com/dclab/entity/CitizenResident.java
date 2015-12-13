package com.dclab.entity;

public class CitizenResident {
    private Integer citizenId;

    private String name;

    private String identificationType;

    private String identificationValue;

    private String marriageStatus;

    private String employmentStatus;

    private String residenceCategory;

    private String residentStatus;

    private String educationStatus;

    private String politicsStatus;

    private String migrationStatus;

    private String incomeStatus;

    private String nation;

    private Integer gender;

    private String relationship;

    private Integer userId;

    private Integer neighbourId;

    private Integer buildingId;

    private Integer apartmentId;

    private Integer age;

    private Integer status;

    private String phone;

    private Integer commId;

    public Integer getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(Integer citizenId) {
        this.citizenId = citizenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType == null ? null : identificationType.trim();
    }

    public String getIdentificationValue() {
        return identificationValue;
    }

    public void setIdentificationValue(String identificationValue) {
        this.identificationValue = identificationValue == null ? null : identificationValue.trim();
    }

    public String getMarriageStatus() {
        return marriageStatus;
    }

    public void setMarriageStatus(String marriageStatus) {
        this.marriageStatus = marriageStatus == null ? null : marriageStatus.trim();
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus == null ? null : employmentStatus.trim();
    }

    public String getResidenceCategory() {
        return residenceCategory;
    }

    public void setResidenceCategory(String residenceCategory) {
        this.residenceCategory = residenceCategory == null ? null : residenceCategory.trim();
    }

    public String getResidentStatus() {
        return residentStatus;
    }

    public void setResidentStatus(String residentStatus) {
        this.residentStatus = residentStatus == null ? null : residentStatus.trim();
    }

    public String getEducationStatus() {
        return educationStatus;
    }

    public void setEducationStatus(String educationStatus) {
        this.educationStatus = educationStatus == null ? null : educationStatus.trim();
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus == null ? null : politicsStatus.trim();
    }

    public String getMigrationStatus() {
        return migrationStatus;
    }

    public void setMigrationStatus(String migrationStatus) {
        this.migrationStatus = migrationStatus == null ? null : migrationStatus.trim();
    }

    public String getIncomeStatus() {
        return incomeStatus;
    }

    public void setIncomeStatus(String incomeStatus) {
        this.incomeStatus = incomeStatus == null ? null : incomeStatus.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship == null ? null : relationship.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNeighbourId() {
        return neighbourId;
    }

    public void setNeighbourId(Integer neighbourId) {
        this.neighbourId = neighbourId;
    }

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getCommId() {
        return commId;
    }

    public void setCommId(Integer commId) {
        this.commId = commId;
    }
}