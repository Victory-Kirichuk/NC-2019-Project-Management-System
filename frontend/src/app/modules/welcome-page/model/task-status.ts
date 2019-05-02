export class TaskStatus {
  statusId: string;
  status: string;

  static cloneBase(status: TaskStatus): TaskStatus {
    const clonedTaskStatus: TaskStatus = new TaskStatus();
    clonedTaskStatus.statusId = status.statusId;
    clonedTaskStatus.status = status.status;
    return clonedTaskStatus;
  }

  public getStatus(): string {
    return this.status;
  }
}
