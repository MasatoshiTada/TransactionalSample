/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tada
 */
@Entity
@Table(name = "test_entity")
public class TestEntity implements Serializable {
    @Id
    private Integer id;
    private String thrown;
    private String rollbackOn;
    private String dontRoolbackOn;
    private String expected;

    public TestEntity() {
    }

    public TestEntity(Integer id, String thrown, String rollbackOn, String dontRoolbackOn, String expected) {
        this.id = id;
        this.thrown = thrown;
        this.rollbackOn = rollbackOn;
        this.dontRoolbackOn = dontRoolbackOn;
        this.expected = expected;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the rollbackOn
     */
    public String getRollbackOn() {
        return rollbackOn;
    }

    /**
     * @param rollbackOn the rollbackOn to set
     */
    public void setRollbackOn(String rollbackOn) {
        this.rollbackOn = rollbackOn;
    }

    /**
     * @return the dontRoolbackOn
     */
    public String getDontRoolbackOn() {
        return dontRoolbackOn;
    }

    /**
     * @param dontRoolbackOn the dontRoolbackOn to set
     */
    public void setDontRoolbackOn(String dontRoolbackOn) {
        this.dontRoolbackOn = dontRoolbackOn;
    }

    /**
     * @return the expected
     */
    public String getExpected() {
        return expected;
    }

    /**
     * @param expected the expected to set
     */
    public void setExpected(String expected) {
        this.expected = expected;
    }

    /**
     * @return the thrown
     */
    public String getThrown() {
        return thrown;
    }

    /**
     * @param thrown the thrown to set
     */
    public void setThrown(String thrown) {
        this.thrown = thrown;
    }

}
