export class Task {
  taskId: string;
  code: string;
  name: string;
  projectCode: string;
  priorityId: string;
  statusId: string;
  createdDate: string;
  updateDate: string;
  dueDate: string;
  resolvedDate: string;
  closedDate: string;
  estimation: string;
  assignName: string;
  assignSurname: string;
  description: string;
  reporterName: string;
  assign:string;
  reporterSurname: string;
  static cloneBase(task: Task): Task {
    const clonedTask: Task = new Task();
    clonedTask.taskId = task.taskId;
    clonedTask.name = task.name;
    clonedTask.code = task.code;
    clonedTask.projectCode = task.projectCode;
    clonedTask.priorityId = task.priorityId;
    clonedTask.statusId = task.statusId;
    clonedTask.createdDate = task.createdDate;
    clonedTask.updateDate = task.updateDate;
    clonedTask.dueDate = task.dueDate;
    clonedTask.resolvedDate = task.resolvedDate;
    clonedTask.closedDate = task.closedDate;
    clonedTask.assignName = task.assignName;
    clonedTask.reporterName = task.reporterName;
    clonedTask.assignSurname = task.assignSurname;
    clonedTask.reporterSurname = task.reporterSurname;
    clonedTask.estimation = task.estimation;
    clonedTask.description = task.description;
    clonedTask.assign=task.assign;
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
    return this.priorityId;
  }


  public  getStatus():string{
    return this.statusId;
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
