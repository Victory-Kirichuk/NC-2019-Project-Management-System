export class UserRole {
 roleId:string;
  role:string;
  static cloneBase(userRole: UserRole) : UserRole{
    const clonedUserRole: UserRole = new UserRole();
    clonedUserRole.roleId = userRole.roleId;
    clonedUserRole.role = userRole.role;
    return clonedUserRole;
  }

  public getRole() :string{
    return this.role;
  }
}
