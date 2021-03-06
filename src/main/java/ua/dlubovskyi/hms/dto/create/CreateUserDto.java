package ua.dlubovskyi.hms.dto.create;

import ua.dlubovskyi.hms.entity.Role;

public class CreateUserDto {
    private String firstName;
    private String secondName;
    private String phone;
    private String email;
    private String hospitalId;
    private String departmentId;
    private String countryCode;
    private boolean generatePAss;
    private Role userRole;

    public boolean isGeneratePAss() {
        return generatePAss;
    }

    public void setGeneratePAss(boolean generatePAss) {
        this.generatePAss = generatePAss;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
