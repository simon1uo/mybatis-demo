package com.mybatis.pojo;

public class Emp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.eid
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    private Integer eid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.emp_name
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    private String empName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.age
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.sex
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.email
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.did
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    private Integer did;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.eid
     *
     * @return the value of emp.eid
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.eid
     *
     * @param eid the value for emp.eid
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.emp_name
     *
     * @return the value of emp.emp_name
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.emp_name
     *
     * @param empName the value for emp.emp_name
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.age
     *
     * @return the value of emp.age
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.age
     *
     * @param age the value for emp.age
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.sex
     *
     * @return the value of emp.sex
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.sex
     *
     * @param sex the value for emp.sex
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.email
     *
     * @return the value of emp.email
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.email
     *
     * @param email the value for emp.email
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.did
     *
     * @return the value of emp.did
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.did
     *
     * @param did the value for emp.did
     *
     * @mbggenerated Wed Mar 09 15:48:38 CST 2022
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", did=" + did +
                '}';
    }

    public Emp(Integer eid, String empName, Integer age, String sex, String email, Integer did) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.did = did;
    }
}