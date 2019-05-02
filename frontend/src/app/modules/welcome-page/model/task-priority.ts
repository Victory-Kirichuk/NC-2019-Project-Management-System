export class TaskPriority {
  priorityId: string;
  priority: string;

  static cloneBase(priority: TaskPriority): TaskPriority {
    const clonedTaskPriority: TaskPriority = new TaskPriority();
    clonedTaskPriority.priorityId = priority.priorityId;
    clonedTaskPriority.priority = priority.priority;
    return clonedTaskPriority;
  }

  public getPriority(): string {
    return this.priority;
  }
}
