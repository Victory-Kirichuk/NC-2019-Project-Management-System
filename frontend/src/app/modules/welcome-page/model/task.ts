export class Task {
  taskId: string;
  code: string;
  name: string;
  projectCode: string;
  priority: string;
  status: string;
  createdDate: string;
  updateDate: string;
  dueDate: string;
  resolvedDate: string;
  closedDate: string;
  estimation: string;
  assign: string;
  description: string;
  reporter: string;

  static cloneBase(task: Task): Task {
    const clonedTask: Task = new Task();
    clonedTask.taskId = task.taskId;
    clonedTask.name = task.name;
    clonedTask.code = task.code;
    clonedTask.projectCode = task.projectCode;
    clonedTask.priority = task.priority;
    clonedTask.status = task.status;
    clonedTask.createdDate = task.createdDate;
    clonedTask.updateDate = task.updateDate;
    clonedTask.dueDate = task.dueDate;
    clonedTask.resolvedDate = task.resolvedDate;
    clonedTask.closedDate = task.closedDate;
    clonedTask.assign = task.assign;
    clonedTask.reporter = task.reporter;
    clonedTask.estimation = task.estimation;
    clonedTask.description = task.description;
    return clonedTask;
  }


  public getName() :string{
    return this.name;
  }

  public  getCode():string{
    return  this.code;
  }
  public  getProjectCode():string{
    return this.projectCode;
  }
  public getPriority(): string{
    return this.priority;
  }


  public  getStatus():string{
    return this.status;
  }
  public  getCreatedDate():string{
    return this.createdDate;
  }

  public  getUpdatedDate():string{
    return this.updateDate;
  }

  public  getResolvedDate():string{
    return this.resolvedDate;
  }
  public  getDueDate():string{
    return this.dueDate;
  }













}
