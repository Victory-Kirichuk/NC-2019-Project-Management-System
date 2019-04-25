export class UserName {
  name: string;
  surname: string;
  email: string;
  password: string;
  roleId: string;


  static cloneBase(userName: UserName) : UserName{
    const clonedUserName: UserName= new UserName();
   clonedUserName.name=userName.name;
    clonedUserName.surname=userName.surname
    clonedUserName.email=userName.email;
    clonedUserName.password=userName.password;
    clonedUserName.roleId=userName.roleId;

    return clonedUserName;
  }
  public getUserName() :string{
    return this.name, this.surname;
  }
}
