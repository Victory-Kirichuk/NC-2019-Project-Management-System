package com.netcracker.victory.models;


import java.util.Objects;

public class Project {
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
        Project project = (Project) o;
        return projectId == project.projectId &&
                projectName.equals(project.projectName) &&
                projectCode.equals(project.projectCode) &&
                summary.equals(project.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, projectName, projectCode, summary);
    }
}
