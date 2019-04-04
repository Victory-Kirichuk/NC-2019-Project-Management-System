package com.netcracker.victory.backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "projects", schema = "pms", catalog = "")
public class ProjectsEntity {
    private int projectId;
    private String projectName;
    private String porjectCode;
    private String summary;

    @Id
    @Column(name = "project_id")
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Basic
    @Column(name = "project_name")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Basic
    @Column(name = "porject_code")
    public String getPorjectCode() {
        return porjectCode;
    }

    public void setPorjectCode(String porjectCode) {
        this.porjectCode = porjectCode;
    }

    @Basic
    @Column(name = "summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectsEntity that = (ProjectsEntity) o;

        if (projectId != that.projectId) return false;
        if (projectName != null ? !projectName.equals(that.projectName) : that.projectName != null) return false;
        if (porjectCode != null ? !porjectCode.equals(that.porjectCode) : that.porjectCode != null) return false;
        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectId;
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (porjectCode != null ? porjectCode.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        return result;
    }
}
