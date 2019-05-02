export class TaskProjectCode {
  projectCode: string;
  projectId: string;

  static cloneBase(taskProjectCode: TaskProjectCode): TaskProjectCode {
    const clonedTaskProjectCode: TaskProjectCode = new TaskProjectCode();
    clonedTaskProjectCode.projectId = taskProjectCode.projectId;
    clonedTaskProjectCode.projectCode = taskProjectCode.projectCode;
    return clonedTaskProjectCode;
  }

  public getProjectCode(): string {
    return this.projectCode;
  }
}
