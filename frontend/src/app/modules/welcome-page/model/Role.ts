export class UserRole {
  id:number;
  role:string;
  static cloneBase(userRole: UserRole) : UserRole{
    const clonedUserRole: UserRole = new UserRole();
    clonedUserRole.id = userRole.id;
    clonedUserRole.role = userRole.role;
    return clonedUserRole;
  }

  public getRole() :string{
    return this.role;
  }
}
