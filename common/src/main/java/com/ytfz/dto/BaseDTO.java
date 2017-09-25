package com.ytfz.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import java.util.Date;

/**
 * Created by XY on 2017/9/7 18:55.
 */
public class BaseDTO {
    private Long version = 1L;
    @JsonIgnore
    @Column
    private Long createdBy;
    @JsonIgnore
    @Column
    private Date createdOn = new Date();
    @JsonIgnore
    @Column
    private Long modifiedBy;
    @JsonIgnore
    @Column
    private Date modifiedOn = new Date();
    
    public Long getVersion() {
        return version;
    }
    
    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    @Override
    public String toString() {
        return "BaseDTO{" +
                "version=" + version +
                ", createdBy=" + createdBy +
                ", createdOn=" + createdOn +
                ", modifiedBy=" + modifiedBy +
                ", modifiedOn=" + modifiedOn +
                '}';
    }
}
