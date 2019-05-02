export class User {
  name: string;
  surname: string;
  email: string;
  password: string;
  role: string;


  static cloneBase(userName: User): User {
    const clonedUserName: User = new User();
    clonedUserName.name = userName.name;
    clonedUserName.surname = userName.surname
    clonedUserName.email = userName.email;
    clonedUserName.password = userName.password;
    clonedUserName.role = userName.role;

    return clonedUserName;
  }

  public getUserName(): string {
    return this.name, this.surname;
  }

  public getPassword(): string {
    return this.password;
  }

  public getRole(): string {
    return this.role;
  }
}
