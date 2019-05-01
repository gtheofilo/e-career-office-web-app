package com.careeroffice.model;

/**
 * Represents all users of our application.
 */
public class User {

    /**
     * The username representing this user.
     */
    private String username;

    /**
     * The password of the user.
     */
    private String password;

    /**
     * The first name of this user.
     */
    private String name;

    /**
     * The last name of this user.
     */
    private String surname;

    /**
     * The phone_number of this user.
     */
    private String phoneNumber;

    /**
     * The email of this user.
     */
    private String email;

    /**
     * The role of this user.
     */
    private String roleId;
    private Role role;

    private String companyId;
    private Company company;
    private String departmentId;
    private Department department;

    /**
     * Creates a new User.
     *
     * @param username    The username of the user.
     * @param password    The password of the user.
     * @param name        The name of the user.
     * @param surname     The surname of the user.
     * @param phoneNumber The phone number of the user.
     * @param email       The email of the user.
     * @param roleId      The role of the user.
     */
    public User(String username, String password, String name,
                String surname, String phoneNumber, String email, String roleId,
                String companyId, String departmentId) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.roleId = roleId;
        this.companyId = companyId;
        this.departmentId = departmentId;
    }

    public User(String username, String password, String name,
                String surname, String phoneNumber, String email, String roleId) {
        this(username, password, name, surname, phoneNumber, email, roleId, null, null);
    }

    /**
     * Get the username of this user.
     *
     * @return The username representing this user.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the username of this user.
     *
     * @param username The new username.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get the password of the user.
     *
     * @return The password of the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the password of this user.
     *
     * @param password The new password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the first name of this user.
     *
     * @return The first name of this user.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the first name of this user.
     *
     * @param name The new first name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the last name of this user.
     *
     * @return The last name of this user.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set the last name of this user.
     *
     * @param surname The new last name.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Get the last name of this user.
     *
     * @return The last name of this user.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the last name of this user.
     *
     * @param phoneNumber The new last name.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Get the last name of this user.
     *
     * @return The last name of this user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the last name of this user.
     *
     * @param email The new last name.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the role of the user.
     *
     * @return The role of the user.
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * Set the role of the user.
     *
     * @param roleId The new role of the user.
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean hasExternalRole() {
        return roleId.equals(Role.External);
    }

    /**
     * Returns the full name of the user.
     *
     * @return The first and last name of the user combined.
     */
    public String getFullName() {
        return name + " " + surname;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * Overrides toString() method.
     *
     * @return Returns a string containing all properties of this user.
     */
    public String toString() {
        return "[User] username: " + username + ", password: ****, name: " + name + ", surname: "
                + surname + ", phone number: " + phoneNumber + " email: " + email + "  role id: "
                + roleId;
    }
}
