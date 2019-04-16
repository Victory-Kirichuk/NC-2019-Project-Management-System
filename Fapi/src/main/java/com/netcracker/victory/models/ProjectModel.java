package com.netcracker.victory.models;


import java.util.Objects;

public class ProjectModel {
    private int projectId;
    private String projectName;
    private String projectCode;
    private String summary;


    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }


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
        ProjectModel projectModel = (ProjectModel) o;
        return projectId == projectModel.projectId &&
                projectName.equals(projectModel.projectName) &&
                projectCode.equals(projectModel.projectCode) &&
                summary.equals(projectModel.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, projectName, projectCode, summary);
    }
}
