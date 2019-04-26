export class Project {
  projectId:string;
  projectCode: string;
  projectName: string;
  summary: string;


  static cloneBase(project:Project): Project{
    const clonedProject: Project = new Project();
  clonedProject.projectName=project.projectName;
  clonedProject.summary=project.summary;
  clonedProject.projectCode=project.projectCode;
  clonedProject.projectId=project.projectId;

    return clonedProject;
  }
  public getProjectName() :string{
    return this.projectName;
  }

  public getProjectCode() :string{
    return this.projectCode;
  }
  public getSummary():string{
    return this.summary;
  }
}

